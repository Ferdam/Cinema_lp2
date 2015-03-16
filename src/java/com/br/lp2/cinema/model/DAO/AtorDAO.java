package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Ator;
import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public interface AtorDAO {

    //CREATE
    public boolean insereAtor(Ator a);
    //READ
    public ArrayList<Ator> buscaAtor();
    public Ator buscaAtorPorNome(String nome);
    //UPDATE
    public boolean atualizaAtor(int id, Ator a);
    //DELETE
    public boolean removeAtor(int id);
    
    
}