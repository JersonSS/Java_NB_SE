package VO;

import java.time.LocalDate;
import javax.swing.JTextArea;


public class Veterinario 
{
    private int veterinario_id;           
    private String nombre;                 
    private String apellido;              
    private String DNI;                    
    private LocalDate fecha_nacimiento;    
    private char genero;                   
    private String telefono;               
    private String correo;                 
    private String especialidad;           
    private int años_experiencia;          

    public Veterinario(int veterinario_id, String nombre, String apellido, String DNI, LocalDate fecha_nacimiento, char genero, String telefono, String correo, String especialidad, int años_experiencia) {
        this.veterinario_id = veterinario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.años_experiencia = años_experiencia;
    }
    
    public void detalle(JTextArea textArea) {
        textArea.append("Veterinario ID: " + this.veterinario_id);
        textArea.append("\nNombre: " + this.nombre);
        textArea.append("\nApellido: " + this.apellido);
        textArea.append("\nDNI: " + this.DNI);
        textArea.append("\nFecha de Nacimiento: " + this.fecha_nacimiento);
        textArea.append("\nGénero: " + this.genero);
        textArea.append("\nTeléfono: " + this.telefono);
        textArea.append("\nCorreo: " + this.correo);
        textArea.append("\nEspecialidad: " + this.especialidad);
        textArea.append("\nAños de Experiencia: " + this.años_experiencia);
        textArea.append("\n\n");
    }

    public int getVeterinario_id() {
        return veterinario_id;
    }

    public void setVeterinario_id(int veterinario_id) {
        this.veterinario_id = veterinario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }
    
    
    
   
}
