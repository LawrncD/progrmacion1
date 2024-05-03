package co.edu.uniquindio.poo;

public class CuentaAhorros extends CuentaBancaria{
    private  double tasaInteres;;

    public CuentaAhorros (Titular titular, int numeroCuenta, double saldo,boolean estadoCuenta, double tasaInteres){
        super(titular, numeroCuenta, saldo, estadoCuenta);
        this.tasaInteres = tasaInteres;

    }

    public double getTasaInteres (){
        return tasaInteres;
    }

    public void retirarDinero(double dinero){
        assert dinero > 0;
        assert dinero <= saldo;
        saldo -= dinero;
        if (saldo == 0) {
            estadoCuenta = false;
        }
    }

    // arquitectura - como se distribuyen su ubicacion y como se conectan componentes 


}