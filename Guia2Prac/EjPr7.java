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
public class EjPr7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String cadena, X, O;
        int correct=0, incorrect=0;
        boolean salida = false;
        do{
            System.out.println("Ingrese una secuencia FDE");
            cadena = cin.nextLine();
            X = cadena.substring(0, 1);
            O = cadena.substring(4, 5);
            if (cadena.equals("&&&&&")){
                System.out.println("Saliendo...");
            } 
                else if (cadena.length() == 5 && X.equals("X") && O.equals("O")){
                    correct++;
                    System.out.println("Sentencia correcta");
                    }else{
                        incorrect++;
                        System.out.println("Sentencia incorrecta");
                    }
                
            if(cadena.equals("&&&&&")){
                salida=true;
            }    
        }while(salida==false);
        System.out.println("Sentencias correctas: " + correct);
        System.out.println("Sentencias incorrectas: " + incorrect);
    }
}
