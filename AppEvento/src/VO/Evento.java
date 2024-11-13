package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

public class Evento 
{
    protected int evento_id;
    protected String nombre;
    protected String organizador;
    protected LocalDate fecha;
    protected double precio_base;
    protected int nro_participantes;
    protected int duracion_dias;
    protected String ubicacion;
    protected double costo_adicional;//para publicidad,servicios

    public Evento() {
    }

    public Evento(int evento_id, String nombre, String organizador, LocalDate fecha, double precio_base, int nro_participantes, int duracion_dias, String ubicacion, double costo_adicional) {
        this.evento_id = evento_id;
        this.nombre = nombre;
        this.organizador = organizador;
        this.fecha = fecha;
        this.precio_base = precio_base;
        this.nro_participantes = nro_participantes;
        this.duracion_dias = duracion_dias;
        this.ubicacion = ubicacion;
        this.costo_adicional = costo_adicional;
    }
    
     public void detalle(JTextArea textArea)
    {
        textArea.append("Evento ID: " + getEvento_id());
        textArea.append("\nNombre: " + getNombre());
        textArea.append("\nOrganizador: " + getOrganizador());
        textArea.append("\nFecha: " + getFecha());
        textArea.append("\nPrecio Base: " + getCostoBase());
        textArea.append("\nNúmero de Participantes: " + getNro_participantes());
        textArea.append("\nDuración (días): " +getDuracion_dias() );
        textArea.append("\nUbicación: " + getUbicacion());
        textArea.append("\nCosto Adicional: " + getCosto_adicional());
    }
    
    public double getCostoBase()
    {
        return 3000.0;
    }

    public double getIngreso()
    {
        return 0.0;
    }
    
    public double getGostoTotal()
    {
        return 0.0;
    }
    
    

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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
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

    public double getCosto_adicional() {
        return costo_adicional;
    }

    public void setCosto_adicional(double costo_adicional) {
        this.costo_adicional = costo_adicional;
    }
    
    
    
}
