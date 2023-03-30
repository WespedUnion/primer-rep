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
public class EjExtra1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int min, dia, hora, aux;
        dia=0;
        hora=0;
        System.out.println("Ingrese su tiempo en minutos");
        min = cin.nextInt();
        aux= min;
        while (aux > 1440){
            dia++;
            aux=aux-1440;
        }
        while (min > 60){
            hora++;
            aux=aux-60;
        }
        System.out.println(min + " minutos equivale a " + dia + " dias " + hora + " horas.");
    }
    
  
            
    
}
