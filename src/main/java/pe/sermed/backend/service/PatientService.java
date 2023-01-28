package pe.sermed.backend.service;

import pe.sermed.backend.model.dto.PatientDTO;

import java.util.List;

public interface PatientService {

    List<PatientDTO> listAll();
    PatientDTO getOne(int id);
    PatientDTO save(PatientDTO patient);
    boolean delete(int id);

}
