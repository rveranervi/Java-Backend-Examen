package pe.sermed.backend.service;

import pe.sermed.backend.model.dto.SpecialityDTO;

import java.util.List;

public interface SpecialityService {

    List<SpecialityDTO> listAll();
    SpecialityDTO getOne(int id);
    SpecialityDTO save(SpecialityDTO speciality);
    boolean delete(int id);

}
