package io.github.cauzy_goes.convidados;

public class Convidado {
    private String nome;
    private String cpf;

    public Convidado(String nome , String cpf) {
        this.cpf = cpf;
        this.nome = nome;
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
