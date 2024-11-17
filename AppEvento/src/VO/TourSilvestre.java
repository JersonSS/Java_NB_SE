package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

public class TourSilvestre extends Evento
{
    private String tipoVehiculo;
    private int cantidadParadas;
    private boolean isGuiaIncluido;
    private boolean isSeguroIncluido;

    public TourSilvestre() {
    }

    public TourSilvestre(String tipoVehiculo, int cantidadParadas, boolean isGuiaIncluido, boolean isSeguroIncluido, int evento_id, String nombre, String organizador, String descripcion, LocalDate fecha, double precio_entrada, int nro_participantes, int duracion_dias, String ubicacion, double inversion, String temporada_tarifa) {
        super(evento_id, nombre, organizador, descripcion, fecha, precio_entrada, nro_participantes, duracion_dias, ubicacion, inversion, temporada_tarifa);
        this.tipoVehiculo = tipoVehiculo;
        this.cantidadParadas = cantidadParadas;
        this.isGuiaIncluido = isGuiaIncluido;
        this.isSeguroIncluido = isSeguroIncluido;
    }
    
    @Override
    public void detalle(JTextArea textArea)
    {
        textArea.append("Evento ID: " + super.evento_id);
        textArea.append("\nNombre del Evento: " + super.nombre);
        textArea.append("\nOrganizador: " + super.organizador);
        textArea.append("\nDescripción: " + super.descripcion);
        textArea.append("\nFecha: " + super.fecha);
        textArea.append("\nPrecio Entrada: " + super.precio_entrada);
        textArea.append("\nNúmero de Participantes: " + super.nro_participantes);
        textArea.append("\nDuración del Evento: " + super.duracion_dias);
        textArea.append("\nUbicación: " + super.ubicacion);
        textArea.append("\nInversión: " + super.inversion);
        textArea.append("\nTemporada Tarifa: " + super.temporada_tarifa);

        // Detalle de Tour Silvestre
      
        textArea.append("\nTipo de Vehículo: " + this.tipoVehiculo);
        textArea.append("\nCantidad de Paradas: " + this.cantidadParadas);
        textArea.append("\nGuía Incluido: " + this.isGuiaIncluido );
        textArea.append("\nSeguro Incluido: " + this.isSeguroIncluido);

        // Cálculo de ingreso y ganancia
        textArea.append("\nCosto Basico: " + super.getCostoBase());
       textArea.append("\nIngreso de Crucero: " + this.getIngreso());
       textArea.append("\nGanancia de Evento: " + this.getGanancia());
       textArea.append("\n\n");
    }
    
public double getTipoVehiculos() {
    double tipo_vehiculo = 0.0;

    switch (tipoVehiculo) {
        case "Jeep":
            tipo_vehiculo = 50; // Incremento de 50 soles
            break;
        case "Camion":
            tipo_vehiculo += 20; // Incremento de 20 soles
            break;
        case "Miniban":
            tipo_vehiculo += 30; // Incremento de 30 soles
            break;
        default:
            tipo_vehiculo = 0.0; // Sin incremento por defecto
            break;
    }

    return tipo_vehiculo;
}
    
    
    @Override
    public  double getIngreso()
    {
        double ingreso = super.precio_entrada;

        // Aumento por guía incluido
        if (this.isGuiaIncluido) {
            ingreso *= 1.20; // Aumento del 20%
        }

        // Aumento por seguro incluido
        if (this.isSeguroIncluido) {
            ingreso *= 1.15; // Aumento del 15%
        }

        // Condición para aumento si la cantidad de paradas supera 3
        if (this.cantidadParadas > 3) {
            ingreso *= 1.10; // Aumento del 10%
        }
        
        ingreso += getTipoVehiculos();
        
        // Aplicar descuento según temporada
        if (temporada_tarifa.equals("Baja")) {
            ingreso *= 0.80; // Descuento del 20%
        } else if (temporada_tarifa.equals("Alta")) {
            ingreso *= 1.10; // Aumenta del 10%
        }
        
        return ingreso * super.nro_participantes;
    }
    
    @Override
    public  double getGanancia()
    {
          double gasto_base = super.inversion - super.getCostoBase();
        double ganancia = getIngreso() - super.getCostoBase() - gasto_base;

        // Ganancia extra si el evento tiene más de 50 participantes
        if (super.nro_participantes > 50) {
            ganancia += 500; // Ganancia extra de 500
        }

        return ganancia;
    }
    

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCantidadParadas() {
        return cantidadParadas;
    }

    public void setCantidadParadas(int cantidadParadas) {
        this.cantidadParadas = cantidadParadas;
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
