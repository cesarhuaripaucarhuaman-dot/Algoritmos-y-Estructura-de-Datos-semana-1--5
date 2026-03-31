public class OperacionesMatematicas
{
    public static void main(String[] args)
    {
        int[] calificaciones = {15, 18, 12, 16, 14};
        
        // Suma de todos los elementos
        int suma = 0;
        int i = 0;
        while (i < calificaciones.length) 
        {
            suma += calificaciones[i];
            i++;
        }
        
        // Promedio
        double promedio = (double) suma / calificaciones.length;
        
        // Nota máxima y mínima
        int maxima = calificaciones[0];
        int minima = calificaciones[0];
        
        i = 1;
        while (i < calificaciones.length) 
        {
            if (calificaciones[i] > maxima)
            {
                maxima = calificaciones[i];
            }
            if (calificaciones[i] < minima) 
            {
                minima = calificaciones[i];
            }
            i++;
        }
        
        System.out.println("Calificaciones:");
        i = 0;
        while (i < calificaciones.length)
        {
            System.out.println("  Posicion " + i + ": " + calificaciones[i]);
            i++;
        }
        
        System.out.println("\nEstadisticas:");
        System.out.println("  Suma total: " + suma);
        System.out.println("  Promedio: " + promedio);
        System.out.println("  Nota maxima: " + maxima);
        System.out.println("  Nota minima: " + minima);
        System.out.println("  Cantidad: " + calificaciones.length);
    }
}