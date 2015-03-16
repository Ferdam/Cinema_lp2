package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Diretor;
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
public class DiretorDAOConcreto implements DiretorDAO{

    private final Connection connection;
    private PreparedStatement pstm;

    public DiretorDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    public boolean insereDiretor(Diretor dir) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.DIRETOR(nome) VALUES(?)";

            pstm = connection.prepareStatement(sql);
            pstm.setString(1, dir.getNome());
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    public ArrayList<Diretor> buscaDiretor() {
        ArrayList<Diretor> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.DIRETOR";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Diretor dir = new Diretor(rs.getString("nome"), rs.getInt("id_diretor"));
                lista.add(dir);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;    
    }

    public Diretor buscaDiretorPorId(int id_diretor) {
        Diretor dir = null;
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.DIRETOR WHERE id_diretor = ?";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_diretor);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                dir = new Diretor(rs.getString("nome"), rs.getInt("id_diretor"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return dir;
}

    public Diretor buscaDiretorPorNome(String nome) {
        Diretor dir = new Diretor();
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.DIRETOR WHERE nome=?";
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, "nome");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                dir.setNome(rs.getString("nome"));
                dir.setReg(rs.getInt("id_diretor"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return dir;
        
    }

    public boolean atualizaDiretor(int id_diretor, Diretor genero) {
        boolean resultado = false;
//        try {
//            String sql = "DELETE FROM CINEMA_DB.DIRETOR WHERE id_diretor = ? ";
//            pstm = connection.prepareStatement(sql);
//            pstm.setInt(1, id_diretor);
//            resultado = pstm.execute();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
        return resultado;
    }

    public boolean removeDiretor(int id_diretor) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM CINEMA_DB.DIRETOR WHERE id_diretor = ? ";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_diretor);
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }
    
    

    
    
}
