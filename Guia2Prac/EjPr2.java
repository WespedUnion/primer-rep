/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Prac;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class EjPr2 {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //String eureka = new String("eureka");
        String frase;
        
        System.out.println("Ingrese su frase");
        frase = cin.nextLine();
      
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
 
}
