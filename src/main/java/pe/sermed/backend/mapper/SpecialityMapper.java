package pe.sermed.backend.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.sermed.backend.model.dto.SpecialityDTO;
import pe.sermed.backend.model.entity.Speciality;

@Mapper
public interface SpecialityMapper {

    SpecialityMapper INSTANCE = Mappers.getMapper(SpecialityMapper.class);

    Speciality convierteDtoToEntity(SpecialityDTO dto);

    SpecialityDTO convierteEntityToDto(Speciality entity);

    List<Speciality> convierteListDtoToEntity(List<SpecialityDTO> list);

    List<SpecialityDTO> convierteListEntityToDto(List<Speciality> list);

}
