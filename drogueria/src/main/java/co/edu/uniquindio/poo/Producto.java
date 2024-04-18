package co.edu.uniquindio.poo;

public abstract class Producto {
 public String codigoProducto;
 public String nombre;
 public String descripcion;
 public double precio;
 public int stock;
 public String proveedor;
 
public Producto(String codigoProducto, String nombre, String descripcion, double precio, int stock, String proveedor) {
    this.codigoProducto = codigoProducto;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
    this.proveedor = proveedor;
}
public String getCodigoProducto() {
    return codigoProducto;
}
public String getNombre() {
    return nombre;
}
public String getDescripcion() {
    return descripcion;
}
public double getPrecio() {
    return precio;
}
public int getStock() {
    return stock;
}
public String getProveedor() {
    return proveedor;
}
public void setCodigoProducto(String codigoProducto) {
    this.codigoProducto = codigoProducto;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public void setStock(int stock) {
    this.stock = stock;
}
public void setProveedor(String proveedor) {
    this.proveedor = proveedor;
}


 
}
