package pe.sermed.backend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "speciality")
public class Speciality {

    @Id
    @Column(name = "spec_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @Column(name = "spec_name", length = 50)
    private String name;

    @Column(name = "spec_status")
    private boolean status;

}
