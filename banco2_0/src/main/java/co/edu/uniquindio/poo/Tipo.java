package co.edu.uniquindio.poo;

public enum Tipo {
    DEPOSITO("Deposito"),
    RETIRO("Retiro");
    private final String Tipo;

    private Tipo(String tipo) {
        Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }
    
}
