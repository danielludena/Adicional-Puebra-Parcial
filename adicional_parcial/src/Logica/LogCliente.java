package Logica;

import BD.BDCliente;
import Clases.Cliente;
import java.sql.SQLException;

public class LogCliente {
    
    BDCliente objBDCliente = new BDCliente();

    public void Insertar(Cliente obj) throws ClassNotFoundException, SQLException {
        objBDCliente.InsertarCliente(obj);
    }
}
