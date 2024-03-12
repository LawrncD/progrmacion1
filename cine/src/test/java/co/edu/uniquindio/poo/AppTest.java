
package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void datosCompletos(){
    Boleta boleta = new Boleta("Avengers: Endgame", LocalDateTime.now(), 25000.0);
    assertEquals("Avengers: Endgame", boleta.getNombreFuncion());
    assertEquals(25000.0, boleta.getValorPagado());
    System.out.println(boleta.getNombreFuncion());
    System.out.println(boleta.getFechaHoraFuncion());
    System.out.println(boleta.getValorPagado());
    System.out.println(boleta.getClass());
    }


}