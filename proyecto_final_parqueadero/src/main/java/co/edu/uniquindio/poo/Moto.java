package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private final String velocidad;

    public Moto(String placa, String modelo, String propietario, Puesto puesto, String velocidad) {
        super(placa, modelo, propietario, puesto);
        this.velocidad = velocidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Moto [velocidad=" + velocidad + "]";
    }
    
}
