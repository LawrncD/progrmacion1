package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
public class CursoTest {
    private static final Logger LOG =  Logger.getLogger(EstudianteTest.class.getName());
   
    @Test
    public void datosCompletos(){
        LOG.info("Inicio datos completos");
        Curso curso1 = new Curso("Programacion 1");
        assertEquals("Programacion 1", curso1.getNombre());
        LOG.info("Fin de pruebas datos completos");

    }

    @Test
    public void registrarEstudiante(){
        LOG.info("Inicio registro estudiante");
        Curso curso1 = new Curso("Programacion 1");
        Estudiante estudiante = new Estudiante ("manuel","Pineda","1092455543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
        curso1.registrarEstudiante(estudiante);
        Estudiante estudiante_2 = new Estudiante("Manuel", "Pineda Varela", "109245543", "3045879300", "manueljksljfkl@jjfasdfl", (byte)18);
        curso1.registrarEstudiante(estudiante_2);
        for(Estudiante nombre : curso1.getlistaEstudiantes()){
            System.out.println(nombre.getNombre());
        }
        LOG.info("Fin registro estudiante");

    }

    @Test
    public void datosNulos(){
        LOG.info("Inicio prueba datos nulos");
        assertThrows(Throwable.class,()-> new Curso(null));
        LOG.info("Fin prueba datos nulos");
    }

    @Test
    public void estudiantesRespetidos(){
        LOG.info("Inicio prueba estudiantes repetidos");
        Curso curso = new Curso ("Programacion 1");
        Estudiante estudiante_1 = new Estudiante("Manuel", "Pineda Varela", "1092455543", "3045879300", "manueljksljfkl@jjfasdfl", (byte)18);
        Estudiante estudiante_2 = new Estudiante("Manuel", "Pineda Varela", "1092455543", "3045879300", "manueljksljfkl@jjfasdfl", (byte)18);
        curso.registrarEstudiante(estudiante_2);
        curso.registrarEstudiante(estudiante_1);
        LOG.info("Fin prueba datos respetidos");

        

    }
}
