package pe.sermed.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.sermed.backend.mapper.SpecialityMapper;
import pe.sermed.backend.model.entity.Speciality;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpecialityDTO {

    private int code;
    private String name;
    private boolean status;

    public static List<SpecialityDTO> getSpecialistDtoList(List<Speciality> list) {
        return SpecialityMapper.INSTANCE.convierteListEntityToDto(list);
    }

}
