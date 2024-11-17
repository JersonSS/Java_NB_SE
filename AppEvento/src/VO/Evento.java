package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

public abstract class Evento 
{
    protected int evento_id;
    protected String nombre;
    protected String organizador;
    protected String descripcion;
    protected LocalDate fecha;
    protected double precio_entrada;
    protected int nro_participantes;
    protected int duracion_dias;
    protected String ubicacion;
    protected double inversion;
    protected String temporada_tarifa;

    public Evento() {
    }

    public Evento(int evento_id, String nombre, String organizador, String descripcion, LocalDate fecha, double precio_entrada, int nro_participantes, int duracion_dias, String ubicacion, double inversion, String temporada_tarifa) {
        this.evento_id = evento_id;
        this.nombre = nombre;
        this.organizador = organizador;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.precio_entrada = precio_entrada;
        this.nro_participantes = nro_participantes;
        this.duracion_dias = duracion_dias;
        this.ubicacion = ubicacion;
        this.inversion = inversion;
        this.temporada_tarifa = temporada_tarifa;
    }
    
    public abstract void detalle(JTextArea area);
    public double getCostoBase()
    {
          return 5000.0;
    }
    public abstract double getIngreso();
    public abstract double getGanancia();
    
    

    public int getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(int evento_id) {
        this.evento_id = evento_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecio_entrada() {
        return precio_entrada;
    }

    public void setPrecio_entrada(double precio_entrada) {
        this.precio_entrada = precio_entrada;
    }

    public int getNro_participantes() {
        return nro_participantes;
    }

    public void setNro_participantes(int nro_participantes) {
        this.nro_participantes = nro_participantes;
    }

    public int getDuracion_dias() {
        return duracion_dias;
    }

    public void setDuracion_dias(int duracion_dias) {
        this.duracion_dias = duracion_dias;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public String getTemporada_tarifa() {
        return temporada_tarifa;
    }

    public void setTemporada_tarifa(String temporada_tarifa) {
        this.temporada_tarifa = temporada_tarifa;
    }

    
    
    
}
