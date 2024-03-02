package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
public class Veterinaria {
    private final String nombre;
    private  final Collection<Mascota> listaMascotas;
  
    public Veterinaria (String nombre){
        this.nombre = nombre;
        assert nombre != null && !nombre.isBlank();
        this.listaMascotas = new LinkedList <Mascota>();
    }

    public String getNombre(){
        return nombre;
    }
    
    public Collection<Mascota> getlisMascotas(){
        return Collections.unmodifiableCollection(listaMascotas);
    }
    public void registrarMascota(Mascota mascota) {
        assert verificarNumeroIdentificacion(mascota.numerodeindentificacion()) == false : "Ya existe una mascota con esa identificacion " + mascota.numerodeindentificacion();
        listaMascotas.add(mascota);
    }

    private boolean verificarNumeroIdentificacion (String numerodeidentificacion){
        boolean exiteMascota = false;
        for (Mascota mascota : listaMascotas){
            if (mascota.numerodeindentificacion().equals(numerodeidentificacion)){
                exiteMascota = true;
            } 
        }
        return exiteMascota;
    }

}
