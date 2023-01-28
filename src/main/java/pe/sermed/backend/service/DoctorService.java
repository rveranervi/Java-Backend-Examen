package pe.sermed.backend.service;

import pe.sermed.backend.model.dto.DoctorDTO;

import java.util.List;

public interface DoctorService {

    List<DoctorDTO> listAll(int status);
    DoctorDTO getOne(int id);
    DoctorDTO save(DoctorDTO doctor);
    boolean delete(int id);

}
