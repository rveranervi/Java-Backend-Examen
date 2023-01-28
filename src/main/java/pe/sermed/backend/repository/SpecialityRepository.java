package pe.sermed.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.sermed.backend.model.entity.Speciality;

public interface SpecialityRepository extends JpaRepository<Speciality, Integer> {
}
