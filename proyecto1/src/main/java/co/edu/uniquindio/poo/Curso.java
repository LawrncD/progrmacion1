package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;

public class Curso {
    private final String nombre;
    private  final Collection<Estudiante> listaEstudiantes;

    public Curso(String nombre){
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList <Estudiante>();
        assert nombre != null && !nombre.isBlank();

    }
   // public void setNombre(String nombre){
     //   this.nombre = nombre;
    //
    //  }
    public String getNombre(){
        return nombre;
    }
    public Collection<Estudiante> getlistaEstudiantes(){
        return Collections.unmodifiableCollection(listaEstudiantes);

    }
    public void registrarEstudiante(Estudiante estudiante) {
        assert verificarNumeroIdentificacion(estudiante.numerodeindentificacion()) == false : "Ya existe un estudiante con esa identificacion" + estudiante.numerodeindentificacion();
        listaEstudiantes.add(estudiante);
    }
    private boolean verificarNumeroIdentificacion (String numerodeindentificacion) {
        boolean existeEstudiante = false;
        for (Estudiante estudiante : listaEstudiantes){
            if(estudiante.numerodeindentificacion().equals(numerodeindentificacion)){
                existeEstudiante = true;
            }
        }
        return existeEstudiante;

    }

    }
