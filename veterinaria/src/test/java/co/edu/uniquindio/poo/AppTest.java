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

    @Test
    public void datosCompletos(){
    LOG.info("Inicio pruebas datos completos");
    Animal animal = new Animal ("Kiara","Perro","Criollo", (byte)1, "Hembra" , "Blanco" , (byte)20);
    assertEquals("Kiara", animal.nombre());
    assertEquals("Perro", animal.especie());
    assertEquals("Criollo", animal.raza());
    assertEquals((byte)1, animal.edad());
    assertEquals("Hembra", animal.genero());
    assertEquals("Blanco", animal.color());
    assertEquals((byte)20, animal.peso());
    LOG.info("Final prueba datos completos");
    
    }
    
    @Test
    public void datosNulos (){
        LOG.info("Inicio prueba datos nulos");
        assertThrows(Throwable.class,() -> new Animal(null, null,null,(byte)1,null,null,(byte)20));
        LOG.info("Finalizacion prueba datos nulos");

    }

    @Test
    public void datosVacios(){
        LOG.info("Inicio prueba datos vacios");
        assertThrows(Throwable.class,() -> new Animal("", "","",(byte)1,"","",(byte)20));
        LOG.info("Inicio prueba datos vacios");
    }
    @Test
    public void edadNegativa(){
        LOG.info("Inicio prueba datos edad negativa");
        assertThrows(Throwable.class,() -> new Animal ("Kiara","Perro","Criollo", (byte)-45, "Hembra" , "Blanco" , (byte)20));
        LOG.info("Inicio prueba datos edad negativa");

    }
    @Test
    public void pesoNegativo(){
        LOG.info("Inicio prueba datos peso negativo");
        assertThrows(Throwable.class,() -> new Animal ("Kiara","Perro","Criollo", (byte)1, "Hembra" , "Blanco" , (byte)-45));
        LOG.info("Inicio prueba datos peso negativo");

    }
}