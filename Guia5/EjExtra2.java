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
public class EjExtra2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int N = cin.nextInt();
        int[] vector0 = new int[N];
        int[] vector1 = new int [N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Posicion "+(i+1)+"de vector 1");
            vector0[i]=cin.nextInt();
        }
        for (int i = 0; i < N; i++) {  
            System.out.println("Posicion "+(i+1)+"de vector 2");
            vector1[i]=cin.nextInt();
        }
        boolean flag=true;
        for (int i = 0; i < N; i++) {
            if(vector0[i]!=vector1[i]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores NO son iguales");
        }
    }
}
