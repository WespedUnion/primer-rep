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
public class EjExtra11 {
    public static void main(String[] args) {
        
    
    Scanner cin = new Scanner(System.in);        
        long num, cont, aux;
        cont=0;
            System.out.println("Ingrese un numero");
            num = cin.nextInt();
            aux=num;
            
            do{
                aux=aux/10;
                cont++;
                
            }while(aux!=0);
            
            System.out.println("El numero tiene " + cont + " digitos");
        }    
    }

