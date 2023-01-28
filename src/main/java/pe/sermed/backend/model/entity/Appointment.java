package pe.sermed.backend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "appointment")
@NoArgsConstructor
public class Appointment {

    @Id
    @Column(name = "appo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @OneToOne
    @JoinColumn(name = "appo_doctor", referencedColumnName = "doct_id")
    private Doctor doctor;

    @OneToOne
    @JoinColumn(name = "appo_patient", referencedColumnName = "pati_id")
    private Patient patient;

    @Column(name = "appo_date", length = 16)
    private String date;

    @Column(name = "appo_hour", length = 10)
    private String hour;

    @Column(name = "appo_status")
    private int status;

}
