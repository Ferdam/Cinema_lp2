package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Ator;
import com.br.lp2.cinema.model.javabeans.ListaAtores;
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
public class ListaAtoresDAOConcreto implements ListaAtoresDAO{

    private final Connection connection;
    private PreparedStatement pstm;

    public ListaAtoresDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    @Override
    public boolean insereListaAtores(ListaAtores a) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.LISTAATORES(id_listaatores, lista) VALUES(?,?)";

            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, a.getId());
            pstm.setObject(2, a.getLista());
            
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    @Override
    public ArrayList<ListaAtores> buscaListaAtores() {
        ArrayList<ListaAtores> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.LISTAATORES";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                ListaAtores a = new ListaAtores((ArrayList<Ator>) rs.getObject("lista"), rs.getInt("id_listaatores"));
                lista.add(a);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;    
    }


    @Override
    public ListaAtores buscaListaAtoresPorId(int id_lista) {
        ListaAtores a = null;
            
        try {
            String sql = "SELECT * FROM CINEMA_DB.LISTAATORES WHERE id_listaatores=?";
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, "id_listaatores");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                a = new ListaAtores((ArrayList<Ator>) rs.getObject("lista"), rs.getInt("id_listaatores"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return a;
    }

    @Override
    public boolean atualizaListaAtores(int id_listaatores, ListaAtores a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeListaAtores(int id_listaatores) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM CINEMA_DB.LISTAATORES WHERE id_listaatores = ? ";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_listaatores);
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }
    
}
