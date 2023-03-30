/*
 Crea una aplicación que le pida dos números al usuario y
este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben
devolver sus resultados para imprimirlos en el main. 
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class EjPrac1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A, B, opc;
        float resultado=0;
        System.out.println("Ingrese dos numeros: ");
        A = leer.nextInt();
        B = leer.nextInt();
        System.out.println("Elija su operacion");
        System.out.println("1:Sumar \n2:Restar \n3: Multiplicar \n4:Dividir");
        opc = leer.nextInt();
        switch (opc){
            case 1: resultado=suma(A,B);
            break;
            case 2:resultado=resta(A,B);
            break;
            case 3:resultado=multi(A,B);
            break;
            case 4:resultado=divi(A,B);
            break;
            default: System.out.println("Opcion incorrecta");
            break;
        }    
        System.out.println("El resultado es "+resultado);
    }
    
    public static int suma(int a, int b){
        int res;
        res=a+b;
        return res;
    }
    public static int resta(int a, int b){
        int res;
        res=a-b;
        return res;
    }
    public static int multi(int a, int b){
        int res;
        res=a*b;
        return res;
    }
    public static float divi(float a, float b){
        float res;
        res=a/b;
        return res;
    }
}
