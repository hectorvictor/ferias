package br.pratica.ferias.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pratica.ferias.models.Aluno;

@Service
@Transactional
public class AlunoService {
    
    @Autowired
    private AlunoRepository repo;

    public List<Aluno> listarAluno() {
        return repo.findAll();
    }

    public Aluno salvarAluno(Aluno novo) {
        return repo.save(novo);
        
    }

    public Aluno obterPeloId(Long id) {
        return repo.findById(id).get();
    }

    public void deletarPeloId(Long id) {
         repo.deleteById(id);
    }
}
