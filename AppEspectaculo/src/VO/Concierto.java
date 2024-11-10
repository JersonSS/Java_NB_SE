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
    public Concierto(int espectaculo_id, String descripcion, String patrocinador, LocalDate fpresentacion, double entrada, int duracion, String lugar, int aforo, double inversion, String generoMusical, String artista, boolean isExtranjero) {
        
        //constructor padre(3)
        super(espectaculo_id, descripcion, patrocinador, fpresentacion, entrada, duracion, lugar, aforo, inversion);
        
        this.generoMusical = generoMusical;
        this.artista = artista;
        this.isExtranjero = isExtranjero;
    }
    
    public void detalle(JTextArea textArea)
    {
        
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
