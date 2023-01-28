package pe.sermed.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.sermed.backend.model.dto.PatientDTO;
import pe.sermed.backend.model.entity.Patient;

import java.util.List;

@Mapper
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    Patient convierteDtoToEntity(PatientDTO dto);

    PatientDTO convierteEntityToDto(Patient entity);

    List<Patient> convierteListDtoToEntity(List<PatientDTO> list);

    List<PatientDTO> convierteListEntityToDto(List<Patient> list);

}
