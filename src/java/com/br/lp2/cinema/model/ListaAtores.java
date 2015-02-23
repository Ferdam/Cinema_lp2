/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.cinema.model;

import java.util.ArrayList;

/**
 *
 * @author 31410758
 */
public class ListaAtores {
    private ArrayList<Ator> lista;

    public ListaAtores(ArrayList<Ator> lista) {
        lista = new ArrayList<Ator>();
    }

    public void addAtor(Ator a){
        lista.add(a);
    }
    
    public void remAtor(Ator a){
        for (Ator ator : lista) {
            if (ator.compara(a)){
                lista.remove(ator);
            }
        }
    }

    public void remAtor2(Ator a){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) == a){
                lista.remove(i);
            }
            
        }
    }
    
    public ArrayList<Ator> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ator> lista) {
        this.lista = lista;
    }
    
}
