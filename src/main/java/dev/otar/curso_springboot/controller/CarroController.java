package dev.otar.curso_springboot.controller;

import dev.otar.curso_springboot.entity.Carro;
import dev.otar.curso_springboot.service.ICarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/carros")
public class CarroController {

    @Autowired
    private ICarroService carroService;

    @GetMapping("all")
    public List<Carro> listarCarros() {
        return carroService.listarCarros();
    }

}
