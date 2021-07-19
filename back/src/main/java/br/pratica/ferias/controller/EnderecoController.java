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

import br.pratica.ferias.models.Endereco;
import br.pratica.ferias.service.EnderecoService;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @GetMapping
    public List<Endereco> listaEndereco() {
        return service.listarEndereco();
    }

    @GetMapping("/{id}")
    public Endereco obterEnderecoPeloId(@PathVariable("id") Long id) {
        return service.obterPeloId(id);
    }

    @PostMapping
    public Long salvarEndereco(@RequestBody Endereco novo) {
        return service.salvarEndereco(novo).getId();
    }

    @DeleteMapping("/{id}")
    public void deletarEndereco(@PathVariable("id") Long id) {
        service.deletarPeloId(id);
    }
}
