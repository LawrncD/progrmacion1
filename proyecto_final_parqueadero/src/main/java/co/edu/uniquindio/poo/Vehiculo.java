package co.edu.uniquindio.poo;

public abstract class  Vehiculo {
    private final String placa;
    private final String modelo;
    private final String propietario;
    private final Puesto puesto;
    public Vehiculo(String placa, String modelo, String propietario,Puesto puesto) {
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
        this.puesto=puesto;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPropietario() {
        return propietario;
    }
    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", modelo=" + modelo + ", propietario=" + propietario + "]";
    }
    
}
