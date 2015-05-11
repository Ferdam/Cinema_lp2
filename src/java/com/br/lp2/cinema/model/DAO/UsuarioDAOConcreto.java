/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel Meyer | Vinicius Zamarrenho | Leticia Lopes
 */
public class UsuarioDAOConcreto implements UsuarioDAO {

    private final Connection connection;
    private PreparedStatement pstm;

    public UsuarioDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    @Override
    public boolean insereUsuario(Usuario a) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.USUARIO(username, pass, papel) VALUES(?,?,?)";

            pstm = connection.prepareStatement(sql);
            pstm.setString(1, a.getNome());
            pstm.setString(2, a.getSenha());
            pstm.setString(3, a.getPapel());

            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    @Override
    public ArrayList<Usuario> buscaUsuario() {
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.USUARIO";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Usuario a = new Usuario(rs.getString("username"),rs.getString("pass"), rs.getString("papel"));
                lista.add(a);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;    
    }

    @Override
    public Usuario buscaUsuarioPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizaUsuario(int id, Usuario a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
