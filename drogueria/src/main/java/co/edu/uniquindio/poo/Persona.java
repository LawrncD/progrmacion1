package co.edu.uniquindio.poo;

public abstract class  Persona {
    public String nombre;
    public String apellidos;
    public String DNI;
    public String direccion;
    public String telefono;

    public Persona(String nombre, String apellidos, String dNI, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        DNI = dNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDNI() {
        return DNI;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", direccion=" + direccion
                + ", telefono=" + telefono + "]";
    }

    

}
