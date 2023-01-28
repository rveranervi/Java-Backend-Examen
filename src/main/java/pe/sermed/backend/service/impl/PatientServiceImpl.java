package pe.sermed.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.sermed.backend.model.dto.PatientDTO;
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
}
