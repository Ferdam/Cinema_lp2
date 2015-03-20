package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Sala;
import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public interface SalaDAO {

    //CREATE
    public boolean insereSala(Sala a);
    //READ
    public ArrayList<Sala> buscaSala();
    public Sala buscaSalaPorLotacao(int lot);
    public Sala buscaSalaPorId(int id);
    //UPDATE
    public boolean atualizaSala(int id, Sala a);
    //DELETE
    public boolean removeSala(int id);
    
    
}
