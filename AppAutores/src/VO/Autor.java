package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;


public class Autor 
{
    private int autor_id;
    private String nombre;
    private char sexo;
    private LocalDate fnacimiento;
    private String nacionalidad;
    private double patrimonio;

    public Autor(int autor_id, String nombre, char sexo, LocalDate fnacimiento, String nacionalidad, double patrimonio) {
        this.autor_id = autor_id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fnacimiento = fnacimiento;
        this.nacionalidad = nacionalidad;
        this.patrimonio = patrimonio;
    }

    public void detalle(JTextArea textArea)
    {
        textArea.append("Autor ID: "+this.autor_id);
        textArea.append("\nNombre: "+this.nombre);
        textArea.append("\nSexo: "+this.sexo);
        textArea.append("\nFecha de Nacimiento: "+this.fnacimiento);
        textArea.append("\nNacionalidad: "+this.nacionalidad);
        textArea.append("\nPatrimonio: "+this.patrimonio);
        textArea.append("\n\n");
    }
    
    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

   
    
    
}
