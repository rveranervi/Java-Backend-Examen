package pe.sermed.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.sermed.backend.model.dto.SpecialityDTO;
import pe.sermed.backend.model.entity.Speciality;
import pe.sermed.backend.repository.SpecialityRepository;
import pe.sermed.backend.service.SpecialityService;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    private SpecialityRepository repository;

    @Autowired
    public SpecialityServiceImpl(SpecialityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SpecialityDTO> listAll() {
        List<Speciality> lista = repository.findAll();
        return SpecialityDTO.getSpecialistDtoList(lista);
    }
}
