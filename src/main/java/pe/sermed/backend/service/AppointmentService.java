package pe.sermed.backend.service;

import pe.sermed.backend.model.dto.AppointmentDTO;

import java.util.List;

public interface AppointmentService {

    List<AppointmentDTO> listAll(int status);
    AppointmentDTO getOne(int id);
    AppointmentDTO save(AppointmentDTO appointment);
    boolean delete(int id);

}
