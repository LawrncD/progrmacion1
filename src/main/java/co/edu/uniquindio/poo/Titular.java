package co.edu.uniquindio.poo;

public class Titular {
    private final String nombresTitular;
    private final String apellidosTitular;

    public Titular (String nombresTitular, String apellidosTitular){
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
    }

    public String getNombresTitular (){
        return nombresTitular;
    }

    public String getApellidosTitular (){
        return apellidosTitular;
    }

}