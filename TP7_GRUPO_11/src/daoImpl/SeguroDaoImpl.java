package daoImpl;

import java.sql.*;
import java.util.ArrayList;
import dao.SeguroDao;
import entidad.Seguro;


public class SeguroDaoImpl implements SeguroDao
{
	
   
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/segurosgrup", "root", "2495Ma3895"); 
    }

    @Override
    public boolean Insert(Seguro seguro) {
        try (Connection conexion = conectar()) {
            String sql = "INSERT INTO seguros (descripcion,idTipo,costoContratacion,costoAsegurado) VALUES (?,?,?)";
            PreparedStatement preStatement = conexion.prepareStatement(sql);
            preStatement.setString(1, seguro.getDescripcion());
            preStatement.setInt(2, seguro.getTipo());
            preStatement.setFloat(3, seguro.getCosto());
            preStatement.setFloat(4, seguro.getCostoMaximo());
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
            
            if (result.next()) { // Verifica si hay un resultado
                id = result.getInt("lastId");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id + 1; // Se le suma 1 para el nuevo ID
    }
    
    @Override
    public ArrayList<String> GetTypeAll()
    {
    	 ArrayList<String> lista = new ArrayList<>();
         try (Connection conexion = conectar()) {
             String sql = "SELECT descripcion FROM tiposeguro"; // Asegúrate de que estas columnas existan
             Statement statement = conexion.createStatement();
             ResultSet result = statement.executeQuery(sql);
             String descripcion;
             while (result.next()) {
                
                 descripcion= result.getString("descripcion"); 
        
                 lista.add(descripcion);
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
            String sql = "SELECT idSeguro, descripcion, idtipo, costoContratacion, costoAsegurado FROM seguros"; 
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while (result.next()) {
                Seguro seguro = new Seguro();
                seguro.setId(result.getInt("idSeguro")); 
                seguro.setDescripcion(result.getString("descripcion")); 
                seguro.setTipo(result.getInt("idtipo")); 
                seguro.setCosto(result.getFloat("costoContratacion")); 
                seguro.setCostoMaximo(result.getFloat("costoAsegurado")); 
                lista.add(seguro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
	
	
}
