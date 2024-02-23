package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante ("Manuel","Pineda Varela","1092455543","3045879300","manuel.pinedav@uqvirtual.edu.co",(byte)18); 
        estudiante.presentarExamen(("diagrama de clases"));


       Perro perro = new Perro ("kiara","criollo");
       perro.caminar(50);
    }


}
