package br.pratica.ferias.service;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pratica.ferias.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
