package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private int nif;
    private List<Conta> listaContas;

    // construtor
    public Cliente(int id, String nome, String email, int nif) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nif = nif;
        this.listaContas = new ArrayList<>();
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

    public List<Conta> getListaContas() {
        return listaContas;
    }

    // metodo para adicionar uma conta ao cliente
    public void adicionarConta(Conta conta){
        listaContas.add(conta);
    }

    // metodo para listar todas as contas do cliente
    public void listarContas(){
        for(Conta c: listaContas){
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nif=" + nif +
                ", listaContas=" + listaContas +
                '}';
    }
}
