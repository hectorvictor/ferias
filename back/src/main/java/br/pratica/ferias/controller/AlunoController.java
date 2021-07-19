package br.pratica.ferias.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pratica.ferias.models.Aluno;
import br.pratica.ferias.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
    
    @Autowired
    private AlunoService service;

    @GetMapping
    public List<Aluno> listaAluno() {
        return service.listarAluno();
    }

    @GetMapping("/{id}")
    public Aluno obterIdAluno(@PathVariable("id") Long id) {
        return service.obterPeloId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable("id") Long id) {
        service.deletarPeloId(id);
    }

    @PostMapping
    public Long salvarAluno(@RequestBody Aluno novo) {
        return service.salvarAluno(novo).getId();
    }
}
