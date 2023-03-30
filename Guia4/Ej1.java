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
public class Ej1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = cin.nextLine();
        String retorno = codifica(frase);
        System.out.println("");
        System.out.println(retorno);
    }

    

public static String codifica(String frase){
    int largo = frase.length();
    int cont = 0;
    String fraseNueva="";
    String caracter;
    do{
        caracter=frase.substring(cont, cont+1);
        caracter=caracter.toLowerCase();
        switch (caracter){
            case "a":caracter="@";
            break;
            case "e":caracter="#";
            break;
            case "i":caracter="$";
            break;
            case "o":caracter="%";
            break;
            case "u":caracter="*";
            break;           
        }
        fraseNueva=fraseNueva.concat(caracter);
        cont++;
    }while(cont < frase.length());
    return fraseNueva;
}
    
}