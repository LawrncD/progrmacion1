/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    

    @Test
    public void datosNulos(){
        LOG.info("Inicio de pruebas datos nulos ");
        Estudiante_null estudiante_null = new Estudiante_null (null,null,null,null,null,(byte)0);
        assertEquals("Manuel", estudiante_null.nombres());
        assertEquals("Pineda Varela", estudiante_null.apellidos());
        assertEquals("1092455543", estudiante_null.numerodeindentificacion());
        assertEquals("3045879300", estudiante_null.telefono());
        assertEquals("manuel.pinedav@uqvirtual.edu.co", estudiante_null.correo());
        assertEquals((byte)18, estudiante_null.edad());
        LOG.info("Finalizacion prueba datos nulos");
    }

    @Test 
    public void datosVacios(){
        LOG.info("Inicio de pruebas datos vacios ");
        Estudiante_vacio estudiante_vacio = new Estudiante_vacio ("","","","","",(byte)0);
        assertEquals("Manuel", estudiante_vacio.nombres());
        assertEquals("Pineda Varela", estudiante_vacio.apellidos());
        assertEquals("1092455543", estudiante_vacio.numerodeindentificacion());
        assertEquals("3045879300", estudiante_vacio.telefono());
        assertEquals("manuel.pinedav@uqvirtual.edu.co", estudiante_vacio.correo());
        assertEquals((byte)18, estudiante_vacio.edad());
        LOG.info("Finalizacion prueba datos vacios");
    }
    @Test
    public void edadNegativa(){
        LOG.info("Inicio de pruebas edad negativa ");
        Estudiante_negativo estudiante_negativo = new Estudiante_negativo ("Manuel","Pineda Varela","1092455543","3045879300","manuel.pinedav@uqvirtual.edu.co",(byte)-24);
        assertEquals("Manuel", estudiante_negativo.nombres());
        assertEquals("Pineda Varela", estudiante_negativo.apellidos());
        assertEquals("1092455543", estudiante_negativo.numerodeindentificacion());
        assertEquals("3045879300", estudiante_negativo.telefono());
        assertEquals("manuel.pinedav@uqvirtual.edu.co", estudiante_negativo.correo());
        assertEquals((byte)18, estudiante_negativo.edad());
        LOG.info("Finalizacion prueba edad negativa");

    }
    @Test
    public void correoMalo(){
        LOG.info("Inicio de pruebas correo malo ");
        Estudiante_correo_malo estudiante_correo_malo = new Estudiante_correo_malo ("Manuel","Pineda Varela","1092455543","3045879300","manuel.co",(byte)18); 
        assertEquals("Manuel", estudiante_correo_malo.nombres());
        assertEquals("Pineda Varela", estudiante_correo_malo.apellidos());
        assertEquals("1092455543", estudiante_correo_malo.numerodeindentificacion());
        assertEquals("3045879300", estudiante_correo_malo.telefono());
        assertEquals("manuel.pinedav@uqvirtual.edu.co", estudiante_correo_malo.correo());
        assertEquals((byte)18, estudiante_correo_malo.edad());
        LOG.info("Finalizacion prueba correo malo");

    }
}