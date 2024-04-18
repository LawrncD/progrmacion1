package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;

public class Drogueria {
    private final String nombre;
    public final Collection<Producto> listaProductos;
    public final Collection<Pedido> ListaPedidos;
    public final Collection<Cliente> listaClientes;
    public final Collection<Empleado> listaEmpleados;
    public Drogueria(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new LinkedList<Producto>();
        this.ListaPedidos = new LinkedList<Pedido>();
        this.listaClientes = new LinkedList<Cliente>();
        this.listaEmpleados = new LinkedList<Empleado>();
    } 
    public String getNombre() {
        return nombre;
    }
    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }
    public Collection<Pedido> getListaPedidos() {
        return ListaPedidos;
    }
    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }
    public Collection<Empleado> getLisEmpleados() {
        return listaEmpleados;
    }

    public void registrarProducto(Producto producto){
        listaProductos.add(producto);
        
    }
    public void registrarEmpleado(Empleado empleado) {
       listaEmpleados.add(empleado);
    }
    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    public void registrarPedido(Pedido pedido) {
        assert verificar_stock() == false : "No se puede realizar pedido porque no hay stock";
        ListaPedidos.add(pedido);
    }
  
    private boolean verificar_stock (){
        boolean hay_stock = false;
        for(Producto producto : listaProductos){
            if ( producto.getStock() == 0) {
                hay_stock = true;
            }
    }
        return hay_stock;
    }
    public Collection<Producto> obtenerStockMayorCien() {
        Collection<Producto> listaMayoresStockCien = new LinkedList<Producto>();
        for (Producto producto : listaProductos) {
            if (producto.getStock()>=100) {
                listaMayoresStockCien.add(producto);
            }
        }
        return listaMayoresStockCien;
    }

}
