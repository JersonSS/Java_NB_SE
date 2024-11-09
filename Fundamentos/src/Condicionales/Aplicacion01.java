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
public class Aplicacion01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //IF-ESLE
        //Example: Ingrese cantidad de hijos, si tiene 3 o mas recibe s/ 100 por cada hijo
        // de lo contrario recibe solo s/50
        
        //VARIBLES
        double bono = 0.0;
        
        //ENTRADA
        System.out.println("Ingrese cantidad de hijos: ");
        int hijos= Integer.parseInt(sc.nextLine());
        
        //PROCESO
        if (hijos>=3) {
            bono = 100*hijos;
        } else {
            bono=50.0;
        }
        
        //SALIDA
        System.out.println("Bono: S/"+bono);
    
        
    }
}
