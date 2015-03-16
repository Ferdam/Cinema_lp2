package com.br.lp2.cinema.model.javabeans;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class Filme {
    
    private int id_filme;
    private String nome;
    private String duracao;
    private String censura;
    private String distribuidora;
    
    /**
     * 
     * @param nome Nome do filme
     * @param duracao Tempo de duração do filme
     * @param censura Censura do filme
     * @param distribuidora Distribuidora do filme
     */

    public Filme(int id_filme, String nome, String duracao, String censura, String distribuidora) {
        this.id_filme = id_filme;
        this.nome = nome;
        this.duracao = duracao;
        this.censura = censura;
        this.distribuidora = distribuidora;
    }

    public int getId() {
        return id_filme;
    }

    public void setId(int id_filme) {
        this.id_filme = id_filme;
    }

    public Filme() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }
    
    
    
}
