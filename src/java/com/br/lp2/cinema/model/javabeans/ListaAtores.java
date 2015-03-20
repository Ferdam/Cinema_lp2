package com.br.lp2.cinema.model.javabeans;

import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class ListaAtores {

    private ArrayList<Ator> lista;
    private int id_listaatores;

    public ListaAtores(ArrayList<Ator> lista, int id_lista) {
        lista = new ArrayList<Ator>();
        id_listaatores = id_lista;
    }

    public void addAtor(Ator a) {
        lista.add(a);
    }

    public int getId() {
        return id_listaatores;
    }
    
    public ArrayList<Ator> getLista(){
        return lista;
    }

    public void remAtor(Ator a) {
        for (Ator ator : lista) {
            if (ator.compara(a)) {
                lista.remove(ator);
            }
        }
    }

    public void remAtor2(Ator a) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == a) {
                lista.remove(i);
            }

        }
    }

    public void setLista(ArrayList<Ator> lista) {
        this.lista = lista;
    }

}
