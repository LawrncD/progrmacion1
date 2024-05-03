package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BancoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void realizarDeposito (){
        LOG.info("Inicio test realizar deposito");
        var banco = new Banco("BBVA");
        var cuenta = new CuentaCorriente(new Titular("Valentina", "Rodriguez"), 819280, 
        100000, false, 50000);
        banco.añadirCuentasBancarias(cuenta);
        cuenta.retirarDinero(130000);
        assertEquals(-30000, cuenta.getSaldo());
       assertEquals(20000, cuenta.getLimiteSobregiro());
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getLimiteSobregiro());
    }

    @Test 
    public void transferirDinero (){
        LOG.info("Inicio test transferir dinero");
        var banco = new Banco("Davivienda");
        var cuenta = new CuentaCorriente(new Titular("a", "b"), 1001000200,
         300000, true, 50000);
        var cuenta2 = new CuentaCorriente(new Titular("a", "b"), 2002000100, 
         40000, true, 50000);
        banco.añadirCuentasBancarias(cuenta);
        banco.añadirCuentasBancarias(cuenta2);
        var transacción = new Transaccion("9182", 100000, LocalDate.of(2024, 05, 02), "a", false, TipoTransaccion.DEPOSITO);
        transacción.transferirDinero(cuenta, cuenta2);
        System.out.println(cuenta2.getSaldo());
        
        
         

    }
//lawrnece patrones de diseño
}