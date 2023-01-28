package pe.sermed.backend.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.sermed.backend.model.dto.AppointmentDTO;
import pe.sermed.backend.model.generic.ResponseGeneric;
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
        return ResponseEntity.ok(service.listAll(-1));
    }

    @GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppointmentDTO> getOne(@PathVariable int id) {
        return ResponseEntity.ok(service.getOne(id));
    }

    @PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppointmentDTO> insert(@RequestBody AppointmentDTO appointment) {
        return ResponseEntity.ok(service.save(appointment));
    }

    @PutMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppointmentDTO> update(@PathVariable int id, @RequestBody AppointmentDTO appointment) {
        appointment.setCode(id);
        return ResponseEntity.ok(service.save(appointment));
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
