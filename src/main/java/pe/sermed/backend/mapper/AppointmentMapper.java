package pe.sermed.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.sermed.backend.model.dto.AppointmentDTO;
import pe.sermed.backend.model.entity.Appointment;

import java.util.List;

@Mapper
public interface AppointmentMapper {

    AppointmentMapper INSTANCE = Mappers.getMapper(AppointmentMapper.class);

    Appointment convierteDtoToEntity(AppointmentDTO dto);

    AppointmentDTO convierteEntityToDto(Appointment entity);

    List<Appointment> convierteListDtoToEntity(List<AppointmentDTO> list);

    List<AppointmentDTO> convierteListEntityToDto(List<Appointment> list);

}
