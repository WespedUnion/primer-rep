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
public class EjPrac2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su vector");
        int N = cin.nextInt();
        
        int[] vector = new int[N];
        
        for (int i = 0; i < N; i++) {
            vector[i] = (int)(Math.random()*(100-1));
        }
        
        System.out.println("Ingrese un numero que desee buscar en el vector");
        int busca = cin.nextInt();
        
        int pos=0, rep=0;
        for (int i = 0; i < N; i++) {
            if(vector[i]==busca){
                if(rep==0){
                    pos=i;
                }
                rep++;                
            }            
        }
        if(rep > 0){
        System.out.print("El numero "+busca+" se encontró en el vector ");
        System.out.println("en la posicion "+pos);
        if (rep > 1){
            System.out.println("el numero se repitio "+(rep-1)+" veces");
        }else{
            System.out.println("El numero no se repitio");
        }
        }else{
            System.out.println("El numero no se encontró");
        }
        
        System.out.println("Mostrando vector...");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i]+" ");
             if((i+1)%10==0){
                System.out.println("");
            }
        }
    }
}
