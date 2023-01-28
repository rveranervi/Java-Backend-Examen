package pe.sermed.backend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "patient")
@NoArgsConstructor
public class Patient {

    @Id
    @Column(name = "pati_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @Column(name = "pati_name", length = 50)
    private String name;

    @Column(name = "pati_lastname", length = 50)
    private String lastname;

}
