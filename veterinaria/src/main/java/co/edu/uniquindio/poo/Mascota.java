package co.edu.uniquindio.poo;
public record Mascota(String nombre, String especie , String raza , byte edad , String genero , String color , byte peso, String numerodeindentificacion) {
    public Mascota{
        assert nombre != null && !nombre.isBlank();
        assert especie != null && !especie.isBlank();
        assert raza != null && !raza.isBlank();
        assert genero != null && !genero.isBlank();
        assert color != null && !color.isBlank();
        assert numerodeindentificacion != null && !numerodeindentificacion.isBlank();
        assert edad >= 0; 
        assert peso > 0;
        assert edad <= 200;
        assert peso <= 600;
    }

    public int getEdad() {
       return edad;
    }

    public String getNombre() {
        return nombre;
    }
}