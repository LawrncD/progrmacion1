package co.edu.uniquindio.poo;

import java.util.Arrays;

public class Puesto {
    private int j ;
    private int i;
    private boolean ocupado;
    private Vehiculo vehiculo;
    public Puesto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.i = Parqueadero.getPuestoI();
        this.j = Parqueadero.getPuestoJ();
        this.ocupado = false;

    }
    @Override
    public String toString() {
        return "Puesto [j=" + j + ", i=" + i + ", ocupado=" + ocupado + ", vehiculo=" + vehiculo + "]";
    }
    public int getJ() {
        return j;
    }
    public void setJ(int j) {
        this.j = j;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
   
    
    }

