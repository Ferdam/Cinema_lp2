package com.br.lp2.cinema.model.javabeans;

import java.util.Date;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class Ator {

    private String nome;
    private String nomefake;
    private final Date dataNasc;
    private String nacionalidade;
    private int id_ator;

    /**
     * 
     * @param nome nome do ator (completo)
     * @param dataNasc data de nascimento do ator
     * @param nacionalidade nacio do ator
     */
    public Ator(int id_ator, String nome, Date dataNasc, String nacionalidade) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.nacionalidade = nacionalidade;
        this.id_ator = id_ator;
    }

    
    public boolean compara(Ator a){
        if (  this.nome.equals(a.getNome()) 
           && this.dataNasc==a.getDataNasc() 
           && this.nacionalidade.equals(a.getNacionalidade())  ){
            
            return true;
        }
        return false;
    }

    public int getId() {
        return id_ator;
    }

    public void setId(int id_ator) {
        this.id_ator = id_ator;
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
