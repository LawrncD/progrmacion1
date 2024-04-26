package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;

public class Drogueria {
    private final String nombre;
    private final Collection<Producto> listaProductos;
    private final Collection<Pedido> ListaPedidos;
    private final Collection<Cliente> listaClientes;
    private final Collection<Empleado> listaEmpleados;
    Drogueria(String nombre) {
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
    
    @Override
    public String toString() {
        return "Drogueria [nombre=" + nombre + ", listaProductos=" + listaProductos + ", ListaPedidos=" + ListaPedidos
                + ", listaClientes=" + listaClientes + ", listaEmpleados=" + listaEmpleados + "]";
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
    /**
     * Este metodo registra un pedido asegurandose que el producto selecionado tenga stock disponible con ayuda del assert
     * @param pedido
     */
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

    /**
     * Este metodo retorna los productos que tengo stock mayor a 100
     * @return
     */
    public Collection<Producto> obtenerStockMayorCien() {
        Collection<Producto> listaMayoresStockCien = new LinkedList<Producto>();
        for (Producto producto : listaProductos) {
            if (producto.getStock()>=100) {
                listaMayoresStockCien.add(producto);
            }
        }
        return listaMayoresStockCien;
    }
    /**
     * este metodo retorna el costo total de un pedido determinado
     * @param cliente
     * @return
     */
    public double costoTotalPedido(Cliente cliente) {
        double costo = 0;
        for (Pedido pedido : ListaPedidos) {
            if (pedido.getClientePedido().equals(cliente)) {
                costo = pedido.getCantidad() * pedido.getPproductoPedido().getPrecio();
            }
        }
        return costo;
    }
}
