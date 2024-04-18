/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Collection;
import java.time.LocalDate;
import java.util.List;
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
    public void TodoCompleto() {
        LOG.info("Iniciado test TodoCompleto");
        Drogueria drogueria = new Drogueria("Municipal");

        Medicamento acetaminofen = new Medicamento("00123", "acetaminofen", "cada 8 horas", 1000, 15, "Jaimes", 8);
        Hogar jabon = new Hogar("00124", "Evon", "Para el cuerpo", 8000, 12, "Evon", "Usar solamente en el cuerpo");
        CuidadoPersonal crema = new CuidadoPersonal("00124", "crema sicatricure", "cicatrices", 15000, 13, "Bayer", "No se ");

        Cliente Maria = new Cliente("Maria", "Torres", "103565946", "CAM", "3045987878");

        Empleado empleado_1 = new Empleado("Raul", "caicedo", "103332656", "corbones", "30222549", 1200000);

        Gerente gerente = new Gerente("Martin", "martinez", "103326594", "colinas", "3022264974", 2000000);

        Pedido pedido = new Pedido(LocalDate.now(), 5, acetaminofen, Maria);

        drogueria.registrarProducto(acetaminofen);
        drogueria.registrarProducto(jabon);
        drogueria.registrarProducto(crema);
        drogueria.registrarCliente(Maria);

        drogueria.registrarEmpleado(empleado_1);
        drogueria.registrarEmpleado(gerente);

        drogueria.registrarPedido(pedido);



        LOG.info("Finalizando test TodoCompleto");
    }
    @Test
    public void pedidos_sin_stock() {
        LOG.info("Iniciado test pedidos_sin_stock");
        Drogueria drogueria = new Drogueria("Municipal");

        Medicamento acetaminofen = new Medicamento("00123", "acetaminofen", "cada 8 horas", 1000, 0, "Jaimes", 8);
        Hogar jabon = new Hogar("00124", "Evon", "Para el cuerpo", 8000, 12, "Evon", "Usar solamente en el cuerpo");
        CuidadoPersonal crema = new CuidadoPersonal("00124", "crema sicatricure", "cicatrices", 15000, 13, "Bayer", "No se ");

        Cliente Maria = new Cliente("Maria", "Torres", "103565946", "CAM", "3045987878");

        Empleado empleado_1 = new Empleado("Raul", "caicedo", "103332656", "corbones", "30222549", 1200000);

        Gerente gerente = new Gerente("Martin", "martinez", "103326594", "colinas", "3022264974", 2000000);

        Pedido pedido = new Pedido(LocalDate.now(), 5, acetaminofen, Maria);

        drogueria.registrarProducto(acetaminofen);
        drogueria.registrarProducto(jabon);
        drogueria.registrarProducto(crema);
        drogueria.registrarCliente(Maria);

        drogueria.registrarEmpleado(empleado_1);
        drogueria.registrarEmpleado(gerente);

        assertThrows(Throwable.class, ()-> drogueria.registrarPedido(pedido));



        LOG.info("Finalizando test pedidos_sin_stock");
    }
        @Test
        public void prductos_stock_100() {
            LOG.info("Iniciado test prductos_stock_100");
            Drogueria drogueria = new Drogueria("Municipal");
    
            Medicamento acetaminofen = new Medicamento("00123", "acetaminofen", "cada 8 horas", 1000, 1, "Jaimes", 8);
            Hogar jabon = new Hogar("00124", "Evon", "Para el cuerpo", 8000, 200, "Evon", "Usar solamente en el cuerpo");
            CuidadoPersonal crema = new CuidadoPersonal("00124", "crema cicatricure", "cicatrices", 15000, 100, "Bayer", "No se ");
    
            Cliente Maria = new Cliente("Maria", "Torres", "103565946", "CAM", "3045987878");
    
            Empleado empleado_1 = new Empleado("Raul", "caicedo", "103332656", "corbones", "30222549", 1200000);
    
            Gerente gerente = new Gerente("Martin", "martinez", "103326594", "colinas", "3022264974", 2000000);
    
            Pedido pedido = new Pedido(LocalDate.now(), 5, acetaminofen, Maria);
    
            drogueria.registrarProducto(acetaminofen);
            drogueria.registrarProducto(jabon);
            drogueria.registrarProducto(crema);
            drogueria.registrarCliente(Maria);
    
            drogueria.registrarEmpleado(empleado_1);
            drogueria.registrarEmpleado(gerente);
    
            Collection<Producto>listaProductosStock100 = drogueria.obtenerStockMayorCien();
            Collection<Producto>listaProductosDeseados = List.of(jabon,crema);
            assertIterableEquals(listaProductosStock100, listaProductosDeseados);
            for(Producto producto : listaProductosStock100){
                System.err.println(producto.getNombre());
            }

    
    
    
            LOG.info("Finalizando test prductos_stock_100");
    

}
}