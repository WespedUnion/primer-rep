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
public class EjPrac2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        mayorEdad();
    }
    public static void mayorEdad(){
        Scanner cin = new Scanner(System.in);
        int N, edad;
        String nombre, salida;
        System.out.println("Ingrese la cantidad de personas a ingresar");
        N = cin.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese nombre");
            nombre = cin.next();
            System.out.println("Ingrese edad");
            edad = cin.nextInt();
            
            System.out.print("Nombre: "+nombre+", edad: "+edad);
            if (edad > 18){
                System.out.println(", mayor de edad");
            }else{
                System.out.println(", menor de edad");
            }
            System.out.println("Quiere seguir ingresando personas? s/n");
            salida = cin.next();
            if(salida.equalsIgnoreCase("n")){
                break;
            }
            
        }
        
    }
}
