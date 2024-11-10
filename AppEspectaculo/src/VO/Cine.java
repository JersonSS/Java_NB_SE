package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

public class Cine extends Espectaculo
{
    private String tipoPantalla;
    private int nro_salas;
    private int nro_peliculas;
    private boolean is4D;

    public Cine() {
    }

    //contructor padre-hijo ->el hijo cine necesita de las propiedades del padre para armarlafuncion
    public Cine(int espectaculo_id, String descripcion, String patrocinador, LocalDate fpresentacion, double entrada, int duracion, String lugar, int aforo, double inversion, String tipoPantalla, int nro_salas, int nro_peliculas, boolean is4D) {
        
       //constructor padre
       super(espectaculo_id, descripcion, patrocinador, fpresentacion, entrada, duracion, lugar, aforo, inversion);
        
        this.tipoPantalla = tipoPantalla;
        this.nro_salas = nro_salas;
        this.nro_peliculas = nro_peliculas;
        this.is4D = is4D;
    }
    
    public void detalle(JTextArea textArea)
    {
        
    }

    public double getGananciaEntrada()
    {
        return 0.0;
    }
    
    public double getGananciaCombos()
    {
        return 0.0;
    }
    
    public double getTotal()
    {
        return 0.0;   
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public int getNro_salas() {
        return nro_salas;
    }

    public void setNro_salas(int nro_salas) {
        this.nro_salas = nro_salas;
    }

    public int getNro_peliculas() {
        return nro_peliculas;
    }

    public void setNro_peliculas(int nro_peliculas) {
        this.nro_peliculas = nro_peliculas;
    }

    public boolean isIs4D() {
        return is4D;
    }

    public void setIs4D(boolean is4D) {
        this.is4D = is4D;
    }
    
    
    
}
