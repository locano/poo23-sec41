package Ejercicio2;

public class Controlador {
    Producto[] productos;
    int total_productos = 0;
    
    Controlador(){
        // valores null
        // [null, null, null]
        productos = new Producto[3];
    }

    public void agregarProducto(String nombre, int cantidad, int precio){
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setCantidad(cantidad);
        producto.setPrecio(precio);

        productos[total_productos] = producto;
        total_productos++;
    }

}
