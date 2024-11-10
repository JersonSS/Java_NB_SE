package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

public class Cine extends Espectaculo
{
    private String tipoPantalla;
    private int nro_salas;
    private int nro_peliculas;
    private double costo_combo;
    private boolean is4D;

    public Cine() {
    }

    //contructor padre-hijo ->el hijo cine necesita de las propiedades del padre para armarlafuncion

    public Cine(int espectaculo_id, String descripcion, String patrocinador, LocalDate fpresentacion, double entrada, double bebida, int nro_asistentes, int duracion, String lugar, int aforo, double inversion, String tipoPantalla, int nro_salas, int nro_peliculas, double costo_combo, boolean is4D) {
        
        super(espectaculo_id, descripcion, patrocinador, fpresentacion, entrada, bebida, nro_asistentes, duracion, lugar, aforo, inversion);
        
        this.tipoPantalla = tipoPantalla;
        this.nro_salas = nro_salas;
        this.nro_peliculas = nro_peliculas;
        this.costo_combo = costo_combo;
        this.is4D = is4D;
    }
    
   
    
    public void detalle(JTextArea textArea)
    {
        
    }

    public double getGananciaEntrada()
    {
        if(tipoPantalla.equals("Grande"))
        {
            entrada=1.50*entrada;
        }
        
        double ganancia=nro_asistentes*entrada;
        
        return ganancia;
    }
    
    public double getGananciaCombos()
    {
        double aumento=0.0;
        double descuento=0.0;
        
        if (tipoPantalla.equals("Grande")) {
            aumento=0.10*costo_combo;
        }
        
        if(aforo>=500&&aforo>=700)
        {
            descuento=0.15*costo_combo;
        }
        
        costo_combo=costo_combo*aumento-descuento;
        
        double ganancia= nro_asistentes*costo_combo;
        
        return ganancia;
    }
    
    public double getTotal()
    {
        
        if(is4D)
        {
            inversion=1.25*inversion;
        }
        
        double gastoExtra=inversion-getGastoBasico();
        double total = this.getGananciaEntrada()+this.getGananciaCombos()-super.getGastoBasico()-gastoExtra;
        
        return total;   
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

    public double getCosto_combo() {
        return costo_combo;
    }

    public void setCosto_combo(double costo_combo) {
        this.costo_combo = costo_combo;
    }

    public boolean isIs4D() {
        return is4D;
    }

    public void setIs4D(boolean is4D) {
        this.is4D = is4D;
    }

    
    
    
}
