package dao;

import db_util.ConexaoBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import rh.modelo.Departamento;

public class DepartamentoDAO {

    String INSERT = "INSERT INTO departamento VALUES(?, ?)";
    String UPDATE = "UPDATE departamento SET nome = ? WHERE sigla = ? ";
    String DELETE = "DELETE FROM departamento WHERE sigla = ?";
    String SELECT_ALL = "SELECT * FROM departamento";
    String SELECT_BY_NOME = "SELECT * FROM departamento d WHERE d.nome_departamento = ? ";
    String SELECT_BY_SIGLA = " SELECT FROM departamento WHERE sigla = ?";

    public void save(Departamento d) {

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = ConexaoBD.ligarBD();
            ps = conn.prepareStatement(INSERT);
            ps.setString(1, d.getSigla());
            ps.setString(2, d.getNome());
            ps.executeUpdate();
        } catch (SQLException e) {

            System.err.println("Erro ao Inserir dados: DepartamentoDAO:save" + e.getLocalizedMessage());

        }

    }

    public List<Departamento> listaDepartamentos() {

        List<Departamento> lista = new ArrayList<>();
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = ConexaoBD.ligarBD();
            ps = conn.prepareStatement(SELECT_ALL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Departamento d = new Departamento();
                d.setSigla(rs.getString(1));
                d.setNome(rs.getString(2));

                lista.add(d);
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao Inserir dados: DepartamentoDAO:"
                    + "listaDepartamentos" + ex.getLocalizedMessage());

        }

        return lista;
    }

    public List<Departamento> listaDepartamentoByNome(String nome) {
        List<Departamento> lista = new ArrayList<>();
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = ConexaoBD.ligarBD();
            ps = conn.prepareStatement(SELECT_BY_NOME);
            ps.setString(1, nome);
            rs = ps.executeQuery();

            while (rs.next()) {
                Departamento d = new Departamento();
                d.setSigla(rs.getString(1));
                d.setNome(rs.getString(2));

                lista.add(d);
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao Inserir dados: DepartamentoDAO:listaDepartamentos" + ex.getLocalizedMessage());

        }

        return lista;
    }

}
