package co.edu.uniquindio.poo;

public class Carro extends Vehiculo{
    private int tarifa;

    public Carro(String placa, String modelo, String propietario, Puesto puesto, int tarifa) {
        super(placa, modelo, propietario, puesto);
        this.tarifa = tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Carro [tarifa=" + tarifa + "]";
    }
    
}
