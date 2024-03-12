package co.edu.uniquindio.poo;
import java.time.LocalDateTime;
public class Boleta {
    private String nombreFuncion;
    private LocalDateTime fechaHoraFuncion;
    private double valorPagado; 

    // Constructor
    public  Boleta(String nombreFuncion, LocalDateTime fechaHoraFuncion,double valorPagado){
        this.nombreFuncion = nombreFuncion;
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.valorPagado = valorPagado;
    }

    // Getters y setters
    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public LocalDateTime getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(LocalDateTime fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }


}
