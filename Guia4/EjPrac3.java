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
public class EjPrac3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float eur;
        String moneda,salida;
        do{
            System.out.println("Ingrese la cantidad de euros a convertir");
            eur = cin.nextFloat();

            System.out.println("Ingrese que moneda desea obtener su conversion del euro");
            System.out.println("Libra - Dolar - Yen");
            moneda = cin.next();
            moneda = moneda.toLowerCase();
            convertirMoneda(eur, moneda);
            
            System.out.println("Desea convertir otro valor? s/n");
            salida=cin.next();
        }while(!salida.equalsIgnoreCase("n"));
    }
    public static void convertirMoneda(float valor, String tipo){
        float conversion=0;
        int longi=0;
        boolean bandera=false;
        switch (tipo){
            case "libra": conversion=(float)(valor*0.86);
                        bandera=true;
            break;
            case "dolar": conversion=(float)(valor*1.28611);
                        bandera=true;
            break;
            case "yen": conversion=(float)(valor*129.852);
                        bandera=true;
            break;
            default: System.out.println("valor ingresado no valido");
            break;
        }
        if (bandera){
            longi=tipo.length();
            if(tipo.equalsIgnoreCase("libra")){
                System.out.println(valor+" euros equivale a "+conversion+" "+tipo+"s");
            }else{
                System.out.println(valor+" euros equivale a "+conversion+" "+tipo+"es");
            }
            
        }
        
    }
}
