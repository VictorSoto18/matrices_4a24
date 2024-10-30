import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Arreglos
{
    public static void main(String[] args) throws IOException{
        //Declaracion y construccion de un arreglo
        int[] arreglo1 = new int[5];
        //Asignacion de valores al arreglo
        for (int i = 0; i < arreglo1.length; i++)
        // otra forma de asignar valores al arreglo
        //for (int i = 0; i <= arreglo1.length-1; i++)
        arreglo1[i] = i + 1;
        System.out.println("Contenido del arreglo: ");
        //Imprimir el contenido del arreglo
        for( int elemento : arreglo1){
            System.out.println("Elemento: " + elemento);
        }

        // declaracion de un arreglo
        double[] arreglo2;

        //No se puede usar un arreglo que no ha sido construido
        // arreglo2[0] = 12.7;

        // objetos para introducir valores
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // tamaño del arreglo
        int t;
        System.out.println("¿Cual es el tamaño del arreglo?: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        // construimos el arreglo
        arreglo2 = new double[t];

        // rellenar el arreglo mediante teclado
        for (int i = 0; i < arreglo2.length; i++){
            System.out.println("Introduce el valor  ["+ (i+1) + "]: ");
            entrada = bufer.readLine();
            arreglo2[i] = Double.parseDouble(entrada);
        }

        // Imprimir los elementos de arreglo2
        System.out.println("Contenido del arreglo2:");
        for (double elemento : arreglo2){
            System.out.println("Elemento: " + elemento);
        }
    }
}