package pe.sermed.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.sermed.backend.mapper.PatientMapper;
import pe.sermed.backend.model.entity.Patient;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {

    private int code;
    private String name;
    private String lastname;

    public static List<PatientDTO> getPatientDtoList(List<Patient> list) {
        return PatientMapper.INSTANCE.convierteListEntityToDto(list);
    }

}
