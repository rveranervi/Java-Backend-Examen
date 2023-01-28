package pe.sermed.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.sermed.backend.mapper.AppointmentMapper;
import pe.sermed.backend.mapper.PatientMapper;
import pe.sermed.backend.model.dto.PatientDTO;
import pe.sermed.backend.model.entity.Appointment;
import pe.sermed.backend.model.entity.Patient;
import pe.sermed.backend.repository.PatientRepository;
import pe.sermed.backend.service.PatientService;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository repository;

    @Autowired
    public PatientServiceImpl(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PatientDTO> listAll() {
        List<Patient> lista = repository.findAll();
        return PatientDTO.getPatientDtoList(lista);
    }

    @Override
    public PatientDTO getOne(int id) {
        Patient patient = repository.findById(id).orElse(new Patient());
        return PatientMapper.INSTANCE.convierteEntityToDto(patient);
    }

    @Override
    public PatientDTO save(PatientDTO patient) {
        Patient tmp = repository.save(PatientMapper.INSTANCE.convierteDtoToEntity(patient));
        return PatientMapper.INSTANCE.convierteEntityToDto(tmp);
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        repository.deleteById(id);
        return exist;
    }
}
