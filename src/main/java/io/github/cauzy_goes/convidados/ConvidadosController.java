package io.github.cauzy_goes.convidados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*") //permite que essa api receba requisição de outro domínios
public class ConvidadosController {

    @Autowired
    ConvidadosRepository convidadosRepository;

    @GetMapping
    public List<Convidado> getConvidados() {
        return convidadosRepository.findAll();
    }
}
