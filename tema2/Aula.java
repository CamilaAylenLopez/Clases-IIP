package tema2;


/**
 * Write a description of class Aula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//CLASE TIPO PRORAMA
public class Aula{
    //constructor
    private Aula(){}
    
    //método main
    public static void main (String[] args){
        Estudiante estu = new Estudiante();
        Estudiante estuD = new Estudiante("Fran", 5);
        
        System.out.println(estu.getNombre());
        System.out.println(estuD.getNombre());
        
        estu.setNombre("Fran");
        estuD.setNombre("Camila");
        
        System.out.println(estu.getNombre());
        System.out.println(estuD.getNombre());
    }
}