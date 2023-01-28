package pe.sermed.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.sermed.backend.model.dto.AppointmentDTO;
import pe.sermed.backend.model.entity.Appointment;
import pe.sermed.backend.repository.AppointmentRepository;
import pe.sermed.backend.service.AppointmentService;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository repository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AppointmentDTO> listAll() {
        List<Appointment> lista = repository.findAll();
        return AppointmentDTO.getAppointmentDtoList(lista);
    }
}
