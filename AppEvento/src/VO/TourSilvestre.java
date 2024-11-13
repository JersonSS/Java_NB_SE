package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

public class TourSilvestre extends Evento
{
    private String tipoVehiculo;
    private boolean isGuiaIncluido;
    private boolean isSeguroIncluido;

    public TourSilvestre() {
    }

    public TourSilvestre(int evento_id, String nombre, String organizador, LocalDate fecha, double precio_base, int nro_participantes, int duracion_dias, String ubicacion, double costo_adicional, String tipoVehiculo, boolean isGuiaIncluido, boolean isSeguroIncluido) {
        
        super(evento_id, nombre, organizador, fecha, precio_base, nro_participantes, duracion_dias, ubicacion, costo_adicional);
        
        this.tipoVehiculo = tipoVehiculo;
        this.isGuiaIncluido = isGuiaIncluido;
        this.isSeguroIncluido = isSeguroIncluido;
    }

    public void detalle(JTextArea textArea)
    {
        super.detalle(textArea);
        textArea.append("\nTipo de Vehículo: " + this.tipoVehiculo);
        textArea.append("\nGuía Incluido: " + (this.isGuiaIncluido ? "Sí" : "No"));
        textArea.append("\nSeguro Incluido: " + (this.isSeguroIncluido ? "Sí" : "No"));
        textArea.append("\n\n");
    }

    public double getIngreso()
    {
         double ingreso = precio_base;

        if ("jeep".equalsIgnoreCase(tipoVehiculo)) {
            ingreso *= 1.30; 
        }
        if (isSeguroIncluido) {
            ingreso *= 1.15;  
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
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public boolean isIsGuiaIncluido() {
        return isGuiaIncluido;
    }

    public void setIsGuiaIncluido(boolean isGuiaIncluido) {
        this.isGuiaIncluido = isGuiaIncluido;
    }

    public boolean isIsSeguroIncluido() {
        return isSeguroIncluido;
    }

    public void setIsSeguroIncluido(boolean isSeguroIncluido) {
        this.isSeguroIncluido = isSeguroIncluido;
    }
    
    
    
}
