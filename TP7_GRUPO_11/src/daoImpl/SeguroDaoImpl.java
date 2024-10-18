package daoImpl;

import java.sql.*;
import java.util.ArrayList;
import dao.SeguroDao;
import entidad.Seguro;


public class SeguroDaoImpl implements SeguroDao
{
	
   
    private Connection conectar() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/SegurosGroup", "root", "root");
    }

    @Override
    public boolean Insert(Seguro seguro) {
        try (Connection conexion = conectar()) {
            String sql = "INSERT INTO seguros (descripcion, idTipo, costoContratacion, costoAsegurado)" +
            			 " VALUES (?, ?, ?, ?)";
            PreparedStatement preStatement = conexion.prepareStatement(sql);
            preStatement.setString(1, seguro.getDescripcion());
            preStatement.setInt(2, seguro.getTipo());
            preStatement.setBigDecimal(3, seguro.getCosto());
            preStatement.setBigDecimal(4, seguro.getCostoMaximo());
            return preStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public int UltimoId() {
        int id = 0;
        try (Connection conexion = conectar()) {
            String sql = "SELECT MAX(idSeguro) AS lastId FROM seguros";
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            if (result.next()) {
                id = result.getInt("lastId");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id + 1;
    }
    
    @Override
    public ArrayList<String> GetTypeAll() {
        ArrayList<String> lista = new ArrayList<>();
        try (Connection conexion = conectar()) {
            String sql = "SELECT idTipo, descripcion FROM tipoSeguros";
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String tipo = result.getInt("idTipo") + " - " + result.getString("descripcion");
                lista.add(tipo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

 

    @Override
    public ArrayList<Seguro> GetListAll() {
        ArrayList<Seguro> lista = new ArrayList<>();
        try (Connection conexion = conectar()) {
            String sql = "SELECT s.idSeguro, s.descripcion, ts.descripcion AS" +
            			 " tipo, s.costoContratacion, s.costoAsegurado " +
                         "FROM seguros s " +
                         "JOIN tipoSeguros ts ON s.idTipo = ts.idTipo";
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Seguro seguro = new Seguro();
                seguro.setId(result.getInt("idSeguro"));
                seguro.setDescripcion(result.getString("descripcion"));
                seguro.setTipoDescripcion(result.getString("tipo"));
                seguro.setCosto(result.getBigDecimal("costoContratacion"));
                seguro.setCostoMaximo(result.getBigDecimal("costoAsegurado"));
                lista.add(seguro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
	
	
}
