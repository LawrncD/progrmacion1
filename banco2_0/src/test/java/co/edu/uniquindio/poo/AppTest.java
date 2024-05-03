/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        
        Banco Bancolombia = new Banco("Bancolombia");
        Ahorro cuneta_1 = new Ahorro("Manuel", "Pineda", "1092455543", 0.001);
        Corriente cuenta_2 = new Corriente("Laura", "Urrea", "1094891731", 50000);

       Bancolombia.agregarCuenta(cuenta_2);
       Bancolombia.agregarCuenta(cuneta_1);
       
       
        cuenta_2.depositar(20000);
        Transaccion transaccion_1 = new Transaccion("1001", 20000, LocalDate.now(), "de las fufas",  Tipo.DEPOSITO);
        cuenta_2.agregarTransaccion(transaccion_1);
        System.out.println("Saldo despues del deposito: "+cuenta_2.getSaldo());
        cuenta_2.retirar(80000);
        System.out.println("Saldo despues del retiro: "+cuenta_2.getSaldo());
        System.out.println("Saldo del sobregiro despues del retiro: "+cuenta_2.getSobregiro());

        cuneta_1.depositar(50000);
        System.out.println("Saldo despues del deposito: "+cuneta_1.getSaldo());
        cuneta_1.retirar(10000);
        System.out.println("Saldo despues del retiro: "+cuneta_1.getSaldo());

        
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}
