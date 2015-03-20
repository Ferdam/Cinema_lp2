package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Ator;
import com.br.lp2.cinema.model.javabeans.ListaAtores;
import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public interface ListaAtoresDAO {

    //CREATE
    public boolean insereListaAtores(ListaAtores a);
    //READ
    public ArrayList<ListaAtores> buscaListaAtores();
    public ListaAtores buscaListaAtoresPorId(int id_lista);
    //UPDATE
    public boolean atualizaListaAtores(int id_lista, ListaAtores a);
    //DELETE
    public boolean removeListaAtores(int id_lista);
    
    
}
