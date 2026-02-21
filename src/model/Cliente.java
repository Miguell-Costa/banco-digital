package model;

import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private int nif;
    private List<Conta> contas;

    // construtor
    public Cliente(int id, String nome, String email, int nif, List<Conta> contas) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nif = nif;
        this.contas = contas;
    }

    // getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void Conta(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nif=" + nif +
                ", contas=" + contas +
                '}';
    }
}
