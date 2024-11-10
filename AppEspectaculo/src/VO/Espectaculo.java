
package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;


public class Espectaculo 
{
    protected int espectaculo_id;
    protected String descripcion;
    protected String patrocinador;
    protected LocalDate fpresentacion;
    protected double entrada;
    protected double bebida;
    protected int nro_asistentes;
    protected int duracion;
    protected String lugar;
    protected int aforo;
    protected double inversion;

    public Espectaculo() {
    }

    public Espectaculo(int espectaculo_id, String descripcion, String patrocinador, LocalDate fpresentacion, double entrada, double bebida, int nro_asistentes, int duracion, String lugar, int aforo, double inversion) {
        this.espectaculo_id = espectaculo_id;
        this.descripcion = descripcion;
        this.patrocinador = patrocinador;
        this.fpresentacion = fpresentacion;
        this.entrada = entrada;
        this.bebida = bebida;
        this.nro_asistentes = nro_asistentes;
        this.duracion = duracion;
        this.lugar = lugar;
        this.aforo = aforo;
        this.inversion = inversion;
    }
    
    

    
    public void detalle(JTextArea textArea)
    {
        
    }
    
    public double getGastoBasico()
    {
        return 4000.0;
    }

    public double getGananciaEntrada()
    {
        return 0.0;
    }
    
    public double getGananciaBebidas()
    {
        return 0.0;
    }
    
    public double getTotal()
    {
        return 0.0;   
    }

    public int getEspectaculo_id() {
        return espectaculo_id;
    }

    public void setEspectaculo_id(int espectaculo_id) {
        this.espectaculo_id = espectaculo_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public LocalDate getFpresentacion() {
        return fpresentacion;
    }

    public void setFpresentacion(LocalDate fpresentacion) {
        this.fpresentacion = fpresentacion;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getBebida() {
        return bebida;
    }

    public void setBebida(double bebida) {
        this.bebida = bebida;
    }

    public int getNro_asistentes() {
        return nro_asistentes;
    }

    public void setNro_asistentes(int nro_asistentes) {
        this.nro_asistentes = nro_asistentes;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }
    
   
    
    
}
