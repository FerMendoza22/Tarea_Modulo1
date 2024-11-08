/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_arreglo_multidimensional;

/**
 *
 * @author Fernando Mendoza
 */
public class Ejercicio5_arreglo_multidimensional {

    public static void main(String[] args) {
        String[][]DatosPersonales = new String[6][4];
        
        DatosPersonales[0][0] = "Nombre";
        DatosPersonales[0][1] = "Apellido   ";
        DatosPersonales[0][2] = "Carrera          ";
        DatosPersonales[0][3] = "Lugar de Trabajo ";
        
        DatosPersonales[1][0] = "Norma ";
        DatosPersonales[1][1] = "Gavarrete  ";
        DatosPersonales[1][2] = "Produccion Industrial";
        DatosPersonales[1][3] = "Maquila";
        
        DatosPersonales[2][0] = "Mirna ";
        DatosPersonales[2][1] = "Chirino  ";
        DatosPersonales[2][2] = "Produccion Industrial";
        DatosPersonales[2][3] = "Control de calidad";
        
        DatosPersonales[3][0] = "Ruth  ";
        DatosPersonales[3][1] = "Bautista";
        DatosPersonales[3][2] = "Produccion Industrial";
        DatosPersonales[3][3] = "Corporation Lear";
        
        DatosPersonales[4][0] = "Bryan ";
        DatosPersonales[4][1] = "Vasquez  ";
        DatosPersonales[4][2] = "Electronica     ";
        DatosPersonales[4][3] = "ENEE";
        
        DatosPersonales[5][0] = "Luis  ";
        DatosPersonales[5][1] = "Juarez   ";
        DatosPersonales[5][2] = "Electronica     ";
        DatosPersonales[5][3] = "Gildan";
        
        
        
        for (int i=0; i < DatosPersonales.length; i++){
        for (int j=0; j < DatosPersonales[i].length; j++){
        System.out.print(DatosPersonales[i][j] + "\t");
    }
        System.out.println();
}
    }
}

