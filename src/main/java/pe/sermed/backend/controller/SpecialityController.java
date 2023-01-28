package pe.sermed.backend.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.sermed.backend.model.dto.SpecialityDTO;
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

}
