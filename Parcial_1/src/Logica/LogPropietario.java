
package Logica;

import BD.BDPropietario;
import BD.BDVehiculo;
import Clases.Propietario;
import Clases.Vehiculo;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LogPropietario {
    
    BDPropietario objBDPropietario = new BDPropietario();
    BDVehiculo objBDVehiculo = new BDVehiculo();

    public void Insertar1(Propietario objPropietario) 
            throws ClassNotFoundException, SQLException {
        
        objBDPropietario.InsertarP(objPropietario);

    } 
    
    public void Insertar2(Vehiculo objVehiculo)
            throws ClassNotFoundException, SQLException {

        objBDVehiculo.InsertarV(objVehiculo);

    } 
    
}
