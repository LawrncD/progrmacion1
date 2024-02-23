package co.edu.uniquindio.poo;
public record Animal(String nombre, String especie , String raza , Byte edad , String genero , String color , Byte peso) {
    public Animal{
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert genero != null;
        assert color != null;
        assert edad >= 0;
        assert peso > 0;
    }
}
