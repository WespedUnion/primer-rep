
import java.util.Scanner;
import static java.lang.Math.sqrt;

/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/
/**
 *
 * @author gtale
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " es: " + (num*2));
        System.out.println("El triple de " + num + " es: " + (num*3));
        System.out.println("La Raiz cuadrada de " + num + " es: " + (Math.sqrt(num)));
    }
    
}
