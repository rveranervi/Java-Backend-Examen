package pe.sermed.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.sermed.backend.mapper.AppointmentMapper;
import pe.sermed.backend.model.entity.Appointment;
import pe.sermed.backend.model.entity.Doctor;
import pe.sermed.backend.model.entity.Patient;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {

    private int code;
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String hour;
    private int status;

    public static List<AppointmentDTO> getAppointmentDtoList(List<Appointment> list) {
        return AppointmentMapper.INSTANCE.convierteListEntityToDto(list);
    }

}
