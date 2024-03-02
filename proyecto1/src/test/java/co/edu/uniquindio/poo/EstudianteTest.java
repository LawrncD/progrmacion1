/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */ 
public class EstudianteTest {
    private static final Logger LOG =  Logger.getLogger(EstudianteTest.class.getName());
    
    @Test
    public void datosCompletos(){
        LOG.info("Inicio de pruebas datos completos ");
        Estudiante estudiante = new Estudiante ("Manuel","Pineda Varela","1092455543","3045879300","manuel.pinedav@uqvirtual.edu.co",(byte)18); 
        assertEquals("Manuel", estudiante.nombres());
        assertEquals("Pineda Varela", estudiante.apellidos());
        assertEquals("1092455543", estudiante.numerodeindentificacion());
        assertEquals("3045879300", estudiante.telefono());
        assertEquals("manuel.pinedav@uqvirtual.edu.co", estudiante.correo());
        assertEquals((byte)18, estudiante.edad());
        LOG.info("Finalizacion prueba datos completos");
    }
    
}