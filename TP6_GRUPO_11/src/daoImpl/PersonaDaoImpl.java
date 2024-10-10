package daoImpl;

import java.sql.*;
import java.util.ArrayList;
import dao.PersonaDao;
import entidad.Persona;


public class PersonaDaoImpl implements PersonaDao
{
	
    // Método para conectar a la base de datos
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bdPersonas", "root", "Mfer-1234"); // Ajustar credenciales
    }

    @Override
    public boolean Insert(Persona persona) {
        try (Connection conexion = conectar()) {
            String sql = "INSERT INTO Personas (Dni, Nombre, Apellido) VALUES (?,?,?)";
            PreparedStatement preStatement = conexion.prepareStatement(sql);
            preStatement.setInt(1, persona.getDni());
            preStatement.setString(2, persona.getNombre());
            preStatement.setString(3, persona.getApellido());
            return preStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean Update(Persona personaModificada) {
        try (Connection conexion = conectar()) {
            String sql = "UPDATE Personas SET Nombre = ?, Apellido = ? WHERE Dni = ?";
            PreparedStatement preStatement = conexion.prepareStatement(sql);
            preStatement.setString(1, personaModificada.getNombre());
            preStatement.setString(2, personaModificada.getApellido());
            preStatement.setInt(3, personaModificada.getDni());
            return preStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean Delete(Persona personaAelimianar) {
        try (Connection conexion = conectar()) {
            String sql = "DELETE FROM Personas WHERE Dni = ?";
            PreparedStatement preStatement = conexion.prepareStatement(sql);
            preStatement.setInt(1, personaAelimianar.getDni());
            return preStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<Persona> GetListAll() {
        ArrayList<Persona> lista = new ArrayList<>();
        try (Connection conexion = conectar()) {
            String sql = "SELECT * FROM Personas";
            Statement Statement = conexion.createStatement();
            ResultSet Result = Statement.executeQuery(sql);
            while (Result.next()) {
                Persona persona = new Persona(Result.getString("Apellido"), Result.getString("Nombre"),
                							  Result.getInt("Dni"));
                lista.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
	
	
}
