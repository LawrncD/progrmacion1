package co.edu.uniquindio.poo.codigo;

import java.util.Collection;
import java.util.LinkedList;



public class Banco {
    private static String nombre;
    private  static Collection<CuentaBancaria> listaCuentaBancarias;

    public Banco(String nombre) {
        Banco.nombre = nombre;
        Banco.listaCuentaBancarias = new LinkedList<CuentaBancaria>();
    }

    public static String getNombre() {
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
    
    public static void crearBancoNuevo(String nombre){
        @SuppressWarnings("unused")
        Banco banco = new Banco(nombre);
        System.out.println("EL banco se creo con exito  " + getNombre());
        
    }

    public static String obtenerLista() {
        String listaCuentasArea = "";
        listaCuentasArea = listaCuentasArea + getNombre() + "\n";
        for (CuentaBancaria cuenta : Banco.getListaCuentaBancarias()) {
            listaCuentasArea =   cuenta.getNombreTirular() +  " "
                    + cuenta.getApellidosTitular() + " "+  cuenta.getNumeroCuenta()+" "
                    + " Saldo: " + cuenta.getSaldo() + "\n";

        }
        return listaCuentasArea;
    }
    
    

 
}
