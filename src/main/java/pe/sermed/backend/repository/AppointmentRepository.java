package pe.sermed.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.sermed.backend.model.entity.Appointment;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    List<Appointment> findByStatus(int status);

}
