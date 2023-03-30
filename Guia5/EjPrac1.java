/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author gtale
 */
public class EjPrac1 {
    public static void main(String[] args) {
        int[] vector = new int [100];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.print(vector[i]+" ");
             if((i+1)%5==0){
                System.out.println("");
            }
        }
    }
}
