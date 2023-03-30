/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author gtale
 */
public class EjExtra4 {
    public static void main(String[] args) {
             
        float[][]matriz=new float[10][5];
        int cont=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(float)(Math.random()*10);
            }
            matriz[i][4]=(float)(matriz[i][0]*0.10 + matriz[i][1]*0.15+matriz[i][2]*0.25+matriz[i][3]*0.50);
            if(matriz[i][4]>=7){
                cont++;
            }
        }
        System.out.print("Hubo una cantidad de "+cont+" alumnos aprobados ");
        System.out.println("Y "+(10-cont)+" desaprobados");
        
        System.out.println("Matriz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(String.format("%.1f",matriz[i][j]));
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
