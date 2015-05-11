/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
 */
public interface UsuarioDAO {
    
    //CREATE
    public boolean insereUsuario(Usuario a);
    //READ
    public ArrayList<Usuario> buscaUsuario();
    public Usuario buscaUsuarioPorNome(String nome);
    //UPDATE
    public boolean atualizaUsuario(int id, Usuario a);
    //DELETE
    public boolean removeUsuario(int id);

    
}
