package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Diretor;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public interface DiretorDAO {

    //CREATE
    public boolean insereDiretor(Diretor dir);
    //READ
    public ArrayList<Diretor> buscaDiretor();
    public Diretor buscaDiretorPorId(int id);
    public Diretor buscaDiretorPorNome(String nome);
    //UPDATE
    public boolean atualizaDiretor(int id, Diretor diretor);
    //DELETE
    public boolean removeDiretor(int id);

    
}
