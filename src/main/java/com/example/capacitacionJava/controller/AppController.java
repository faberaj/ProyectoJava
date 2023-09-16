package com.example.capacitacionJava.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {


    @GetMapping("/contacto")
    public String mostrarPaginaContacto() {
        return "contacto";
    }

    @GetMapping("/proyectos")
    public String mostrarHabilidades(Model model) {
        List<Habilidad> habilidades = obtenerHabilidades();
        model.addAttribute("habilidades", habilidades);

        return "proyectos";
    }


    @GetMapping("/index")
    public String index(Model model) {
        List<Habilidad> habilidades = obtenerHabilidades();
        model.addAttribute("habilidades", habilidades);
        return "index";
    }


    private List<Habilidad> obtenerHabilidades() {
        List<Habilidad> habilidades = new ArrayList<>();

        habilidades.add(new Habilidad("Programación Java", "Avanzado", "5 años", "Desarrollo de aplicaciones Java."));
        habilidades.add(new Habilidad("HTML/CSS", "Intermedio", "3 años", "Diseño y desarrollo web."));
        habilidades.add(new Habilidad("JavaScript", "Intermedio", "2 años", "Desarrollo de scripts y aplicaciones web interactivas."));
        habilidades.add(new Habilidad("SqlServer", "Avanzado", "2 años", "Desarrollo de scripts y optimizacion de consultas"));
        habilidades.add(new Habilidad("Power BI", "Avanzado", "2 años", "Desarrollo de tableros interactivos"));

        return habilidades;
    }

}
