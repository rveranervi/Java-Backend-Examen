package pe.sermed.backend.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.sermed.backend.model.dto.PatientDTO;
import pe.sermed.backend.model.generic.ResponseGeneric;
import pe.sermed.backend.service.PatientService;

import java.util.List;

@RestController
@RequestMapping(value = "/patients")
public class PatientController {

    private PatientService service;

    public PatientController(PatientService service){
        this.service = service;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PatientDTO>> getAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PatientDTO> getOne(@PathVariable int id) {
        return ResponseEntity.ok(service.getOne(id));
    }

    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PatientDTO> insert(@RequestBody PatientDTO patient) {
        return ResponseEntity.ok(service.save(patient));
    }

    @PutMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PatientDTO> update(@PathVariable int id, @RequestBody PatientDTO patient) {
        patient.setCode(id);
        return ResponseEntity.ok(service.save(patient));
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
