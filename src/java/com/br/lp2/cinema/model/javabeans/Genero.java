package com.br.lp2.cinema.model.javabeans;
import java.io.Serializable;
/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class Genero implements Serializable {

    private String nome;
    private int id_genero;

    public Genero(int Int, String string) {
        this.id_genero = Int;
        this.nome = string;
    }

    public Genero() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id_genero) {
        this.id_genero = id_genero;
    }

}