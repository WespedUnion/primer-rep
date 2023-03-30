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
public class EjPrac4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int NUM; 
        System.out.println("Ingrese un numero");
        NUM = cin.nextInt();
        if(esPrimo(NUM)==true){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    
    
    public static boolean esPrimo(int num){
        
        if (num<2) {
        return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                return false;  
            }    
        }
        return true;
    }
}

