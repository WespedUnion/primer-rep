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
public class EjExtra6 {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        String[][] sopa = new String[20][20];
        String[] palabras = new String[5];
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j]="";
            }   
        }
 
        for (int i = 0; i < 5; i++) {
            do{
                System.out.println("Igrese una palabra "+(i+1)+" de 5");
                palabras[i] = cin.next();
                
            }while(palabras[i].length()>5 || palabras[i].length()<3);
            boolean band=false;
            do{
            int fila = (int)(Math.random()*19);
            int colum = (int)(Math.random()*14);            
                            /*for (int j = 0; j < palabras[i].length(); j++) {     
                                for (int k = colum; k < colum+palabras[i].length(); k++) {
                                    if(sopa[fila][colum+k].equals("")){
                                        sopa[fila][colum+j]=palabras[i].substring(j,(j+1));
                                        band=true;
                                    }                    
                                }               
                            }*/
             for (int k = colum; k < colum+palabras[i].length(); k++) {
                if(sopa[fila][colum+k].equals("")){
                    for (int j = 0 ; j < palabras[i].length(); j++) {                        
                        sopa[fila][colum+j]=palabras[i].substring(j,(j+1));
                    }                    
                }else{
                    band=true;                                       
                }
                             
            }            
            }while(band==false);
        }
      
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(sopa[i][j].equals("")){
                    sopa[i][j]="0";
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
