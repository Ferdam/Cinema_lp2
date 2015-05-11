package com.br.lp2.cinema.model.javabeans;

/**
 *
 * @author Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
 */
public class Usuario {

    private String nome,senha, papel;

    public Usuario() {
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(String nome, String senha, String papel) {
        this.nome = nome;
        this.senha = senha;
        this.papel = papel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", senha=" + senha + '}';
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    
    
    
}
