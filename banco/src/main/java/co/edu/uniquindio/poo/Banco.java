package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {
 public final String nombre;
 private final Collection<CuentaBancaria> listaCuentas;

 public Banco(String nombre) {
    this.nombre = nombre;
    this.listaCuentas  = new LinkedList<CuentaBancaria>();
}
public String getNombre() {
    return nombre;
}
public Collection<CuentaBancaria> getListaCuentas() {
    return listaCuentas;
}
@Override
public String toString() {
    return "Banco [nombre=" + nombre + ", listaCuentas=" + listaCuentas + "]";
}
public void depositar(CuentaBancaria cuenta, double valor) {
    double saldoNuevo = 0;
    assert valor > 0;
        for (CuentaBancaria cuentaBancaria : listaCuentas) {
            if(cuentaBancaria.equals(cuenta)){
                if(cuentaBancaria.getTipoCuenta().equals(TipoCuenta.AHORROS)){
                    saldoNuevo = cuentaBancaria.getSaldo() + valor;
                    cuentaBancaria.setSaldo(saldoNuevo);
                }
                if (cuentaBancaria.getTipoCuenta().equals(TipoCuenta.CORRIENTE)) {
                    if(cuentaBancaria.getSaldo() < 0){
                        saldoNuevo = cuentaBancaria.getSaldo() + valor;
                        cuentaBancaria.setSaldo(saldoNuevo);
                        cuentaBancaria.sumarSobregiro(valor);
                        
                    }
                    else{
                        saldoNuevo = cuentaBancaria.getSaldo() + valor;
                        cuentaBancaria.setSaldo(saldoNuevo);
                    }
                }
            }
        }  
    }

    
public void retirar(CuentaBancaria cuenta, double valor) {
    assert valor > 0;
    double saldoNuevo = 0;
    for (CuentaBancaria cuentaBancaria : listaCuentas) {
        if(cuentaBancaria.equals(cuenta)){
            if(cuentaBancaria.getTipoCuenta().equals(TipoCuenta.AHORROS)){
                if(cuentaBancaria.getSaldo() != 0){
                    saldoNuevo = cuentaBancaria.getSaldo() - valor;
                    cuentaBancaria.setSaldo(saldoNuevo);
                }
                else{
                    System.err.println("No tienes suficiente Saldo");
                }
                
            }
            if(cuentaBancaria.getTipoCuenta().equals(TipoCuenta.CORRIENTE)){
                if(cuentaBancaria.getSaldo() < 1){
                    saldoNuevo = cuentaBancaria.getSaldo()-valor;
                    cuentaBancaria.setSaldo(saldoNuevo);
                    cuentaBancaria.restarSobregiro(valor);

                }
                else{
                    saldoNuevo = cuentaBancaria.getSaldo() - valor;
                    cuentaBancaria.setSaldo(saldoNuevo);
                }
            }
        }
    }
}


public void agregarCuenta(CuentaBancaria cuentaBancaria) {
   listaCuentas.add(cuentaBancaria);
} 
}
 


