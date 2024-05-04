package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {
    private final String nombreTirular;
    private final String apellidosTitular;
    private final String numeroCuenta;
    public  int saldo;
    private  boolean estado;
    private Collection<Transaccion> listaTransaccions;
    protected Object getNumeroCuenta;

    public CuentaBancaria(String nombreTirular, String apellidosTitular, String numeroCuenta) {
        this.nombreTirular = nombreTirular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.estado = false;
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

    public  int getSaldo() {
        return saldo;
    }

    public  void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    public void depositar(int valor) {
        assert valor > 0 : "Deposita un valor positivo";
        int saldoNuevo = getSaldo() + valor;
        setSaldo(saldoNuevo);
        setEstado(true);
    }

    public void agregarTransaccion(Transaccion transaccion) {
     listaTransaccions.add(transaccion);
    }
    public String consultarSaldo() {
       String saldoConsultado = "";
       int valorConsultado = 0;
        if(isEstado()== true){
            valorConsultado = valorConsultado + getSaldo();
            saldoConsultado = "Su saldo es de: " + getSaldo();
       }
       else{
        saldoConsultado = "Su cuenta esta desactivada";
       }
        return saldoConsultado;
    }

}
