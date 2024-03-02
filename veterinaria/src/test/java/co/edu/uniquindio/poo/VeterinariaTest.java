package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Collection;
import java.util.LinkedList;
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

    @Test
    public void mascotasRepetidas(){
        LOG.info("Inicio prueba mascotas repetidas");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota = new Mascota("Kiara", "perro", "criollo", (byte)5, "Hembra", "Blanco", (byte)20, "1092455543");
        veterinaria.registrarMascota(mascota);
        Mascota mascota2 = new Mascota("max", "perro", "labrador", (byte)5, "Macho", "amarillo", (byte)20, "1092455543");
        veterinaria.registrarMascota(mascota2);
        LOG.info("Fin prueba mascotas repetidas");

    }

    @Test
    public void obteberMayoresde10Años(){
        LOG.info("Inicio prueba mascotas obtener nombres");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

        Mascota mascota1 = new Mascota("Kiara", "perro", "criollo", (byte)12, "Hembra", "Blanco", (byte)20, "1092455543");
        Mascota mascota2 = new Mascota("Max", "perro", "labrador", (byte)8, "Macho", "amarillo", (byte)20, "109245543");
        Mascota mascota3 = new Mascota("Bella", "gato", "siames", (byte)15, "Hembra", "gris", (byte)10, "109245555");
        Mascota mascota4 = new Mascota("Rocky", "perro", "bulldog", (byte)7, "Macho", "blanco", (byte)25, "109245556");
        Mascota mascota5 = new Mascota("Luna", "gato", "persa", (byte)11, "Hembra", "blanco", (byte)8, "109245557");

        veterinaria.registrarMascota(mascota1);
        veterinaria.registrarMascota(mascota2);
        veterinaria.registrarMascota(mascota3);
        veterinaria.registrarMascota(mascota4);
        veterinaria.registrarMascota(mascota5);

        Collection<Mascota> mascotasMayoresDeDiez = new LinkedList<Mascota>();

        for (Mascota mascota : veterinaria.getlisMascotas()) {
            if (mascota.getEdad() > 10) {
              mascotasMayoresDeDiez.add(mascota);
         }
}

        System.out.println("Mascotas mayores de 10 años:");
        for (Mascota mascota : mascotasMayoresDeDiez) {
            System.out.println(mascota.getNombre());
        }
        LOG.info("fin prueba mascotas obtener nombres");
    }
    
}
