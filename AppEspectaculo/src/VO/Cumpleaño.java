package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;


public class Cumpleaño extends Espectaculo
{
    private String cumpleañearo;
    private LocalDate fcumpleaño;
    private boolean isPayaso;
    private boolean isHoraLoca;
    private boolean isPiñata;
    private boolean isOrquesta;
    private String tipoShow;

    public Cumpleaño() {
    }

    //contructor padre-hijo ->el hijo cumpleaño necesita de las propiedades del padre para armarlafuncion
    public Cumpleaño(int espectaculo_id, String descripcion, String patrocinador, LocalDate fpresentacion, double entrada, int duracion, String lugar, int aforo, double inversion, String cumpleañearo, LocalDate fcumpleaño, boolean isPayaso, boolean isHoraLoca, boolean isPiñata, boolean isOrquesta, String tipoShow) {
        
         //constructor padre
        super(espectaculo_id, descripcion, patrocinador, fpresentacion, entrada, duracion, lugar, aforo, inversion);
        
        this.cumpleañearo = cumpleañearo;
        this.fcumpleaño = fcumpleaño;
        this.isPayaso = isPayaso;
        this.isHoraLoca = isHoraLoca;
        this.isPiñata = isPiñata;
        this.isOrquesta = isOrquesta;
        this.tipoShow = tipoShow;
    }
    
    public void detalle(JTextArea textArea)
    {
        
    }
    
    public double getTotal()
    {
        return 0.0;   
    }

    public String getCumpleañearo() {
        return cumpleañearo;
    }

    public void setCumpleañearo(String cumpleañearo) {
        this.cumpleañearo = cumpleañearo;
    }

    public LocalDate getFcumpleaño() {
        return fcumpleaño;
    }

    public void setFcumpleaño(LocalDate fcumpleaño) {
        this.fcumpleaño = fcumpleaño;
    }

    public boolean isIsPayaso() {
        return isPayaso;
    }

    public void setIsPayaso(boolean isPayaso) {
        this.isPayaso = isPayaso;
    }

    public boolean isIsHoraLoca() {
        return isHoraLoca;
    }

    public void setIsHoraLoca(boolean isHoraLoca) {
        this.isHoraLoca = isHoraLoca;
    }

    public boolean isIsPiñata() {
        return isPiñata;
    }

    public void setIsPiñata(boolean isPiñata) {
        this.isPiñata = isPiñata;
    }

    public boolean isIsOrquesta() {
        return isOrquesta;
    }

    public void setIsOrquesta(boolean isOrquesta) {
        this.isOrquesta = isOrquesta;
    }

    public String getTipoShow() {
        return tipoShow;
    }

    public void setTipoShow(String tipoShow) {
        this.tipoShow = tipoShow;
    }
    
    
}
