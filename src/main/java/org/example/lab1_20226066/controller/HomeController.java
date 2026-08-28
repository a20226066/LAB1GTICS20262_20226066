package org.example.lab1_20226066.controller;

import org.example.lab1_20226066.model.Equipo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class HomeController {

    @GetMapping("registroEquipo")
    public String form() {
        return "registroEquipo";
    }

    @PostMapping("/registroEquipo/requestparam")
    public String requestParam(
            @RequestParam String nombreEquipo,
            @RequestParam String tipoEquipo,
            @RequestParam Integer codigo,
            @RequestParam LocalDate fecha,
            Model model) {

        model.addAttribute("modo", "@RequestParam");
        model.addAttribute("resultado",
                "nombreEquipo=" + nombreEquipo + ", tipoEquipo=" + tipoEquipo + ", codigo=" + codigo + ", fecha=" + fecha);
        return "result";
    }
}
