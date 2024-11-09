/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

/**
 *
 * @author Jerson
 */
public class Aplicacion 
{
    //metodo ejecutable consola 
    public static void main(String[] args) 
    {
        //ARITMETICOS(+,-,/,%)
        //COMPARACION (>,>=,<,<=,==,!=)
        //LOGICOS (&&,||,!)
        
        int num1 = 19;
        int num2 = 4;
        
        int producto = num1*num2;
        
        System.out.println("El producto es: "+producto);
        
        //instituto A: se debe aprobar todos los cursos para pasar ciclo
        boolean java = true;
        boolean bd = true;
        boolean html=true;
        
        boolean result1 =(java && bd && html);
        System.out.println("Pasa de ciclo: "+result1);
        
        //institu B: se de aprobar solo un curso para pasar ciclo
        boolean fisica = false;
        boolean quimica = false;
        boolean arte=true;
        boolean result2 =(fisica|| quimica || arte);
        System.out.println("Pasa de ciclo" +result2);
        
        boolean enPareja=true;
        System.out.println("¿Tienes pareja? " +(!enPareja));
    }
}
