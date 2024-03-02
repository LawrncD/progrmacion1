/**
 * Clase para probar el funcionamiento del código
 * @author Manuel PIneda Varela
 * @since 2024
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());
    @Test
    public void datosCompletos(){
    LOG.info("Inicio pruebas datos completos");
    Mascota mascota = new Mascota ("Kiara","Perro","Criollo", (byte)1, "Hembra" , "Blanco" , (byte)20,"1092455543");
    assertEquals("Kiara", mascota.nombre());
    assertEquals("Perro", mascota.especie());
    assertEquals("Criollo", mascota.raza());
    assertEquals((byte)1, mascota.edad());
    assertEquals("Hembra", mascota.genero());
    assertEquals("Blanco", mascota.color());
    assertEquals((byte)20, mascota.peso());
    LOG.info("Final prueba datos completos");
    
    }
    
    @Test
    public void datosNulos (){
        LOG.info("Inicio prueba datos nulos");
        assertThrows(Throwable.class,() -> new Mascota(null, null,null,(byte)1,null,null,(byte)20,null));
        LOG.info("Finalizacion prueba datos nulos");

    }

    @Test
    public void datosVacios(){
        LOG.info("Inicio prueba datos vacios");
        assertThrows(Throwable.class,() -> new Mascota("", "","",(byte)1,"","",(byte)20,""));
        LOG.info("fin prueba datos vacios");
    }
    @Test
    public void valoresNegativos(){
        LOG.info("Inicio prueba  datos negativos");
        assertThrows(Throwable.class, ()-> new Mascota ("Lupe","Perro","Criollo", (byte)-3, "Hembra" , "Cafe" , (byte)-54,"1092455543"));
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
        assertThrows(Throwable.class, ()-> new Mascota ("Lupe","Perro","Criollo", (byte)200, "Hembra" , "Cafe" , (byte)2000,"1092455543"));
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