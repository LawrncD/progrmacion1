package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
    public Estudiante getEstudiante(String numeroidentificacion){
        Estudiante estudianteencontrado = null;
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.numerodeindentificacion().equals(numeroidentificacion)) {
                estudianteencontrado = estudiante;
            }
            
        }
        assert estudianteencontrado != null;
        return estudianteencontrado;
    }
    public Collection<Estudiante> getlistaEstudiantesordenados() {
        Collection<Estudiante>listaOrdenada = null;
        //Realizar el metodo burbuja para ordenar una lista de objetos en java

        listaOrdenada=listaEstudiantes.stream().sorted(Comparator.comparing(Estudiante::nombres)).toList();
        return Collections.unmodifiableCollection(listaOrdenada);
    }
    public Collection<Estudiante> getlistaEstudiantesedadDesendente() {
        Collection<Estudiante>listaOrdenada = null;
        //Realizar el metodo burbuja para ordenar una lista de objetos en java

        listaOrdenada=listaEstudiantes.stream().sorted(Comparator.comparing(Estudiante::edad).reversed()).toList();
        return Collections.unmodifiableCollection(listaOrdenada);
    }
    public Collection<Estudiante> getlistaMayores() {
       Collection<Estudiante> listaMayoresEdad = null;
       for(Estudiante estudiante:listaEstudiantes){
        if(estudiante.edad() >= 18){
            listaMayoresEdad.add(estudiante);
        }
       }
       return listaMayoresEdad;
    }

    }
