/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("Nota incorrecta, ingrese nuevamente...");
            nota = leer.nextInt();
        }
        
        System.out.println("Nota correcta. Cerrando...");
    }
    
}
