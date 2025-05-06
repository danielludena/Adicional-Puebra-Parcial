package Logica;

import BD.BDRecarga;
import Clases.Recarga;
import java.sql.SQLException;

public class LogRecarga {

    BDRecarga objBDRecarga = new BDRecarga();

    public void Insertar(Recarga obj) throws ClassNotFoundException, SQLException {
        objBDRecarga.InsertarRecarga(obj);
    }
}
