package co.edu.uniquindio.poo;

public class Empleado extends Persona {
 public final double salario;

public Empleado(String nombre, String apellidos, String dNI, String direccion, String telefono, double salario) {
    super(nombre, apellidos, dNI, direccion, telefono);
    this.salario = salario;
}

public double getSalario() {
    return salario;
}
 
}
