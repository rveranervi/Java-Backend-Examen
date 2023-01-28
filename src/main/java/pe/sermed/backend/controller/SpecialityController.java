package pe.sermed.backend.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.sermed.backend.model.dto.SpecialityDTO;
import pe.sermed.backend.model.generic.ResponseGeneric;
import pe.sermed.backend.service.SpecialityService;

import java.util.List;

@RestController
@RequestMapping(value = "/specialities")
public class SpecialityController {

    private SpecialityService service;

    public SpecialityController(SpecialityService service){
        this.service = service;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SpecialityDTO>> getAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SpecialityDTO> getOne(@PathVariable int id) {
        return ResponseEntity.ok(service.getOne(id));
    }

    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SpecialityDTO> insert(@RequestBody SpecialityDTO speciality) {
        return ResponseEntity.ok(service.save(speciality));
    }

    @PutMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SpecialityDTO> update(@PathVariable int id, @RequestBody SpecialityDTO speciality) {
        speciality.setCode(id);
        return ResponseEntity.ok(service.save(speciality));
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
