package parcial4;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {
    public static final double WEIGHT_1 = 0.40, WEIGHT_2 = 0.60;
    String name, surname1, surname2;
    String dni;
    double grade1, grade2;
    
    public Student(String name, String surname1, String surname2, String dni){
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.dni = dni;
    }
    
    public void setGrade1(double newGarde){
        grade1 = newGarde;
    }
}