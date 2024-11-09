package Laboratorio;

public class Application03 
{
    public static void main(String[] args) 
    {
        //FOR:Repetir desde
        //Example: Ingresar el sueldo de 5 empleado y mostrar el minimo y el maximo sueldo,
                
        //VARIABLES
      
        int min=1025;
        int max=5000;
        int minAux=5000;
        int maxAux=1025;
        
        //ENTRADA
        
        //PROCESO
        for(int cont=1;cont<=5;cont++)
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