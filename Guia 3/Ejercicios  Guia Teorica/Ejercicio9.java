/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num, suma, cont;
        cont=0;
        suma=0;
        do{
            System.out.print("Ingrese un numero: ");
            num = cin.nextInt();
            
            if (num == 0){
                System.out.println("Se capturó el numero 0");
                break;
            }
            if (num>0){
            suma=suma+num;
            }else{
                System.out.println("Numero negativo, no se sumará");
            }
            cont++;
        } while (cont < 20);
        
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
    
}
