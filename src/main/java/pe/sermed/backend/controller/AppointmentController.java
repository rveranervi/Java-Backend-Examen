package pe.sermed.backend.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.sermed.backend.model.dto.AppointmentDTO;
import pe.sermed.backend.service.AppointmentService;

import java.util.List;

@RestController
@RequestMapping(value = "/appointments")
public class AppointmentController {

    private AppointmentService service;

    public AppointmentController(AppointmentService service){
        this.service = service;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AppointmentDTO>> getAll() {
        return ResponseEntity.ok(service.listAll());
    }

}
