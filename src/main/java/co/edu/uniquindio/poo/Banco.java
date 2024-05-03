package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Banco {
    private final String nombre;
    private final Collection <CuentaBancaria> cuentas;
    private final Collection<Titular> listaTitulares;

    /*
     * Método constructor de la clase Banco
     */
    public Banco (String nombre){
        this.nombre = nombre;
        this.cuentas = new LinkedList<>();
        this.listaTitulares = new LinkedList<>();
        assert nombre!= null && !nombre.isBlank();
    }

    /*
     * Método para obtener el nombre de un banco
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }

    /*
     * Método para obtener la lista no modificable de cuentas de un banco
     * @return colección no modificable de cuentas
     */
    public Collection<CuentaBancaria> getCuentas (){
        return Collections.unmodifiableCollection(cuentas);
    }

    /*
     * Método para obtener la lista no modificable de titulares de una cuenta
     * @return lista no modificable de titulares
     */
    public Collection<Titular> getListaTitulares (){
        return Collections.unmodifiableCollection(listaTitulares);
    }

    /*
     * Método para añadir una cuenta bancaria a banco
     */
    public void añadirCuentasBancarias (CuentaBancaria cuentaBancaria){
        cuentas.add(cuentaBancaria);
    }

  
}