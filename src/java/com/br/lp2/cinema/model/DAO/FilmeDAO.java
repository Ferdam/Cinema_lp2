package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Filme;
import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public interface FilmeDAO {

    //CREATE
    public boolean insereFilme(Filme a);
    //READ
    public ArrayList<Filme> buscaFilme();
    public Filme buscaFilmePorNome(String nome);
    //UPDATE
    public boolean atualizaFilme(int id, Filme a);
    //DELETE
    public boolean removeFilme(int id);
    
    
}
