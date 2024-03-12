package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collection;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import java.util.List;
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
        Estudiante estudiante = new Estudiante ("Samnuel","Pineda","1092455543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
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
        Estudiante estudiante_1 = new Estudiante("Manuel", "Pineda Varela", "1092455543", "3045879300", "manueljk@sljfkl@jjfasdfl", (byte)18);
        curso.registrarEstudiante(estudiante_1);
        assertThrows(Throwable.class, ()-> curso.registrarEstudiante(estudiante_1)); 
        LOG.info("Fin prueba datos respetidos");
    }

    @Test
    public void obtenerEstudiante(){
        LOG.info("Inicio prueba  ontener Estudiante");
        Curso curso = new Curso ("Programacion 1");
        Estudiante estudiante_1 = new Estudiante("Manuel", "Pineda Varela", "1092455543", "3045879300", "manueljk@sljfkl@jjfasdfl", (byte)18);
        curso.registrarEstudiante(estudiante_1);
        assertThrows(Throwable.class,()-> curso.getEstudiante("102455543"));
        LOG.info("Inicio prueba  Obtener estudiante");


    }
    @Test
    public void estudiantesAlfabeticos(){
        LOG.info("Inicio prueba  estudiantesAlfabeticos");
        Curso curso = new Curso ("Programacion 1");
        Estudiante estudiante_1 = new Estudiante("Manuel", "Pineda Varela", "1092455543", "3045879300", "manueljk@sljfkl@jjfasdfl", (byte)18);
        curso.registrarEstudiante(estudiante_1);
        Estudiante estudiante = new Estudiante ("Samnuel","Pineda","10924543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
        curso.registrarEstudiante(estudiante);
        Estudiante estudiante2 = new Estudiante ("antiago","Pineda","10928455543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
        curso.registrarEstudiante(estudiante2);

        Collection<Estudiante>listaOrdenadaObtenida = curso.getlistaEstudiantesordenados();
        Collection<Estudiante>listaOrdenadaDeseada = List.of(estudiante_1,estudiante,estudiante2);
        assertIterableEquals(listaOrdenadaObtenida, listaOrdenadaDeseada);
        for(Estudiante nombre : curso.getlistaEstudiantesordenados()){
            System.out.println(nombre.getNombre());
        }
        LOG.info("Inicio prueba estudiantesAlfabeticos");

    }
    @Test
    public void estudiantesEdadDesendente(){
        LOG.info("Inicio prueba  estudiantesAlfabeticos");
        Curso curso = new Curso ("Programacion 1");
        Estudiante estudiante_1 = new Estudiante("Manuel", "Pineda Varela", "1092455543", "3045879300", "manueljk@sljfkl@jjfasdfl", (byte)18);
        curso.registrarEstudiante(estudiante_1);
        Estudiante estudiante = new Estudiante ("Samnuel","Pineda","10924543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
        curso.registrarEstudiante(estudiante);
        Estudiante estudiante2 = new Estudiante ("antiago","Pineda","10928455543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
        curso.registrarEstudiante(estudiante2);

        Collection<Estudiante>listaOrdenadaObtenida = curso.getlistaEstudiantesedadDesendente();
        Collection<Estudiante>listaOrdenadaDeseada = List.of(estudiante,estudiante2,estudiante_1);
        assertIterableEquals(listaOrdenadaObtenida, listaOrdenadaDeseada);
        for(Estudiante edad : curso.getlistaEstudiantesedadDesendente()){
            System.out.println(edad.getNombre());
        }
        LOG.info("Inicio prueba estudiantesAlfabeticos");
    }
    @Test
    public void listaMayores(){
        LOG.info("Inicio prueba  estudiantesAlfabeticos");
        Curso curso = new Curso ("Programacion 1");
        Estudiante estudiante_1 = new Estudiante("Manuel", "Pineda Varela", "1092455543", "3045879300", "manueljk@sljfkl@jjfasdfl", (byte)18);
        curso.registrarEstudiante(estudiante_1);
        Estudiante estudiante = new Estudiante ("Samnuel","Pineda","10924543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
        curso.registrarEstudiante(estudiante);
        Estudiante estudiante2 = new Estudiante ("antiago","Pineda","10928455543","3045879300","manuel.pinedav@uqvirtual.edu.co ",(byte)19); 
        curso.registrarEstudiante(estudiante2);

        Collection<Estudiante>listaOrdenadaObtenida = curso.getlistaMayores();
        Collection<Estudiante>listaOrdenadaDeseada = List.of(estudiante,estudiante2,estudiante_1);
        assertIterableEquals(listaOrdenadaObtenida, listaOrdenadaDeseada);
        for(Estudiante edad : curso.getlistaMayores()){
            System.out.println(edad.getNombre());
        }
        LOG.info("Inicio prueba estudiantesAlfabeticos");
    }
}