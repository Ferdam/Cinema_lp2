package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Ingresso;
import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public interface IngressoDAO {

    //CREATE
    public boolean insereIngresso(Ingresso a);
    //READ
    public ArrayList<Ingresso> buscaIngresso();
    public Ingresso buscaIngressoPorNome(String nome);
    //UPDATE
    public boolean atualizaIngresso(int id, Ingresso a);
    //DELETE
    public boolean removeIngresso(int id);
    
    
}
