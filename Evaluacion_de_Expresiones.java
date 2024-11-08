/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacion_de_expresiones;

/**
 *
 * @author Fernando Mendoza
 */
public class Evaluacion_de_Expresiones {

    public static void main(String[] args) {
        int M=6, T=1, K=-10; 
        
        boolean evaluacion1 = M > T;
        boolean evaluacion2 = T/K == -5;
        boolean evaluacion3 = (M+T == 7)|| (M-T == -5); 
        
        
        System.out.println("¿M es mayor que T? R//" + evaluacion1);
        System.out.println("¿T entre K = -5? R//" + evaluacion2);
        System.out.println("¿La suma de M+T = 7 y la resta de M-T = -5? R//" + evaluacion3);
    }
}
