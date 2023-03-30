/*

 */
package Guia2Prac;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class EjPr6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float A, B;
        int Opc;
        boolean bandera = false;
        String salir = " ";
        String saltL = System.lineSeparator();
         
        do{
            System.out.println("Ingrese 2 numeros: ");
            A = cin.nextInt();
            B = cin.nextInt();
             
            System.out.println("Menu" + saltL + "1.Sumar" + saltL + "2.Restar");
            System.out.println("3.Multiplicar" + saltL + "4.Dividir" + saltL + "5.Salir");
            System.out.print("Elija la opcion: ");
            Opc = cin.nextInt();
            
            switch(Opc){
                case 1: System.out.println("El resultado es: " + (A+B));
                break;
                case 2: System.out.println("El resultado es: " + (A-B));
                break;
                case 3: System.out.println("El resultado es: " + (A*B));
                break;
                case 4: System.out.println("El resultado es: " + (A/B));
                break;
                case 5: System.out.print("Está seguro que desea salir?: ");
                        salir = cin.next();
                        if(salir.equals("S")){
                            bandera=true;
                        }
                break;
                default: System.out.println("Opcion incorrecta");
            }
        }while(bandera==false);
        System.out.println("Saliendo...");
    }
}
