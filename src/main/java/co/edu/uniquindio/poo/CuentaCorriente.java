package co.edu.uniquindio.poo;

public class CuentaCorriente extends CuentaBancaria{
    private  double limiteSobregiro;

    public CuentaCorriente (Titular titular, int numeroCuenta, double saldo,boolean estadoCuenta, double limiteSobregiro){
        super(titular, numeroCuenta, saldo, estadoCuenta);
        this.limiteSobregiro = limiteSobregiro;

    }

    public double getLimiteSobregiro(){
        return limiteSobregiro;
    }

    public void retirarDinero (double dinero){
        assert dinero > 0;
        assert dinero <= saldo + limiteSobregiro;
        saldo-= dinero;
        if (saldo < dinero){
            limiteSobregiro += saldo;
            }
    }

}




/*   private String nombre;
    private List<CuentaBancaria> cuentas;

    public CuentaCorriente(String nombre) { //banco
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void depositar(String numeroCuenta, double monto) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                cuenta.depositar(monto);
                return;
            }
        }
        System.out.println("La cuenta con número " + numeroCuenta + " no existe en el banco.");
    }

    public void retirar(String numeroCuenta, double monto) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                cuenta.retirar(monto);
                return;
            }
        }
        System.out.println("La cuenta con número " + numeroCuenta + " no existe en el banco.");
    }

    public void mostrarEstadoCuentas() {
        System.out.println("Estado de cuentas del banco " + nombre + ":");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Titular: " + cuenta.getTitularNombre() + " " + cuenta.getTitularApellido());
            System.out.println("Saldo: " + cuenta.getSaldo());
            System.out.println("Cuenta activa: " + cuenta.isActiva());
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco("MiBanco");

        CuentaAhorros cuentaAhorros = new CuentaAhorros("Juan", "Perez", "123456");
        banco.agregarCuenta(cuentaAhorros);

        CuentaCorriente cuentaCorriente = new CuentaCorriente("Maria", "Gonzalez", "654321");
        banco.agregarCuenta(cuentaCorriente);

        banco.depositar("123456", 1000);
        banco.depositar("654321", 500);
        banco.retirar("654321", 600);

        banco.mostrarEstadoCuentas();
    }
}

class CuentaBancaria {
    private String titularNombre;
    private String titularApellido;
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    private boolean activa;

    public CuentaBancaria(String titularNombre, String titularApellido, String numeroCuenta, String tipoCuenta) {
        this.titularNombre = titularNombre;
        this.titularApellido = titularApellido;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.tipoCuenta = tipoCuenta;
        this.activa = false;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            if (saldo > 0) {
                activa = true;
            }
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
                if (saldo == 0) {
                    activa = false;
                }
            } else if (tipoCuenta.equals("corriente")) {
                double limiteSobregiro = obtenerLimiteSobregiro();
                if (monto <= limiteSobregiro) {
                    saldo -= monto;
                    if (saldo == 0) {
                        activa = false;
                    }
                }
            }
        }
    }

    public boolean isActiva() {
        return activa;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitularNombre() {
        return titularNombre;
    }

    public String getTitularApellido() {
        return titularApellido;
    }

    protected double obtenerLimiteSobregiro() {
        if (tipoCuenta.equals("corriente")) {
            // Lógica para obtener el límite de sobregiro
            return 1000; // Ejemplo de límite de sobregiro de $1000
        } else {
            return 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String titularNombre, String titularApellido, String numeroCuenta) {
        super(titularNombre, titularApellido, numeroCuenta, "ahorros");
        this.tasaInteres = 0.05; // Ejemplo de tasa de interés del 5%
    }

    public double calcularInteres() {
        return getSaldo() * tasaInteres;
    }
}

class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String titularNombre, String titularApellido, String numeroCuenta) {
        super(titularNombre, titularApellido, numeroCuenta, "corriente");
    }

    @Override
    protected double obtenerLimiteSobregiro() {
        if (getTipoCuenta().equals("corriente")) {
            // Lógica para obtener el límite de sobregiro
            return 1000; // Ejemplo de límite de sobregiro de $1000
        } else {
            return 0;
        }
    }
}

*/
