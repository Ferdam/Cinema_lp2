package com.br.lp2.cinema.model.DAO;

import com.br.lp2.cinema.model.javabeans.Sala;
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
public class SalaDAOConcreto implements SalaDAO {

    private final Connection connection;
    private PreparedStatement pstm;

    public SalaDAOConcreto() {
        ConnectionFactory cf = new ConnectionFactory();
        connection = cf.getConnection("derby");
    }

    public boolean insereSala(Sala sala) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO CINEMA_DB.SALA(nome) VALUES(?)";

            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, sala.getId());
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    @Override
    public ArrayList<Sala> buscaSala() {
        ArrayList<Sala> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CINEMA_DB.SALA";
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Sala sala = new Sala(rs.getInt("numero"), rs.getInt("lotacao"), rs.getInt("especiais"));
                lista.add(sala);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    public Sala buscaSalaPorId(int id_sala) {
        Sala sala = null;

        try {
            String sql = "SELECT * FROM CINEMA_DB.SALA WHERE id_sala = ?";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_sala);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                sala = new Sala(rs.getInt("numero"), rs.getInt("lotacao"), rs.getInt("especiais"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return sala;
    }

    public Sala buscaSalaPorLotacao(int lot) {
        Sala sala = new Sala();

        try {
            String sql = "SELECT * FROM CINEMA_DB.SALA WHERE lotacao=?";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, lot);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                sala.setLotacao(rs.getInt("lotacao"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return sala;

    }

    public boolean atualizaSala(int id_sala, Sala genero) {
        boolean resultado = false;
//        try {
//            String sql = "DELETE FROM CINEMA_DB.SALA WHERE id_sala = ? ";
//            pstm = connection.prepareStatement(sql);
//            pstm.setInt(1, id_sala);
//            resultado = pstm.execute();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
        return resultado;
    }

    public boolean removeSala(int id_sala) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM CINEMA_DB.SALA WHERE id_sala = ? ";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id_sala);
            resultado = pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

}
