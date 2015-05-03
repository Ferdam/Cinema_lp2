/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.cinema.controller;

import com.br.lp2.cinema.model.javabeans.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Leticia
 */
public class Autenticador {
    
        private Usuario uComp;
    
    public Autenticador(Usuario u) {
        this.uComp = u;
    }
    
    public String autentica(){
        ArrayList<Usuario> listausuarios = new ArrayList<>();
            listausuarios.add(new Usuario("ger", "ger", "gerente"));
            listausuarios.add(new Usuario("func", "func", "funcionario"));
            listausuarios.add(new Usuario("leticia", "123", "funcionario"));
            
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
