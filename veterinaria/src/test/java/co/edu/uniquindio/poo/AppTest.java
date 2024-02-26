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
        assertThrows(Throwable.class, ()-> new Animal ("Lupe","Perro","Criollo", (byte)-3, "Hembra" , "Cafe" , (byte)-54));
        int peso = (byte)-54;   
        int edad = (byte)-3;
        if ( edad <0) {
                LOG.info("la edad no puede tener datos negativos");
            }
        if (peso < 0) {
             LOG.info("el peso no puede tener datos negativos");
            }
        LOG.info("fin prueba datos negativos");

    }
    @Test
    public void numerosGrandes() {
        LOG.info("Inicio pruebas numeros Grandes");
        assertThrows(Throwable.class, ()-> new Animal ("Lupe","Perro","Criollo", (byte)200, "Hembra" , "Cafe" , (byte)2000));
        int peso = (byte)2000;   
        int edad = (byte)200;
        if ( edad >=200) {
           LOG.info("la edad no puede tener datosdatos tan grandes");
        }
        if (peso > 600) {
            LOG.info("el peso no puede tener datos tan grandes");
         }
     LOG.info("Fin de pruebas numeros grandes");
}

}