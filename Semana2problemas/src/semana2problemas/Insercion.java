public class Insercion
{
    public static void main(String[] args) 
    {
        int[] numeros = {10, 20, 30, 40};
        
        System.out.println("Original: 10 20 30 40");
        
        // Insertar 25 en posición 2
        int[] nuevo = new int[5];
        nuevo[0] = numeros[0];
        nuevo[1] = numeros[1];
        nuevo[2] = 25;
        nuevo[3] = numeros[2];
        nuevo[4] = numeros[3];
        
        System.out.print("Nuevo: ");
        for (int i = 0; i < nuevo.length; i++)
        {
            System.out.print(nuevo[i] + " ");
        }
    }
}