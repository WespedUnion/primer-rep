/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class EjExtra3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        int[]vector = new int [10];
        llenaVector(vector);
        System.out.println("");
        imprimeVector(vector);
    }
    
    
    
    public static void llenaVector(int[] vector){
        for (int i = 0; i < 10; i++) {
            vector[i] = (int)(Math.random()*10+1);
        }
    }
    
    public static void imprimeVector(int[] vector){
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
}

