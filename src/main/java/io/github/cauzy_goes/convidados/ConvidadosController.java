package io.github.cauzy_goes.convidados;

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

    @GetMapping
    public List<Convidado> getConvidados() {
        List<Convidado> lista = new ArrayList<Convidado>();
        lista.add(new Convidado("Fulano","01234456789"));
        lista.add(new Convidado("Cicrano","0987654321"));
        return lista;
    }
}
