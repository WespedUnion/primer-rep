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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero");
            int num = cin.nextInt();
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
