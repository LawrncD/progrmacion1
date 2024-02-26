package co.edu.uniquindio.poo;
public record Animal(String nombre, String especie , String raza , byte edad , String genero , String color , byte peso) {
    public Animal{
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert genero != null;
        assert color != null;
        assert edad >= 0;
        assert peso > 0;
        assert nombre != "";
        assert especie != "";
        assert raza != "";
        assert genero != "";
        assert color != "";
        assert edad <= 200;
        assert peso <= 600;
       

    }

    
    
}