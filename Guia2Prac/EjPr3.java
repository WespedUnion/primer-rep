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
public class EjPr3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase de 8 de largo");
        frase = cin.nextLine();
        if (frase.length() == 8){
            System.out.println("Correcto");
    }else{
            System.out.println("Incorrecto");
        }
    }
    
}
