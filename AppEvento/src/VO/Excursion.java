package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

public class Excursion extends Evento{
    
    private String tipo_actividad;
    private double distanciaRecorrida;
    private boolean isGuiaIncluido;
    private boolean isAlmuerzoIncluido;

    public Excursion() {
    }

    public Excursion(String tipo_actividad, double distanciaRecorrida, boolean isGuiaIncluido, boolean isAlmuerzoIncluido, int evento_id, String nombre, String organizador, String descripcion, LocalDate fecha, double precio_entrada, int nro_participantes, int duracion_dias, String ubicacion, double inversion, String temporada_tarifa) {
        super(evento_id, nombre, organizador, descripcion, fecha, precio_entrada, nro_participantes, duracion_dias, ubicacion, inversion, temporada_tarifa);
        this.tipo_actividad = tipo_actividad;
        this.distanciaRecorrida = distanciaRecorrida;
        this.isGuiaIncluido = isGuiaIncluido;
        this.isAlmuerzoIncluido = isAlmuerzoIncluido;
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

        // Detalle de Excursión
        textArea.append("\nTipo de Actividad: " + this.tipo_actividad);
        textArea.append("\nDistancia Recorrida: " + this.distanciaRecorrida + " km");
        textArea.append("\nGuía Incluido: " + this.isGuiaIncluido );
        textArea.append("\nAlmuerzo Incluido: " + this.isAlmuerzoIncluido );

        // Cálculo de ingreso y ganancia
        textArea.append("\nCosto Basico: " + super.getCostoBase());
        textArea.append("\nIngreso de Excursión: " + this.getIngreso());
        textArea.append("\nGanancia de Evento: " + this.getGanancia());
        textArea.append("\n\n");
    }
    
    public double getTipoActividad()
    {
          double incremento = 0.0;

        switch (tipo_actividad) {
            case "Senderismo":
                incremento = 15; // Aumento de 15 soles
                break;
            case "Bici de montaña":
                incremento = 20; // Aumento de 20 soles
                break;
            case "Escalada":
                incremento = 25; // Aumento de 25 soles
                break;
            case "Trekking":
                incremento = 30; // Aumento de 30 soles
                break;
            default:
                incremento = 0;  // No aumento si la actividad no está definida
                break;
        }

        return incremento; 
    }
    
    
    @Override
    public  double getIngreso()
    {
       double ingreso = super.precio_entrada;

        // Aumento por guía incluido
        if (this.isGuiaIncluido) {
            ingreso *= 1.20; // Aumento del 20%
        }

        // Aumento por almuerzo incluido
        if (this.isAlmuerzoIncluido) {
            ingreso *= 1.10; // Aumento del 10%
        }

        // Condición para aumento si la cantidad de participantes supera los 100
        if (super.nro_participantes > 100) {
            ingreso *= 1.15; // Aumento del 15%
        }

        // Condición para aumento si la duración del evento es mayor a 5 días
        if (super.duracion_dias > 5) {
            ingreso *= 1.10; // Aumento del 10%
        }
        
        ingreso += getTipoActividad();
              
        // Aplicar descuento según temporada
        if (temporada_tarifa.equals("Baja")) {
            ingreso *= 0.80; // Descuento del 20%
        } else if (temporada_tarifa.equals("Alta")) {
            ingreso *= 1.10; // Aumenta del 10%
        }
        
         return ingreso*nro_participantes;
        
    }
    
    
    @Override
    public  double getGanancia()
    {
        double gasto_base=super.inversion-super.getCostoBase();
         double ganancia = getIngreso()+getTipoActividad()-super.getCostoBase()- gasto_base;

        // Ganancia extra si el evento tiene más de 50 participantes
        if (super.nro_participantes > 50) {
            ganancia += 1000; // Ganancia extra de 1000
        }

        return ganancia;
    }
    
    

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
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
