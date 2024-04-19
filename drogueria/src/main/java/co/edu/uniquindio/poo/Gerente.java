package co.edu.uniquindio.poo;

public class Gerente extends Empleado{

    public Gerente(String nombre, String apellidos, String dNI, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dNI, direccion, telefono, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Gerente []";
    }

}
