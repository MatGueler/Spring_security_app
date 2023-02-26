package com.example.security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerSecurity {

    @GetMapping("/entrar")
    public String entrar() {
        return "entrar";
    }

    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/projetos")
    public String projetos() {
        return "projetos";
    }

    @GetMapping("/relatorio-custos")
    public String relatorioCustos() {
        return "relatorio-custos";
    }

    @GetMapping("/relatorio-equipe")
    public String relatorioEquipe() {
        return "relatorio-equipe";
    }

}