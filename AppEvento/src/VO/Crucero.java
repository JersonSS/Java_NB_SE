package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;


public class Crucero extends Evento
{
    
    private String tipoCabina;
    private int duracionTravesia;
    private boolean isComidaIncluida;
    private boolean isEntretenimientoIncluido;

    public Crucero() {
    }

    public Crucero(String tipoCabina, int duracionTravesia, boolean isComidaIncluida, boolean isEntretenimientoIncluido, int evento_id, String nombre, String organizador, String descripcion, LocalDate fecha, double precio_entrada, int nro_participantes, int duracion_dias, String ubicacion, double inversion, String temporada_tarifa) {
        super(evento_id, nombre, organizador, descripcion, fecha, precio_entrada, nro_participantes, duracion_dias, ubicacion, inversion, temporada_tarifa);
        this.tipoCabina = tipoCabina;
        this.duracionTravesia = duracionTravesia;
        this.isComidaIncluida = isComidaIncluida;
        this.isEntretenimientoIncluido = isEntretenimientoIncluido;
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

       // Detalle de Crucero
       textArea.append("\nTipo de Cabina: " + this.tipoCabina);
       textArea.append("\nDuración de la Travesía: " + this.duracionTravesia + " días");
       textArea.append("\nComida Incluida: " + this.isComidaIncluida);
       textArea.append("\nEntretenimiento Incluido: " + this.isEntretenimientoIncluido );

       // Cálculo de ingreso y ganancia
       textArea.append("\nCosto Basico: " + super.getCostoBase());
       textArea.append("\nIngreso de Crucero: " + this.getIngreso());
       textArea.append("\nGanancia de Evento: " + this.getGanancia());
       textArea.append("\n\n");
    }
    
    
public double getTipoCabinas() {
    double tipo_cabina = 0.0;

    switch (tipoCabina) {
        case "Interior":
            tipo_cabina = 0.0; // Sin incremento
            break;
        case "Exterior":
            tipo_cabina += 50; // Incremento de 50 soles
            break;
        case "Suite de Lujo":
            tipo_cabina += 100; // Incremento de 100 soles
            break;
        default:
            tipo_cabina = 0.0; // Sin incremento por defecto
            break;
    }

    return tipo_cabina;
}

    
    
    @Override
    public  double getIngreso()
    {
                double ingreso = super.precio_entrada;

        // Aumento por comida incluida
        if (this.isComidaIncluida) {
            ingreso *= 1.15; // Aumento del 15%
        }

        // Aumento por entretenimiento incluido
        if (this.isEntretenimientoIncluido) {
            ingreso *= 1.10; // Aumento del 10%
        }

        // Condición para aumento si la duración de la travesía es mayor a 7 días
        if (this.duracionTravesia > 7) {
            ingreso *= 1.20; // Aumento del 20%
        }

        // Condición para aumento si la cantidad de participantes supera los 200
        if (super.nro_participantes > 200) {
            ingreso *= 1.10; // Aumento del 10%
        }
        
        ingreso += getTipoCabinas(); 
        
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

        // Ganancia extra si el evento tiene más de 100 participantes
        if (super.nro_participantes > 100) {
            ganancia += 2000; // Ganancia extra de 2000
        }

        return ganancia;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }

    public int getDuracionTravesia() {
        return duracionTravesia;
    }

    public void setDuracionTravesia(int duracionTravesia) {
        this.duracionTravesia = duracionTravesia;
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
