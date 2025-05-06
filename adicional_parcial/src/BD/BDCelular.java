package BD;

import Clases.Celular;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDCelular {
    
    Conexion con = new Conexion();

    public int InsertarCelular(Celular obj) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO Celular (numero, estado, saldo, megas, idClie) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        ps.setString(1, obj.getNumero());
        ps.setInt(2, obj.getEstado());
        ps.setInt(3, obj.getSaldo());
        ps.setInt(4, obj.getMegas());
        ps.setInt(5, obj.getIdClie());
        return ps.executeUpdate();
    }

    public ResultSet BuscarPorNumero(String numero) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Celular WHERE numero = ?";
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        ps.setString(1, numero);
        return ps.executeQuery();
    }
}
