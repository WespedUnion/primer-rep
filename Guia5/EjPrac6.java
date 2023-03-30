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
public class EjPrac6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int[] vector = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                    System.out.println("Ingrese valor para pos ["+i+"]["+j+"]");
                    matriz[i][j] = leer.nextInt();
                }while(matriz[i][j]<=0 || matriz[i][j]>=10);
            }
        }
        int diagA=0;
        for (int i = 0; i < 3; i++) {
            diagA=diagA+matriz[i][i];
        }
        int diagB=0;
        diagB=matriz[0][2]+matriz[1][1]+matriz[2][0];
        int suma;
        
        
        
        int contFila=0;
        for (int i = 0; i < 3; i++) {
            suma=0;
            for (int j = 0; j < 3; j++) {
                suma=suma+matriz[i][j];
            }
            if(diagA==suma){
                contFila++;
            }           
        }
        
        int contColum=0;
        for (int j = 0; j < 3; j++) {
            suma=0;
            for (int i = 0; i < 3; i++) {
                suma=suma+matriz[i][j];
            }
            if(diagA==suma){
                contColum++;
            }        
        }
        if(diagA==diagB && contColum==3 && contFila==3){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
        
    }    
}
