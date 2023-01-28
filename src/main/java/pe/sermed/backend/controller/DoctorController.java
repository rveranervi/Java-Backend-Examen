package pe.sermed.backend.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.sermed.backend.model.dto.DoctorDTO;
import pe.sermed.backend.model.generic.ResponseGeneric;
import pe.sermed.backend.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorController {

    private DoctorService service;

    public DoctorController(DoctorService service){
        this.service = service;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DoctorDTO>> getAll(@RequestParam(required = false, defaultValue = "-1") int status) {
        return ResponseEntity.ok(service.listAll(status));
    }

    @GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DoctorDTO> getOne(@PathVariable int id) {
        return ResponseEntity.ok(service.getOne(id));
    }

    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DoctorDTO> insert(@RequestBody DoctorDTO doctor) {
        return ResponseEntity.ok(service.save(doctor));
    }

    @PutMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DoctorDTO> update(@PathVariable int id, @RequestBody DoctorDTO doctor) {
        doctor.setCode(id);
        return ResponseEntity.ok(service.save(doctor));
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseGeneric> delete(@PathVariable int id) {
        ResponseGeneric generic = new ResponseGeneric();
        if(service.delete(id)){
            generic.setMessage("Se elimino correctamente");
        }
        else{
            generic.setMessage("El elmento no existe");
        }
        return ResponseEntity.ok(generic);
    }

}
