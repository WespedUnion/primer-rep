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
public class Ej1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int comp;
        System.out.println("Ingrese la cantidad de compañeros a almacenar");
        comp = cin.nextInt();
       
        String[] vector = new String[comp];
        
        for (int i = 0; i < comp; i++) {
            System.out.println("Ingrese el "+(i+1)+"° nombre");
            vector[i] = cin.next();
        }
        
        System.out.println("Los nombres ingresados son:");
        for (int i = 0; i < comp; i++) {
            if(i != comp-1){
            System.out.print(vector[i]+", ");            
            }else{
                System.out.print(vector[i]);
            }
            if((i+1)%5==0){
                System.out.println("");
            }
        }
        System.out.println("");
        
    }
}
