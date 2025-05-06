package BD;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDCliente {
    
    Conexion objConexion = new Conexion();

    public int InsertarCliente(Cliente obj) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO Cliente (Cedula, Nombres, Apellidos) VALUES (?, ?, ?)";
        PreparedStatement ps = objConexion.getConnection().prepareStatement(sql);
        ps.setInt(1, obj.getCedula());
        ps.setString(2, obj.getNombres());
        ps.setString(3, obj.getApellidos());
        return ps.executeUpdate();
    }

    public ResultSet BuscarPorCedula(int cedula) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Cliente WHERE Cedula = ?";
        PreparedStatement ps = objConexion.getConnection().prepareStatement(sql);
        ps.setInt(1, cedula);
        return ps.executeQuery();
    }
}
