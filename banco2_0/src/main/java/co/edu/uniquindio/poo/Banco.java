package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Banco {
    private final String nombre;
    private  static Collection<CuentaBancaria> listaCuentaBancarias;

    public Banco(String nombre) {
        this.nombre = nombre;
        Banco.listaCuentaBancarias = new LinkedList<CuentaBancaria>();
    }

    public String getNombre() {
        return nombre;
    }

    public static Collection<CuentaBancaria> getListaCuentaBancarias() {
        return listaCuentaBancarias;
    }

    public void setListaCuentaBancarias(Collection<CuentaBancaria> listaCuentaBancarias) {
        Banco.listaCuentaBancarias = listaCuentaBancarias;
    }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", listaCuentaBancarias=" + listaCuentaBancarias + "]";
    }

    public static void agregarCuenta(CuentaBancaria cuenta) {
        listaCuentaBancarias.add(cuenta);
    }
    
    public static void crearBanco(String nombre){
        new Banco(nombre);
        System.out.println("EL banco se creo con exito");
    }

   

 
}
