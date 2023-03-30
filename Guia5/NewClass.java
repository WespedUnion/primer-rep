/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
*/
package Guia5;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        
        int[] vector = new int [N];
        
        for (int i = 0; i < N; i++) {
            vector[i]= (int)(Math.random()*10-1);            
        }
        
        System.out.println("Ingrese un numero que desea buscar");
        int buscar = leer.nextInt();
        int pos=0, rep=0;
        
        for (int i = 0; i < N; i++) {
            if(vector[i]==buscar){
                if(rep==0){
                    pos=i;
                } 
                rep++;                                       
            }
        }
        
        if(rep>0){
            System.out.println("El numero "+buscar+" se encontró en la posicion "+pos);
            if(rep>1){
                System.out.println("El numero se repitio "+(rep-1)+" veces");
            }else{
                System.out.println("El numero no se repitio");
            }           
        }else{
            System.out.println("El numero no se encontró");
        } 
        System.out.println(" ");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i]+" ");
        }
    }
}
