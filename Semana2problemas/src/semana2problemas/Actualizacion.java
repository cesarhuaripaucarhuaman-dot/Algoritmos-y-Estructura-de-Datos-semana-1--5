public class Actualizacion 
{
    public static void main(String[] args)
    {
        int[] calificaciones = {15, 18, 12, 16, 14};
        
        System.out.print("Original: ");
        for (int i = 0; i < calificaciones.length; i++) 
        {
            System.out.print(calificaciones[i] + " ");
        }
        
        // Actualizando posición 2
        calificaciones[2] = 20;
        
        System.out.print("\nActualizado: ");
        for (int i = 0; i < calificaciones.length; i++) 
        {
            System.out.print(calificaciones[i] + " ");
        }
    }
}