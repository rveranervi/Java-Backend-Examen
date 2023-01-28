package pe.sermed.backend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "doctor")
@NoArgsConstructor
public class Doctor {

    @Id
    @Column(name = "doct_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @OneToOne
    @JoinColumn(name = "doct_spec_id", referencedColumnName = "spec_id")
    private Speciality speciality;

    @Column(name = "doct_name", length = 50)
    private String name;

    @Column(name = "doct_lastname", length = 50)
    private String lastname;

    @Column(name = "doct_status")
    private boolean status;

}
