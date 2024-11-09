/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Jerson
 */
public class Aplicacion02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //SWITCH: condicional multiple
        //Example: Ingrese un canal de TV en número y muestrelo en texto.
        
        //VARIABLES
        String texto=null;
        
        //ENTRADA
        System.out.println("Ingrese canal TV en número: ");
        int canal=Integer.parseInt(sc.nextLine());
        
        //PROCESO
        switch (canal) {
            case 2: texto="Latina TV"; break;
            case 4: texto="America TV"; break;
            case 5: texto="Panamericana TV"; break;
            case 7: texto="TV Perú TV"; break;
            case 9: texto="ATV TV"; break;
            case 11: texto="Global TV"; break;
            default: texto="¡Error , canal no existe!"; break;
        }
        
        //SALIDA
        System.out.println("Canal: "+texto);
        
        
    }
}
