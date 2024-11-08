/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones_aritmeticas;

/**
 *
 * @author Fernando Mendoza
 */
public class Operaciones_aritmeticas {

    public static void main(String[] args) {
        int suma = 0;
        int resta = 0; 
        int multiplicacion = 0;
        int division = 0;
        int mod = 0;
          
        
        int numero1 = 20;
        int numero2 = 6;
        
        suma = numero1 + numero2;
        resta = numero1 - numero2; 
        multiplicacion = numero1 * numero2; 
        division = numero1 / numero2; 
        mod = numero1 % numero2; 
        
        
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
        System.out.println("El resultado de mod es: " + mod);
       
        
    }
}
