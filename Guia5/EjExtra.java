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
public class EjExtra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int suma=0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese numero "+(i+1)+" de "+N);
            vector[i]=leer.nextInt();
            suma=suma+vector[i];
        }
        System.out.println("La suma de los valores es "+suma);
        
        
    }
}
