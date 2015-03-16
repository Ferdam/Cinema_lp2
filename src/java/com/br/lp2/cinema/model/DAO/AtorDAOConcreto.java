package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Ator;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class AtorDAOConcreto implements AtorDAO{

    private final Connection connection;
    private PreparedStatement pstm;

    public AtorDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    @Override
    public boolean insereAtor(Ator a) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.ATOR(nome, dataNasc, nacionalidade) VALUES(?,?,?)";

            pstm = connection.prepareStatement(sql);
            pstm.setString(1, a.getNome());
            pstm.setDate(2, (Date) a.getDataNasc());
            pstm.setString(3, a.getNacionalidade());
            
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    @Override
    public ArrayList<Ator> buscaAtor() {
        ArrayList<Ator> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.ATOR";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Ator a = new Ator(rs.getInt("id_ator"), rs.getString("nome"), rs.getDate("dataNasc"), rs.getString("nacionalidade"));
                lista.add(a);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;    
    }


    @Override
    public Ator buscaAtorPorNome(String nome) {
        Ator a = null;
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.ATOR WHERE nome=?";
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, "nome");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                a = new Ator(rs.getInt("id_ator"), rs.getString("nome"), rs.getDate("dataNasc"), rs.getString("nacionalidade"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return a;
    }

    @Override
    public boolean atualizaAtor(int id_ator, Ator a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAtor(int id_ator) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM CINEMA_DB.ATOR WHERE id_ator = ? ";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_ator);
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }
    
}
