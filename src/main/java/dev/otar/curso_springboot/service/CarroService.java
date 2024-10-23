package dev.otar.curso_springboot.service;

import dev.otar.curso_springboot.entity.Carro;
import dev.otar.curso_springboot.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService implements ICarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Override
    public List<Carro> listarCarros() {
        return carroRepository.findAll();
    }
}
