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
public class EjPrac5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] trasp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= leer.nextInt();                
            }
       }        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trasp[i][j] = matriz[j][i];
            }
        }
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]==(-trasp[i][j])){
                cont++;
                }
            }
        }        
        if(cont==9){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz No es antisimetrica");
        }
    }
}
