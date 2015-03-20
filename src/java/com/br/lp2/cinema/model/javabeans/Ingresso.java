package com.br.lp2.cinema.model.javabeans;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class Ingresso {
    
    private int id_ingresso;
    private String tipo;
    private String valor;

    public Ingresso(int id_ingresso, String tipo, String valor) {
        this.id_ingresso = id_ingresso;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getId() {
        return id_ingresso;
    }

    public void setId(int id_ingresso) {
        this.id_ingresso = id_ingresso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
