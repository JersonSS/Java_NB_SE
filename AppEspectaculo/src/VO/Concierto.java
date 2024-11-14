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

    
    @Override
    public void detalle(JTextArea textArea)
    {
        textArea.append("Expectaculo ID: "+super.espectaculo_id);
        textArea.append("\nDescripcion: "+super.descripcion);
        textArea.append("\nPatrocinador: "+super.patrocinador);
        textArea.append("\nEntrada: "+super.entrada);
        textArea.append("\nBebida: "+super.bebida);
        textArea.append("\nNro. de asistentes: "+super.nro_asistentes);
        textArea.append("\nDuración: "+super.duracion+" min.");
        textArea.append("\nLugar: "+super.lugar);
        textArea.append("\nAforo: "+super.aforo);
        textArea.append("\nInversión: "+super.inversion);
        textArea.append("\nGénero Musical: "+this.generoMusical);
        textArea.append("\nArtista: "+this.artista);
        textArea.append("\nExtranjero: "+this.isExtranjero);
        textArea.append("\nGasto basico: "+super.getGastoBasico());
        textArea.append("\nGanancia de entradas: "+this.getGananciaEntrada());
        textArea.append("\nGanancia de bebidas: "+this.getGananciaBebidas());
        textArea.append("\nTotal Ganancia/perdida: "+this.getTotal());
        textArea.append("\n\n");
        
    }

    @Override
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
    
    @Override
    public double getGananciaBebidas()
    {
        switch(artista)
        {
            case "Luis Miguel": bebida=1.25*bebida;break;
            case "Bruno Mars": bebida=1.90*bebida;break;
            case "Deivis Orozco": bebida=3.00*bebida;break;
       
        }
        
        double ganancia = bebida*nro_asistentes;

        return ganancia;
    }
    
    @Override
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
