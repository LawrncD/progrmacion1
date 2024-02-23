package co.edu.uniquindio.poo;

public record Perro (String nombre , String raza) {
   
    public Perro{

    }
    public void caminar(int metros){
        System.out.println("El perro camino "+ metros + " Metros, " + metros + " metros, " + metros +" Metros, " + metros + " metros, " + " para un total de " + (4*metros) + " metros");
    }
}
