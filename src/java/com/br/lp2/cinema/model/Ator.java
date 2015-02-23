package com.br.lp2.cinema.model;

import java.util.Date;

/**
 *
 * @author 31410758
 */
public class Ator {

    private String nome;
    private String nomefake;
    private final Date dataNasc;
    private String nacionalidade;

    /**
     * 
     * @param nome nome do ator (completo)
     * @param dataNasc data de nascimento do ator
     * @param nacionalidade nacio do ator
     */
    public Ator(String nome, Date dataNasc, String nacionalidade) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.nacionalidade = nacionalidade;
    }
    
    public boolean compara(Ator a){
        if (  this.nome.equals(a.getNome()) 
           && this.dataNasc==a.getDataNasc() 
           && this.nacionalidade.equals(a.getNacionalidade())  ){
            
            return true;
        }
        return false;
    }
    
    public Date getDataNasc() {
        return dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNomefake() {
        return nomefake;
    }

    public void setNomefake(String nomefake) {
        this.nomefake = nomefake;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
}
