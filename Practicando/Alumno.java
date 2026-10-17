package Practicando;
import java.util.Date;


/**
 * Write a description of class Alumno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int curso;
    private double nota;
    private static int contador;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre, String apellido, int dia, int mes, int anio, int curso, double nota){
        this.nombre = nombre;
        this.apellido = apellido;
        fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        this.curso = curso;
        this.nota = nota;
        contador++;
    }
    
    public static int cantAlumnos(){
        return contador;
    }
    
    public boolean equals(Object other){
        return other instanceof Alumno
            && this.nombre.equals(((Alumno) other) .nombre)
            && this.nombre.equals(((Alumno) other) .nombre);
    }
    
    @Override
    public String toString(){
        return "Alumno\nNombre: " + nombre + "\nApellido: " + apellido + "\nFecha Nacimiento: " + fechaNacimiento + "\nCurso: " + curso
                        + "\nNota: " + nota;
    }
}