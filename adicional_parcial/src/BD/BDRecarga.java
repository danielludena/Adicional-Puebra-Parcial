package BD;

import Clases.Recarga;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDRecarga {
    
    Conexion con = new Conexion();

    public int InsertarRecarga(Recarga obj) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO Recargas (valor, saldo, megas, idCel) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        ps.setInt(1, obj.getValor());
        ps.setInt(2, obj.getSaldo());
        ps.setInt(3, obj.getMegas());
        ps.setInt(4, obj.getIdCel());
        return ps.executeUpdate();
    }
}
