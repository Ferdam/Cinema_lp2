package com.br.lp2.cinema.model.javabeans;

import java.util.Date;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class Diretor {

    private String nome;
    private int id_diretor;
    //private int id_diretor = reg;

    /**
     * Construtor da classe usando apenas o id_diretoristro
     * @param id_diretor num de id_diretoristro do diretor na academia
     */ 
    public Diretor(int id_diretor) {
        this.id_diretor = id_diretor;
    }
    /**
     * Construtor da classe usando todos os parametros
     * @param nome nome do diretor
     * @param id_diretor num de id_diretoristro do diretor na academia
     */     
    public Diretor(String nome, int id_diretor){
        this.nome = nome;
        this.id_diretor = id_diretor;
    }

    public Diretor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getReg() {
        return id_diretor;
    }

    public void setReg(int id_diretor) {
        this.id_diretor = id_diretor;
    }

    
    
}
