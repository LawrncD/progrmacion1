package co.edu.uniquindio.poo;

public enum TipoCuenta {
    AHORROS (0.001),
    CORRIENTE(1000000);
    public final double valor;

    private TipoCuenta(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
}
