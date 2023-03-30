/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int A, B;
        System.out.println("Ingrese 2 numeros");
        A = cin.nextInt();
        B = cin.nextInt();
        esMultiplo(A,B);
    }
    
    public static void esMultiplo(int a, int b){
        if (a%b==0){
            System.out.println(a+" es multiplo"+" de " +b);
        }else{
            System.out.println(a+" NO es multiplo"+" de " +b);
        }
    }
}
