package Practica;

import java.util.Scanner;

public class Aplicacion01 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        //VARIABLES
        double aumento = 0.0;
        double sueldo_total=0.0;
        String mensaje = null;
        
        //ENTRADA
        System.out.println("Ingrese el sueldo: ");
        double sueldo = Double.parseDouble(sc.nextLine());
        
        System.out.println("Ingrese su estado civil: ");
        String estado_civil= sc.nextLine();
        
        //PROCESO
        switch (estado_civil) {
            case "S":
                    aumento = sueldo;
                    sueldo_total = aumento;
                    mensaje = "No tiene aumento ";
                break;
            case "C":
                    aumento = sueldo * 0.2;
                    sueldo_total = aumento +sueldo;
                    mensaje = "Tiene aumento del 20%";
                break;
            case "V":
                    aumento = sueldo * 0.25;
                    sueldo_total = aumento +sueldo;
                    mensaje = "Tiene aumento del 25%";
                break;
            default: break;

        }
        
        //SALIDA
        System.out.println(mensaje);
        System.out.println("Sueldo Base: "+sueldo);
        System.out.println("Aumento: "+sueldo);
        System.out.println("Sueldo Total: "+sueldo_total);
        
       
        
    }
}
