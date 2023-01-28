package pe.sermed.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.sermed.backend.model.entity.Doctor;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    List<Doctor> findByStatus(boolean status);

}
