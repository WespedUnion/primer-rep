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
public class Prueba {
        public static void main(String[] args) {
        int num1, num2;
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese el primer numero");    
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero");
            num2 = leer.nextInt();
            
            if (num1 > num2) {
                System.out.println("El primer numero es mayor al segundo");
            }else{
                if(num1 < num2){
                    System.out.println("El primer numero es menor al segundo");
                }else{
                    System.out.println("El primer numero es igual al segundo");
                }
            }
    }
}
