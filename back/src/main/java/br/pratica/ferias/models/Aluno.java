package br.pratica.ferias.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aluno extends BaseEntity {
    
    @Column(nullable = false, length = 10)
    private int idade;

    @ManyToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private Endereco endereco;

    public Aluno() {
        super();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

   
}
