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
public class EjPr1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num = cin.nextInt();
        
        if (num%2==0){
            System.out.println("Este numero es par");
        }else{
            System.out.println("Este numero es impar");
        }
    }
}
