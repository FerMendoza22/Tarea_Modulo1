/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6_evaluacion;

/**
 *
 * @author Fernando Mendoza
 */
import java.util.Scanner; 

public class Ejercicio6_evaluacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = scanner.nextLine(); 
        
        System.out.println("Ingrese la nota del estudiante");
        int nota = scanner.nextInt(); 
        
        if (nota >= 70){
            System.out.println(nombre + " su nota es " + nota + " aprobo");
            
        }else{
            System.out.println(nombre + " su nota es " + nota + " reprobo");
        }
        
        
    }
}
