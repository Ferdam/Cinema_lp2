package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Diretor;
import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public interface DiretorDAO {

    //CREATE
    public boolean insereDiretor(Diretor dir);
    //READ
    public ArrayList<Diretor> buscaDiretor();
    public Diretor buscaDiretorPorId(int id_diretor);
    public Diretor buscaDiretorPorNome(String nome);
    //UPDATE
    public boolean atualizaDiretor(int id_diretor, Diretor diretor);
    //DELETE
    public boolean removeDiretor(int id_diretor);

    
}
