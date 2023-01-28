package pe.sermed.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.sermed.backend.model.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
