package io.github.cauzy_goes.convidados;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Convidado {
    @Id
    @Column
    private String cpf;
    @Column
    private String nome;

    public Convidado(String nome , String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Convidado() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
