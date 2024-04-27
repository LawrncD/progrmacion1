package co.edu.uniquindio.poo;

public class CuentaBancaria {
    private String nombreTitular;
    private String apellidoTitular;
    private String numeroCuenta;
    private double saldo;
    private TipoCuenta tipoCuenta;
    public boolean actividad;
    public double sobregiro;

    public CuentaBancaria(String nombreTitular, String apellidoTitular, String numeroCuenta, TipoCuenta tipoCuenta) {
        assert nombreTitular != null && !nombreTitular.isBlank();
        assert apellidoTitular != null && !apellidoTitular.isBlank();
        assert numeroCuenta != null && !numeroCuenta.isBlank();
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
        this.actividad = false;
        if (tipoCuenta.equals(TipoCuenta.CORRIENTE)) {
            this.sobregiro = TipoCuenta.CORRIENTE.valor;
        }
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidoTitular() {
        return apellidoTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo2) {
        this.saldo = saldo2;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public boolean isActividad() {
        return actividad;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [nombreTitular=" + nombreTitular + ", apellidoTitular=" + apellidoTitular
                + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + ", actividad="
                + actividad + "]";
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;

    }

    public void sumarSobregiro(double valor) {
        sobregiro = sobregiro + valor;

        if (sobregiro > TipoCuenta.CORRIENTE.valor) {

            sobregiro = TipoCuenta.CORRIENTE.valor;
        }
    }

    public void restarSobregiro(double valor) {
        sobregiro = sobregiro - valor;
    }

    public boolean verificarActividad() {
        boolean actividad = false;
        if (saldo > 0) {
            actividad = true;

        } else {
            actividad = false;
        }
        return actividad;
    }
}
