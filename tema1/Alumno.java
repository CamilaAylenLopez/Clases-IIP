package tema1;
import java.util.Date;

public class Alumno {
    private String nombre;
    private Date fechaNacimeinto;
    int curso;
    private double nota;
    
    public Alumno(String nombre, Date fechaNacimeinto, int curso, double nota){
        this.nombre = nombre;
        this.fechaNacimeinto = fechaNacimeinto;
        this.curso = curso;
        this.nota = nota;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFechaNacimeinto(Date fechaNacimeinto){
        this.fechaNacimeinto = fechaNacimeinto;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public void setCurso(int curso){
        this.curso = curso;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Date getFacheNacimiento(){
        return fechaNacimeinto;
    }
    
    public double getNota(){
        return nota;
    }
    
    public int getCurso(){
        return curso;
    }
}