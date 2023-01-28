package pe.sermed.backend.controller.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.sermed.backend.model.dto.DoctorDTO;
import pe.sermed.backend.service.AppointmentService;
import pe.sermed.backend.service.DoctorService;
import pe.sermed.backend.service.PatientService;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("")
public class HomeController {

    private DoctorService doctorService;
    private PatientService patientService;
    private AppointmentService appointmentService;

    public HomeController(DoctorService doctorService,
                          PatientService patientService,
                          AppointmentService appointmentService){
        this.doctorService = doctorService;
        this.patientService = patientService;
        this.appointmentService = appointmentService;
    }

    @GetMapping("/")
    public String showAll(Model model) {
        String[] statements = {"Pendiente","Agendado","Finalizado","Reprogramado","Cancelada"};
        model.addAttribute("doctors", doctorService.listAll(-1));
        model.addAttribute("patients", patientService.listAll());
        model.addAttribute("appointments", appointmentService.listAll(-1));
        model.addAttribute("statements", statements);
        return "index";
    }
}
