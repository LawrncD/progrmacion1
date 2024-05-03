package co.edu.uniquindio.poo;

public class MotoHibrida extends Moto{
 private int tarifa;

public MotoHibrida(String placa, String modelo, String propietario, Puesto puesto, String velocidad, int tarifa) {
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
    return "MotoHibrida [tarifa=" + tarifa + "]";
}

}
