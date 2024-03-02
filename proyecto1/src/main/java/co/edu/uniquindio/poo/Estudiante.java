package co.edu.uniquindio.poo;

public record Estudiante( String nombres , String apellidos , String numerodeindentificacion, String telefono , String correo, byte edad ) {

    public Estudiante{
        assert nombres != null && !nombres.isBlank();
        assert apellidos != null && !apellidos.isBlank();
        assert numerodeindentificacion != null && !numerodeindentificacion.isBlank();
        assert telefono != null && !numerodeindentificacion.isBlank();
        assert correo != null && !correo.isBlank();
        assert edad > 0;
        assert telefono.length() == 10;
        assert correo.contains("@");
    }
    public void presentarExamen(String enunciado){
        System.out.println("Resolver examen: "+ enunciado);
    }

}
