package ejercicio2;
import Libreria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Catálogo de productos
        List<Producto> catalogo = new ArrayList<>();
        catalogo.add(new Producto("Jeans", 90.0));
        catalogo.add(new Producto("Tela", 110.0));
        catalogo.add(new Producto("Drill", 95.0));

        List<Cliente> clientes = new ArrayList<>();

        System.out.print("Ingrese la cantidad de clientes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // limpiar buffer
            System.out.println("\nCliente " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            // Mostrar catálogo
            System.out.println("Seleccione el tipo de pantalón:");
            for (int j = 0; j < catalogo.size(); j++) {
                System.out.println((j + 1) + ". " + catalogo.get(j).getTipo() +
                        " - S/ " + catalogo.get(j).getPrecio());
            }

            int opcion;
            do {
                System.out.print("Opción [1-3]: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > catalogo.size());

            Producto seleccionado = catalogo.get(opcion - 1);

            System.out.print("Cantidad de pantalones: ");
            int cantidad = sc.nextInt();

            Compra compra = new Compra(seleccionado, cantidad);
            Cliente cliente = new Cliente(nombre, compra);
            clientes.add(cliente);

            // Mostrar detalle de la compra del cliente
            System.out.println("\n--- FACTURA ---");
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Producto: " + compra.getProducto().getTipo());
            System.out.println("Cantidad: " + compra.getCantidad());
            System.out.println("Subtotal: S/ " + compra.calcularSubtotal());
            System.out.println("Descuento: S/ " + compra.calcularDescuento());
            System.out.println("Total a pagar: S/ " + compra.calcularTotal());
        }

        // Al finalizar mostrara los totales
        double totalGeneral = 0;
        System.out.println("\n=== RESUMEN GENERAL ===");
        for (Cliente c : clientes) {
            System.out.println(c.getNombre() + " pagó: S/ " + c.getCompra().calcularTotal());
            totalGeneral += c.getCompra().calcularTotal();
        }
        System.out.println("Monto total acumulado de todos los clientes: S/ " + totalGeneral);
    }
}
 
