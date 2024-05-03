package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
 private String codigo;
 private double valor;
 private LocalDate fecha;
 private String descripcion; 
 private boolean estado;
 private Tipo tipo;
public Transaccion(String codigo, double valor, LocalDate fecha, String descripcion, Tipo tipo) {
    this.codigo = codigo;
    this.valor = valor;
    this.fecha = fecha;
    this.descripcion = descripcion;
    this.estado = true;
    this.tipo = tipo;
}
public String getCodigo() {
    return codigo;
}
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
public double getValor() {
    return valor;
}
public void setValor(double valor) {
    this.valor = valor;
}
public LocalDate getFecha() {
    return fecha;
}
public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
}
public String getDescripcion() {
    return descripcion;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public boolean isEstado() {
    return estado;
}
public void setEstado(boolean estado) {
    this.estado = estado;
}
public Tipo getTipo() {
    return tipo;
}
public void setTipo(Tipo tipo) {
    this.tipo = tipo;
}
@Override
public String toString() {
    return "Transaccion [codigo=" + codigo + ", valor=" + valor + ", fecha=" + fecha + ", descripcion=" + descripcion
            + ", estado=" + estado + ", tipo=" + tipo + "]";
}
  


}
