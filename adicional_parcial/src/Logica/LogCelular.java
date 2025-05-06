package Logica;

import BD.BDCelular;
import Clases.Celular;
import java.sql.SQLException;

public class LogCelular {

    BDCelular objBDCelular = new BDCelular();

    public void Insertar(Celular obj) throws ClassNotFoundException, SQLException {
        objBDCelular.InsertarCelular(obj);
    }
}
