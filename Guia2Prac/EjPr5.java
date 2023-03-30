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
public class EjPr5 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int limite, suma, num;
        do{ 
        System.out.println("Ingrese el valor tope");
        limite = cin.nextInt();
        suma=0;
        if(limite <=0){
            System.out.println("Error, debe ingresar un numero positivo");
        }
        }while(limite <= 0);
        
        do{
            System.out.println("Ingrese un valor");
            num = cin.nextInt();
            suma=suma+num;
        }while(suma<=limite);
        System.out.println("Se ha superado el limite");
    }
}
