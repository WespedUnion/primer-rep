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
public class EjPr4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String frase, subs;
        System.out.println("Ingrese una frase");
        frase = cin.nextLine();
        subs = frase.substring(0,1);
        if (subs.equals("A")){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
