package Libreria;
public class Compra 
{
    private Producto producto;
    private int cantidad;

    public Compra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        double descuento = 0;

        if (cantidad >= 6 && cantidad <= 10) {
            descuento = subtotal * 0.05;
        } else if (cantidad >= 11 && cantidad <= 20) {
            descuento = subtotal * 0.10;
        } else if (cantidad > 20) {
            descuento = subtotal * 0.15;
        }

        return descuento;
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento();
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
}
