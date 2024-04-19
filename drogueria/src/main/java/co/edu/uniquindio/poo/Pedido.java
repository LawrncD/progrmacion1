package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private int cantidad;
    private Producto pproductoPedido;
    private Cliente clientePedido;
    public Pedido(LocalDate fecha, int cantidad, Producto pproductoPedido, Cliente clientePedido) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.pproductoPedido = pproductoPedido;
        this.clientePedido = clientePedido;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getCantidad() {
        return cantidad;
    }
    public Producto getPproductoPedido() {
        return pproductoPedido;
    }
    public Cliente getClientePedido() {
        return clientePedido;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setPproductoPedido(Producto pproductoPedido) {
        this.pproductoPedido = pproductoPedido;
    }
    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }
    
}
