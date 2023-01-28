package pe.sermed.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.sermed.backend.model.dto.DoctorDTO;
import pe.sermed.backend.model.entity.Doctor;

import java.util.List;

@Mapper
public interface DoctorMapper {

    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    Doctor convierteDtoToEntity(DoctorDTO dto);

    DoctorDTO convierteEntityToDto(Doctor entity);

    List<Doctor> convierteListDtoToEntity(List<DoctorDTO> list);

    List<DoctorDTO> convierteListEntityToDto(List<Doctor> list);

}
