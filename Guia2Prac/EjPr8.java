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
public class EjPr8 {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            int n;
            System.out.println("Ingrese el tamaño del cuadrado");
            n = cin.nextInt();
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j==0 || i==0 || j==n-1 || i==n-1){
                        System.out.print(" *");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
    }
}
