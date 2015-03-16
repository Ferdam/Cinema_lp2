package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Genero;
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
public class GeneroDAOConcreto implements GeneroDAO {

    private final Connection connection;
    private PreparedStatement pstm;

    public GeneroDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    @Override
    public boolean insereGenero(Genero gen) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.GENERO(nome) VALUES(?)";

            pstm = connection.prepareStatement(sql);
            pstm.setString(1, gen.getNome());
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    @Override
    public ArrayList<Genero> buscaGeneros() {
        ArrayList<Genero> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.GENERO";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Genero gen = new Genero(rs.getInt("id_genero"), rs.getString("nome"));
                lista.add(gen);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;}

    @Override
    public Genero buscaGeneroPorId(int id_genero) {
        Genero gen = null;
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.GENERO WHERE id_genero = ?";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_genero);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                gen = new Genero(rs.getInt("id_genero"),rs.getString("nome"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return gen;
        
    }

    @Override
    public Genero buscaGeneroPorNome(String nome) {
        Genero gen = new Genero();
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.GENERO WHERE nome=?";
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, "nome");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                gen.setNome(rs.getString("nome"));
                gen.setId(rs.getInt("id_genero"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return gen;
        
    }

    @Override
    public boolean atualizaGenero(int id_genero, Genero genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeGenero(int id_genero) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM CINEMA_DB.GENERO WHERE id_genero = ? ";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_genero);
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

}
