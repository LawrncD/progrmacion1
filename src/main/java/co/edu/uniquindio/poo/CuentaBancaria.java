package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public abstract class CuentaBancaria {
    private int numeroCuenta;
    public double saldo;
    protected boolean estadoCuenta;
    private Titular titular;
    private final Collection<Transaccion> listaTransaccion;
    

    public CuentaBancaria (Titular titular,int numeroCuenta, double saldo, boolean estadoCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estadoCuenta = true;
        this.listaTransaccion = new LinkedList<>();
    }

    public Titular geTitular(){
        return titular;
    }

    public int getNumeroCuenta (){
        return numeroCuenta;
    }

    public double getSaldo(){
        if(estadoCuenta == true){
        }
        return saldo;
    }

    public boolean cuentaActiva (){
        return estadoCuenta;
    }

    public Collection<Transaccion> getListaTransacciones (){
        return Collections.unmodifiableCollection(listaTransaccion);
    }

    public void depositarDinero (double dinero){
        assert dinero > 0;
                saldo += dinero;
                estadoCuenta = false ;
        }
    
    public abstract void retirarDinero(double dinero);


    /*public void retirarDinero (double dinero){
        if (dinero < saldo){
            saldo -= dinero;
            estadoCuenta = true;
        } else if (dinero > saldo){
            if (dinero < tipoCuenta.getLimiteSobregiro()){
                saldo -= dinero;
                if (saldo == 0){
                    estadoCuenta = false;
                }
            }
        }
        
    }*/
}