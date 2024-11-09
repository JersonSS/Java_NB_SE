package Laboratorio;

public class Application01 
{
    public static void main(String[] args) 
    {
        //WHILE: Repetir mientras, primero pregunta luego ejecuta
        //Example: Ingresar el sueldo de 5 empleado y mostrar el minimo y el maximo sueldo.
        
        //VARIABLES
        int cont=1;
        int min=1025;
        int max=5000;
        int minAux=5000;
        int maxAux=1025;
        
        //ENTRADA
        
        //PROCESO
        while(cont<=5)
        {
            int sueldo=(int)((max-min+1)*Math.random()+min);
            System.out.println("Sueldo EMP#"+cont+": s/"+sueldo);
            
            minAux= Math.min(sueldo, minAux);
            maxAux= Math.max(sueldo, maxAux);
            cont++;
        }
        //SALIDA
        System.out.println("\nMinimo sueldo: S/"+minAux);
        System.out.println("Maximo sueldo: S/"+maxAux);
        
    }
}
