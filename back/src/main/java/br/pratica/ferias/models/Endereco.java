package br.pratica.ferias.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Endereco extends BaseEntity {

    @Column(nullable = false, length = 10)
    private String numero;

    @Enumerated(EnumType.STRING)
    private Logradouro tipo;

    @Column(nullable = false, length = 40)
    private String bairro;

    public Endereco() {
        super();
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Logradouro getTipo() {
        return this.tipo;
    }

    public void setTipo(Logradouro tipo) {
        this.tipo = tipo;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    @Override
    public Long getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }
    
}
