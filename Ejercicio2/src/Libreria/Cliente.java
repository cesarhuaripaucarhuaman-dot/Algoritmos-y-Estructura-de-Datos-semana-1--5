package Libreria;
public class Cliente 
{
     private String nombre;
    private Compra compra;

    public Cliente(String nombre, Compra compra) {
        this.nombre = nombre;
        this.compra = compra;
    }

    public String getNombre() {
        return nombre;
    }

    public Compra getCompra() {
        return compra;
    }
}
