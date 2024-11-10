package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;

//clase hijo-padre (1)
public class Concierto extends Espectaculo
{
    private String generoMusical;
    private String artista;
    private boolean isExtranjero;

    public Concierto() {
    }

    //contructor padre-hijo(2) ->el hijo concierto necesita de las propiedades del padre para armarlafuncion

    public Concierto(int espectaculo_id, String descripcion, String patrocinador, LocalDate fpresentacion, double entrada, double bebida, int nro_asistentes, int duracion, String lugar, int aforo, double inversion, String generoMusical, String artista, boolean isExtranjero) {
        
        super(espectaculo_id, descripcion, patrocinador, fpresentacion, entrada, bebida, nro_asistentes, duracion, lugar, aforo, inversion);
        
        this.generoMusical = generoMusical;
        this.artista = artista;
        this.isExtranjero = isExtranjero;
    }

    
    public void detalle(JTextArea textArea)
    {
        
    }

    public double getGananciaEntrada()
    {   
        if(duracion>=4)
        {
            entrada=+100;
        }
        else
        {
            entrada=+75;
        }
        
        double ganancia=entrada*nro_asistentes;
        
        return ganancia;
    }
    
    public double getGananciaBebidas()
    {
        switch(artista)
        {
            case "Luis Miguel": bebida=1.25*bebida;break;
            case "Bruno Mars": bebida=1.90*bebida;break;
            case "Deivis Orozco": bebida=3.00*bebida;break;
       
        }

        return bebida;
    }
    
    public double getTotal()
    {
        double gastoExtra=super.inversion-super.getGastoBasico();
        double total=-this.getGananciaEntrada()+this.getGananciaBebidas()-super.getGastoBasico()-gastoExtra;
        return total;   
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public boolean isIsExtranjero() {
        return isExtranjero;
    }

    public void setIsExtranjero(boolean isExtranjero) {
        this.isExtranjero = isExtranjero;
    }
    
    
}
