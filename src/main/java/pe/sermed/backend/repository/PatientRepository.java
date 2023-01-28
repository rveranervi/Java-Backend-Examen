package pe.sermed.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.sermed.backend.model.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
