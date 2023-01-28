package pe.sermed.backend.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.sermed.backend.mapper.DoctorMapper;
import pe.sermed.backend.model.dto.DoctorDTO;
import pe.sermed.backend.model.entity.Doctor;
import pe.sermed.backend.repository.DoctorRepository;
import pe.sermed.backend.service.DoctorService;

import java.util.List;

@Service
@Log4j2
public class DoctorServiceImpl implements DoctorService {

    private DoctorRepository repository;

    @Autowired
    public DoctorServiceImpl(DoctorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DoctorDTO> listAll(int status) {
        List<Doctor> lista = null;
        if(status == 0 || status == 1) {
            lista = repository.findByStatus(status == 1);
        }
        else{
            lista = repository.findAll();
        }
        return DoctorDTO.getDoctorDtoList(lista);
    }

    @Override
    public DoctorDTO getOne(int id) {
        Doctor doctor = repository.findById(id).orElse(new Doctor());
        return DoctorMapper.INSTANCE.convierteEntityToDto(doctor);
    }

    @Override
    public DoctorDTO save(DoctorDTO doctor) {
        Doctor tmp = repository.save(DoctorMapper.INSTANCE.convierteDtoToEntity(doctor));
        return DoctorMapper.INSTANCE.convierteEntityToDto(tmp);
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        repository.deleteById(id);
        return exist;
    }
}
