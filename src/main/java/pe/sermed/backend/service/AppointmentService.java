package pe.sermed.backend.service;

import pe.sermed.backend.model.dto.AppointmentDTO;

import java.util.List;

public interface AppointmentService {

    List<AppointmentDTO> listAll();

}
