package pe.sermed.backend.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.sermed.backend.model.dto.PatientDTO;
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

}
