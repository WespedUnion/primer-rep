
package Guia4;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        frase = frase.toLowerCase();
        int longi=frase.length();
        
        if (frase.substring(longi-1, longi).equals(".")){
            System.out.println("");
            System.out.println(convertir(frase));
        }else{
            System.out.println("No hay punto al final de la frase");
        }
    }
    
public static String convertir(String FRASE){
    String caracter;
    String fraseNueva="";
    int cont=0;
    
    do{
        caracter=FRASE.substring(cont, cont+1);
        switch(caracter){
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
        fraseNueva= fraseNueva.concat(caracter);
        cont++;
        
    }while(!caracter.equals("."));
    
    return fraseNueva;
}    
}
