package co.edu.uniquindio.poo;

public class MotoClasica extends Moto {
    private int tarifa;

    public MotoClasica(String placa, String modelo, String propietario, Puesto puesto, String velocidad, int tarifa) {
        super(placa, modelo, propietario, puesto, velocidad);
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
        return "MotoClasica [tarifa=" + tarifa + "]";
    }
    
}
