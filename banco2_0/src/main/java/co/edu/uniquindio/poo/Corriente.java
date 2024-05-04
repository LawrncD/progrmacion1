package co.edu.uniquindio.poo;

import javax.swing.JTextField;

public class Corriente extends CuentaBancaria{
    private int sobregiro;

    public Corriente(String nombreTirular, String apellidosTitular, String numeroCuenta, int sobregiro) {
        super(nombreTirular, apellidosTitular, numeroCuenta);
        this.sobregiro = sobregiro;
    }

    public int getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(int sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
        return "Corriente [sobregiro=" + sobregiro + "]";
    }

    @Override
    public void retirar(int valor) {
        assert valor > 0;
        assert sobregiro > 0;
        if(valor<=getSaldo()){
            int saldoNuevo = getSaldo() - valor;
            setSaldo(saldoNuevo);
        }
        else if(sobregiro+getSaldo()>valor){
            
            setSaldo(getSaldo()-valor);
            int sobregiroNuevo = sobregiro - valor;
            sobregiro = sobregiroNuevo;
        }
        else{
            System.out.println("No tienes suficiente dinero(Pobre) ");
        }
        
    }

    public static void crearCuentaCorriente(String nombreTitularField, String apellidoField,
    String numeroCuentaField, int sobregiro) {
        Corriente cuentaCorriente = new Corriente(nombreTitularField, apellidoField, numeroCuentaField, sobregiro);
        Banco.agregarCuenta(cuentaCorriente);

    }

    
    
    
}
