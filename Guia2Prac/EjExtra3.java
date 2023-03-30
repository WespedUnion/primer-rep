/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Prac;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class EjExtra3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = cin.next();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Esta letra es vocal");
        }else{
            System.out.println("Esta letra no es vocal");
        }
        
    }   
}
