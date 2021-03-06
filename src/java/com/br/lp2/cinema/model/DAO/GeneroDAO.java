
package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Genero;
import java.util.ArrayList;

/**
 *
 * @author Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
 */
public interface GeneroDAO {
    
    //CREATE
    public boolean insereGenero(Genero gen);
    //READ
    public ArrayList<Genero> buscaGeneros();
    public Genero buscaGeneroPorId(int id);
    public Genero buscaGeneroPorNome(String nome);
    //UPDATE
    public boolean atualizaGenero(int id, Genero genero);
    //DELETE
    public boolean removeGenero(int id);
    
}
