package pe.sermed.backend.controller.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {
    @GetMapping
    public ModelAndView mostrarIndex() {
        ModelAndView mv = new ModelAndView("index");
        //mv.addObject("listaCategorias", categoriaService.listarTodos());
        return mv;
    }
}
