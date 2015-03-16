package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Ingresso;
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
public class IngressoDAOConcreto implements IngressoDAO{

    private final Connection connection;
    private PreparedStatement pstm;

    public IngressoDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    @Override
    public boolean insereIngresso(Ingresso a) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.ATOR(id_ingresso, tipo, valor) VALUES(?,?,?)";

            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, a.getId());
            pstm.setString(2, a.getTipo());
            pstm.setString(3, a.getValor());
            
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    @Override
    public ArrayList<Ingresso> buscaIngresso() {
        ArrayList<Ingresso> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.ATOR";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Ingresso a = new Ingresso(rs.getInt("id_ator"), rs.getString("tipo"), rs.getString("valor"));
                lista.add(a);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;    
    }


    @Override
    public Ingresso buscaIngressoPorNome(String nome) {
        Ingresso a = null;
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.ATOR WHERE nome=?";
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, "nome");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                a = new Ingresso(rs.getInt("id_ator"), rs.getString("tipo"), rs.getString("valor"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return a;
    }

    @Override
    public boolean atualizaIngresso(int id_ator, Ingresso a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeIngresso(int id_ator) {
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
