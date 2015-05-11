/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.cinema.controller;

import com.br.lp2.cinema.model.DAO.UsuarioDAO;
import com.br.lp2.cinema.model.DAO.UsuarioDAOConcreto;
import com.br.lp2.cinema.model.javabeans.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
 */
public class Autenticador {
    
        private Usuario uComp;
    
    public Autenticador(Usuario u) {
        this.uComp = u;
    }
    
    public String autentica(){
        UsuarioDAO dao = new UsuarioDAOConcreto();
        ArrayList<Usuario> listausuarios = dao.buscaUsuario();
            
            String validado = "errado";
            
            for (Usuario user : listausuarios) {
                if(uComp.getNome().equals(user.getNome()) && uComp.getSenha().equals(user.getSenha())){
                  
                    validado = user.getPapel();
                    break;
                
                } 
            }
            
            return validado;
    }
    
}
