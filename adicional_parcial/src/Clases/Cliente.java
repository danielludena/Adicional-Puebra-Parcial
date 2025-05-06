package Clases;

public class Cliente {
    
    private int idClie;
    private int cedula;
    private String nombres;
    private String apellidos;

    public Cliente() {}

    public Cliente(int idClie, int cedula, String nombres, String apellidos) {
        this.idClie = idClie;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdClie() {
        return idClie;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
