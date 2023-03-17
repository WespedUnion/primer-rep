
import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
/**
 *
 * @author gtale
 */
public class EJ4 {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            float Cell, Far;
            System.out.print("Ingrese su temperatura en grados centigrados: ");
            Cell = leer.nextFloat();
            Far = 32 + (9 * Cell / 5);
            System.out.println("La temperatura en grados Fahrenheit es de: " + Far + "°F");
            
            
        }
}
