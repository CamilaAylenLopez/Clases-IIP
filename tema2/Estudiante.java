package tema2;

// clase tipo de datos
//cabecera de la clase
public class Estudiante { //cuerpo de la clase
    //ATRIBUTOS
    private String nombre;
    private int edad;
    
    //METODOS
    //constructor por defecto
    public Estudiante(){
        this.nombre = "Camila";
        this.edad = 20;
    }
    //constructor con parametros
    public Estudiante(String nombre, int edad){//inicializa los atributos
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //método consultor
    public String getNombre(){
        return nombre;
    }
    
    //método modificador
    public void setNombre(String newNombre){
        nombre = newNombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int newEdad){
        edad = newEdad;
    }
}