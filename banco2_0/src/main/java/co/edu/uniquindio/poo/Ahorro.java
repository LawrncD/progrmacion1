package co.edu.uniquindio.poo;

public class Ahorro extends CuentaBancaria{
    private final double interes;

    public Ahorro(String nombreTirular, String apellidosTitular, String numeroCuenta, double interes) {
        super(nombreTirular, apellidosTitular, numeroCuenta);
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    @Override
    public String toString() {
        return "Ahorro [interes=" + interes + "]";
    }

    @Override
    public void retirar(int valor) {
        assert valor > 0;
        if (getSaldo() >= valor) {
            int saldoNuevo = getSaldo() - valor;
            setSaldo(saldoNuevo);
        } else {
           System.out.print("No tienes suficiente saldo para este retiro.");
        }
    }

    public static void crearCuentaCorriente(String nombreTitular, String apellidoTitular, String numeroCuenta,
            int interes) {
        Ahorro cuenta_Ahorro = new Ahorro(nombreTitular, apellidoTitular, numeroCuenta, interes);
        Banco.agregarCuenta(cuenta_Ahorro);
    }

    
    
}
