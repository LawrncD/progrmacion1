package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());


    @Test
    public void datosCompletos(){
        LOG.info("Inicio Prueba datos completos");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        assertEquals("Amigos Peludos", veterinaria.getNombre());
        LOG.info("Fin de la prueba datos completos");
    }

    @Test
    public void registrarMascota(){
        LOG.info("Inicio registro mascota");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota = new Mascota("Kiara", "perro", "criollo", (byte)5, "Hembra", "Blanco", (byte)20, "1092455543"); 
        veterinaria.registrarMascota(mascota);
        LOG.info("Fin registro mascota");

    }

    @Test
    public void datosNulos(){
        LOG.info("Inicio Prueba datos nulos");
        assertThrows(Throwable.class,()-> new Veterinaria(null));
        LOG.info("Fin de la prueba datos nulos");
    }
}
