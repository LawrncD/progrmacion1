/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        LOG.info("fin prueba datos vacios");
    }
    @Test
    public void valoresNegativos(){
        LOG.info("Inicio prueba  datos negativos");
        assertThrows(Throwable.class,() -> new Animal ("Kiara","Perro","Criollo", (byte)-45, "Hembra" , "Blanco" , (byte)-20));
            if (!( (byte)-45 <0  || (byte)-20 < 0)) {
                LOG.info("No puedes tener datos negativos");
            }
                else{
                    LOG.info("La prueba paso");
                }
        LOG.info("fin prueba datos negativos");

    }
    @Test
public void numerosGrandes() {
    LOG.info("Inicio pruebas numeros Grandes");
    assertThrows(Throwable.class,() -> new Animal ("Kiara","Perro","Criollo", (byte)200, "Hembra" , "Blanco" , (byte)2000));
     if (!( (byte)200 >= 200 || (byte)2000 > 600)) {
        LOG.info("El peso o la edad sobrepasan los límites");
     } else {
        LOG.info("La prueba pasó: El peso o la no edad sobrepasan los límites");
        }
    LOG.info("Fin de pruebas numeros grandes");
}

}