package VO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTextArea;

public class Excursion extends Evento{
    
    private String tipo_actividad;
    private boolean isGuiaIncluido;
    private boolean isAlmuerzoIncluido;

    public Excursion() {
    }

    public Excursion(int evento_id, String nombre, String organizador, LocalDate fecha, double precio_base, int nro_participantes, int duracion_dias, String ubicacion, double costo_adicional, String tipo_actividad, boolean isGuiaIncluido, boolean isAlmuerzoIncluido) {
        
        super(evento_id, nombre, organizador, fecha, precio_base, nro_participantes, duracion_dias, ubicacion, costo_adicional);
        
        this.tipo_actividad = tipo_actividad;
        this.isGuiaIncluido = isGuiaIncluido;
        this.isAlmuerzoIncluido = isAlmuerzoIncluido;
    }
    
    public void detalle(JTextArea textArea)
    {
        super.detalle(textArea);
   
        textArea.append("\nTipo de Actividad: " + this.tipo_actividad);
        textArea.append("\nGuía Incluido: " + (this.isGuiaIncluido ? "Si" : "No"));
        textArea.append("\nAlmuerzo Incluido: " + (this.isAlmuerzoIncluido ? "Si" : "No"));
        textArea.append("\n\n");
    }

    public double getIngreso()
    {
         double ingreso = precio_base; // precio base de entrada por persona

       
        if (isGuiaIncluido) {
            ingreso = ingreso * 1.20; 
        }

      
        if (isAlmuerzoIncluido) {
            ingreso = ingreso * 1.10;  
        }

        
        return ingreso * nro_participantes; 
    
    }
    
    public double getCostoTotal()
    {
       
        double ingresoTotal = getIngreso(); 

        
        double costoTotal = getCostoBase() + costo_adicional;

       
        double balance = ingresoTotal - costoTotal;

        // Sies positivo, se tiene ganancia; si es negativo, se tiene perdida.
        return balance;

    }
    

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }

    public boolean isIsGuiaIncluido() {
        return isGuiaIncluido;
    }

    public void setIsGuiaIncluido(boolean isGuiaIncluido) {
        this.isGuiaIncluido = isGuiaIncluido;
    }

    public boolean isIsAlmuerzoIncluido() {
        return isAlmuerzoIncluido;
    }

    public void setIsAlmuerzoIncluido(boolean isAlmuerzoIncluido) {
        this.isAlmuerzoIncluido = isAlmuerzoIncluido;
    }
    
    
    
    
}
