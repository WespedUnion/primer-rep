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
public class EjExtra2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int A, B, C, D, aux;
        String conf;
        System.out.println("Ingrese 4 numeros: ");
        A = cin.nextInt();
        B = cin.nextInt();
        C = cin.nextInt();
        D = cin.nextInt();
        
        System.out.println(" A vale: " + A + "\n B vale: " + B + "\n C vale: " + C);
        System.out.println(" D vale: " + D);
        
        System.out.println("Desea realizar el intercambio? S o N");
        conf = cin.next();
        
        if (conf.equalsIgnoreCase("S")){
            aux=B;
            B=C;
            C=A;
            A=D;
            D=aux;
        }else{
            System.out.println("No se realizó el intercambio");
        }
         System.out.println(" A vale: " + A + "\n B vale: " + B + "\n C vale: " + C);
         System.out.println(" D vale: " + D);
    }
}
