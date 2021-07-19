package br.pratica.ferias.service;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pratica.ferias.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
