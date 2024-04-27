/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        public void prueba() {
                LOG.info("Iniciado test prueba");

                Banco bancolombia = new Banco("Bancolombia");

                CuentaBancaria cuentaManuel = new CuentaBancaria("Manuel", "Pineda", "1092455543",
                                TipoCuenta.CORRIENTE);
                bancolombia.agregarCuenta(cuentaManuel);

                System.out.println(
                                "La actividad de la cuenta  cuentaManuel antes del deposito: "
                                                + cuentaManuel.verificarActividad());
                bancolombia.depositar(cuentaManuel, 100000);
                System.out.println(
                                "La actividad de la cuenta cuentaManuel despues del deposito: "
                                                + cuentaManuel.verificarActividad());
                System.out.println("Saldo después del depósito cuentaManuel: " + cuentaManuel.getSaldo());
                bancolombia.retirar(cuentaManuel, 50000);
                System.out.println("Saldo después del retiro cuentaManuel: " + cuentaManuel.getSaldo());
                System.out.println("Saldo del sobregiro cuentaManuel: " + cuentaManuel.getSobregiro());

                CuentaBancaria cuentaBancaria2 = new CuentaBancaria("Manuel", "pineda", "1092455543",
                                TipoCuenta.AHORROS);
                bancolombia.agregarCuenta(cuentaBancaria2);

                bancolombia.depositar(cuentaBancaria2, 100000);
                System.out.println("Saldo después del depósito cuentaBancaria2: " + cuentaBancaria2.getSaldo());
                bancolombia.retirar(cuentaBancaria2, 50000);
                System.out.println("Saldo después del retiro cuentaBancaria2: " + cuentaBancaria2.getSaldo());
                System.out.println(cuentaBancaria2.getSobregiro());

                CuentaBancaria cuentaBancaria3 = new CuentaBancaria("Manuel", "pineda", "1092455543",
                                TipoCuenta.CORRIENTE);
                bancolombia.agregarCuenta(cuentaBancaria3);

                System.out.println("La actividad de la cuenta antes del deposito cuentaBancaria3: "
                                + cuentaBancaria3.verificarActividad());
                bancolombia.retirar(cuentaBancaria3, 50000);
                System.out.println("La actividad de la cuenta antes del deposito cuentaBancaria3: "
                                + cuentaBancaria3.verificarActividad());
                System.out.println("Saldo después del retiro cuentaBancaria3: " + cuentaBancaria3.getSaldo());
                System.out.println("Saldo del sobregiro cuentaBancaria3: " + cuentaBancaria3.getSobregiro());
                bancolombia.depositar(cuentaBancaria3, 100000);
                System.out.println("Saldo después del depósito cuentaBancaria3: " + cuentaBancaria3.getSaldo());
                System.out.println("Saldo del sobregiro cuentaBancaria3:" + cuentaBancaria3.getSobregiro());
                System.out.println("La actividad de la cuenta despues del deposito cuentaBancaria3: "
                                + cuentaBancaria3.verificarActividad());

                CuentaBancaria cuenta4 = new CuentaBancaria("samuel", "2", "48454", TipoCuenta.AHORROS);
                bancolombia.agregarCuenta(cuenta4);

                bancolombia.retirar(cuenta4, 50000);
                System.out.println("Saldo de la cuenta4 despues del retiro: " + cuenta4.getSaldo());

                LOG.info("Finalizando test prueba");
        }

        @Test
        public void crearBanco() {
                LOG.info("Inicio Prueba crearBanco");
                Banco avanza = new Banco("Avanza");
                assertEquals("Avanza", avanza.getNombre());
                LOG.info("Fin prueba crearBanco");
        }

        @Test
        public void agregarSaldoNegativo() {
                LOG.info("Iniciado test agregarSaldoNegativo");
                Banco Bancolombia = new Banco("Bancolombia");
                CuentaBancaria CuentaManuel = new CuentaBancaria("Manuel", "Pineda", "1092455543",
                                TipoCuenta.CORRIENTE);
                Bancolombia.agregarCuenta(CuentaManuel);
                assertThrows(Throwable.class, () -> Bancolombia.depositar(CuentaManuel, -50000));
                LOG.info("Finalizando test agregarSaldoNegativo");
        }

        @Test
        public void retirarValorNegativo() {
                LOG.info("Iniciado test retirarValorNegativo");
                Banco Bancolombia = new Banco("Bancolombia");
                CuentaBancaria CuentaManuel = new CuentaBancaria("Manuel", "Pineda", "1092455543", TipoCuenta.AHORROS);
                Bancolombia.agregarCuenta(CuentaManuel);
                assertThrows(Throwable.class, () -> Bancolombia.retirar(CuentaManuel, -10000));

                LOG.info("Finalizando test retirarValorNegativo");

        }

        @Test
        public void datosNulos() {
                LOG.info("Iniciado test datosNulos");
                assertThrows(Throwable.class,  ()-> {Banco banco = new Banco(null);});
                assertThrows(Throwable.class, () -> {
                        CuentaBancaria cuentaBancaria = new CuentaBancaria(null, null, null, TipoCuenta.AHORROS);
                    });
                LOG.info("Finalizando test datosNulos");
        }
}