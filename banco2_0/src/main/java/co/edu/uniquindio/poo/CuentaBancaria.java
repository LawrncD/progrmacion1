package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {
    private final String nombreTirular;
    private final String apellidosTitular;
    private final String numeroCuenta;
    private static int saldo;
    private static boolean estado;
    private Collection<Transaccion> listaTransaccions;
    protected Object getNumeroCuenta;

    public CuentaBancaria(String nombreTirular, String apellidosTitular, String numeroCuenta) {
        this.nombreTirular = nombreTirular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        CuentaBancaria.saldo = 0;
        CuentaBancaria.estado = true;
        this.listaTransaccions = new LinkedList<Transaccion>();
    }

    public String getNombreTirular() {
        return nombreTirular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        CuentaBancaria.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        CuentaBancaria.estado = estado;
    }

    public Collection<Transaccion> getListaTransaccions() {
        return listaTransaccions;
    }

    public void setListaTransaccions(Collection<Transaccion> listaTransaccions) {
        this.listaTransaccions = listaTransaccions;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [nombreTirular=" + nombreTirular + ", apellidosTitular=" + apellidosTitular
                + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", estado=" + estado + ", listaTransaccions="
                + listaTransaccions + "]";
    }

    public abstract void retirar(int valor);

    public static void depositar(int valor) {
        assert valor > 0 : "Deposita un valor positivo";
        saldo = saldo + valor;
        estado = true;
    }

    public void agregarTransaccion(Transaccion transaccion) {
     listaTransaccions.add(transaccion);
    }
}
