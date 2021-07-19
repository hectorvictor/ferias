package br.pratica.ferias.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pratica.ferias.models.Endereco;

@Service
@Transactional
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository repo;

    public List<Endereco> listarEndereco() {
        return repo.findAll();
    }

    public Endereco salvarEndereco(Endereco novo) {
        return repo.save(novo);
        
    }

    public Endereco obterPeloId(Long id) {
        return repo.findById(id).get();
    }

    public void deletarPeloId(Long id) {
         repo.deleteById(id);
    }
}
