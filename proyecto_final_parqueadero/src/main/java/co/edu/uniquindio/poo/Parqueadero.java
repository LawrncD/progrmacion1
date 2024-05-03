package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Parqueadero {
    private final String nombre;
    private static  int puestoI = 0;
    private static  int puestoJ = 0;
    private final  Collection<Vehiculo> listaVehiculos;
    public Parqueadero(String nombre, int puestoI, int puestoJ) {
        this.nombre = nombre;
        Parqueadero.puestoI = puestoI;
        Parqueadero.puestoJ = puestoJ;
        this.listaVehiculos = new LinkedList<Vehiculo>();
    }
    public String getNombre() {
        return nombre;
    }
    public static int getPuestoI() {
        return puestoI;
    }
    public static int getPuestoJ() {
        return puestoJ;
    }
    
    public static void setPuestoI(int puestoI) {
        Parqueadero.puestoI = puestoI;
    }
    public static void setPuestoJ(int puestoJ) {
        Parqueadero.puestoJ = puestoJ;
    }
    @Override
    public String toString() {
        return "Parqueadero [nombre=" + nombre + ", puestoI=" + puestoI + ", puestoJ=" + puestoJ + "]";
    }
    
}
