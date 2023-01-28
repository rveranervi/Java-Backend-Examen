package pe.sermed.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.sermed.backend.mapper.AppointmentMapper;
import pe.sermed.backend.mapper.DoctorMapper;
import pe.sermed.backend.model.dto.AppointmentDTO;
import pe.sermed.backend.model.entity.Appointment;
import pe.sermed.backend.model.entity.Doctor;
import pe.sermed.backend.repository.AppointmentRepository;
import pe.sermed.backend.service.AppointmentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository repository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AppointmentDTO> listAll(int status) {
        List<Appointment> lista = null;
        Set<Integer> statements = Set.of(0,1,2,3,4);
        if(statements.contains(status)) {
            lista = repository.findByStatus(status);
        }
        else{
            lista = repository.findAll();
        }
        return AppointmentDTO.getAppointmentDtoList(lista);
    }

    @Override
    public AppointmentDTO getOne(int id) {
        Appointment appointment = repository.findById(id).orElse(new Appointment());
        return AppointmentMapper.INSTANCE.convierteEntityToDto(appointment);
    }

    @Override
    public AppointmentDTO save(AppointmentDTO appointment) {
        Appointment tmp = repository.save(AppointmentMapper.INSTANCE.convierteDtoToEntity(appointment));
        return AppointmentMapper.INSTANCE.convierteEntityToDto(tmp);
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        repository.deleteById(id);
        return exist;
    }
}
