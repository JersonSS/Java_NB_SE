package Laboratorio;

public class Application05 
{
    public static void main(String[] args) 
    {
        int cont=1;
        boolean triste=false;
        
        for(;;)
        {
             System.out.println(cont+": Soy un estudiante feliz.");
             cont++;
             
             if(cont==100)
                 break; //romper bucle FOR
             
             cont++;
        }
    }
}
