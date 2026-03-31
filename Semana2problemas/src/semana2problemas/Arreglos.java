package semana2problemas;
public class Arreglos 
{
    public static void main(String[] args) 
    {
        // Declaración de arreglo unidimensional
        int[] calificaciones = {15, 18, 12, 16, 14};
        
        // Recorriendo el arreglo usando while
        System.out.println("Calificaciones:");
        int i = 0;
        while (i < calificaciones.length)
        {
            System.out.println("Posicion " + i + ": " + calificaciones[i]);
            i++;
        }
    }
}

