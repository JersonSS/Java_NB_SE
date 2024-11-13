package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;


public class Crucero extends Evento
{
    private String tipoCabina;
    private boolean isComidaIncluida;
    private boolean isEntretenimientoIncluido;

    public Crucero() {
    }

    public Crucero(int evento_id, String nombre, String organizador, LocalDate fecha, double precio_base, int nro_participantes, int duracion_dias, String ubicacion, double costo_adicional, String tipoCabina, boolean isComidaIncluida, boolean isEntretenimientoIncluido) {
        
        super(evento_id, nombre, organizador, fecha, precio_base, nro_participantes, duracion_dias, ubicacion, costo_adicional);
        
        this.tipoCabina = tipoCabina;
        this.isComidaIncluida = isComidaIncluida;
        this.isEntretenimientoIncluido = isEntretenimientoIncluido;
    }
    
    public void detalle(JTextArea textArea)
    {
         super.detalle(textArea);
        textArea.append("\nTipo de Cabina: " + this.tipoCabina);
        textArea.append("\nComida Incluida: " + (this.isComidaIncluida ? "Sí" : "No"));
        textArea.append("\nEntretenimiento Incluido: " + (this.isEntretenimientoIncluido ? "Sí" : "No"));
        textArea.append("\n\n");
    }

    public double getIngreso()
    {
        double ingreso = precio_base;

      if ("suite".equalsIgnoreCase(tipoCabina)) {
            ingreso *= 1.50; // Aumenta 50% si es suite
        }
        if (isComidaIncluida) {
            ingreso *= 1.15; // Aumenta 15% si la comida está incluida
        }
        if (isEntretenimientoIncluido) {
            ingreso *= 1.20; // Aumenta 20% si el entretenimiento está incluido
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
    

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }

    public boolean isIsComidaIncluida() {
        return isComidaIncluida;
    }

    public void setIsComidaIncluida(boolean isComidaIncluida) {
        this.isComidaIncluida = isComidaIncluida;
    }

    public boolean isIsEntretenimientoIncluido() {
        return isEntretenimientoIncluido;
    }

    public void setIsEntretenimientoIncluido(boolean isEntretenimientoIncluido) {
        this.isEntretenimientoIncluido = isEntretenimientoIncluido;
    }
    
    
    
}
