package pe.sermed.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.sermed.backend.mapper.DoctorMapper;
import pe.sermed.backend.model.entity.Doctor;
import pe.sermed.backend.model.entity.Speciality;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {

    private int code;
    private Speciality speciality;
    private String name;
    private String lastname;
    private boolean status;

    public static List<DoctorDTO> getDoctorDtoList(List<Doctor> list) {
        return DoctorMapper.INSTANCE.convierteListEntityToDto(list);
    }

}
