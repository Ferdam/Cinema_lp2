package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class FilmeDAOConcreto implements FilmeDAO{

    private final Connection connection;
    private PreparedStatement pstm;

    public FilmeDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    public boolean insereFilme(Filme dir) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.FILME(nome) VALUES(?)";

            pstm = connection.prepareStatement(sql);
            pstm.setString(1, dir.getNome());
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    public ArrayList<Filme> buscaFilme() {
        ArrayList<Filme> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.FILME";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Filme dir = new Filme(rs.getInt("id_filme"), rs.getString("nome"), rs.getString("duracao"), rs.getString("censura"), rs.getString("distribuidora"));
                lista.add(dir);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;    
    }

    public Filme buscaFilmePorId(int id_filme) {
        Filme dir = null;
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.FILME WHERE id_filme = ?";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_filme);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                dir = new Filme(rs.getInt("id_filme"), rs.getString("nome"), rs.getString("duracao"), rs.getString("censura"), rs.getString("distribuidora"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return dir;
}

    public Filme buscaFilmePorNome(String nome) {
        Filme dir = new Filme();
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.FILME WHERE nome=?";
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, "nome");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                dir.setNome(rs.getString("nome"));
                dir.setId(rs.getInt("id_filme"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return dir;
        
    }

    public boolean atualizaFilme(int id_filme, Filme genero) {
        boolean resultado = false;
//        try {
//            String sql = "DELETE FROM CINEMA_DB.FILME WHERE id_filme = ? ";
//            pstm = connection.prepareStatement(sql);
//            pstm.setInt(1, id_filme);
//            resultado = pstm.execute();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
        return resultado;
    }

    public boolean removeFilme(int id_filme) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM CINEMA_DB.FILME WHERE id_filme = ? ";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_filme);
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }
    
    

    
    
}
