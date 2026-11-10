package parcial3;
import java.util.Date;


/**
 * Write a description of class Sticker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sticker {
    public static final int GOALKEEPER = 1, DEFENDER = 2, MIDFIELDER = 3,
        FORWARD = 4;
    private String name, team;
    private int rol, height;
    private double weight;
    private Date birthDate;
    
    public Sticker(String name, String team, int rol, int height, double weight, int dia, int mes, int anio){
        this.name = name;
        this.team = team;
        this.rol = rol;
        this.height = height;
        this.weight = weight;
        birthDate = new Date(dia, mes, anio);
    }
    
    public Sticker(){
        name = "Olga Carmona";
        team = "Real Madrid C.F";
        rol = DEFENDER;
        height = 159;
        weight = 51.5;
        birthDate = new Date(12, 06, 2000);
    }
    
    @Override
    public boolean equals(Object o){
        return o instanceof Sticker
            && this.name.toUpperCase().equals(((Sticker) o).name.toUpperCase())
            && this.team.toUpperCase().equals(((Sticker) o).team.toUpperCase())
            && this.rol == ((Sticker) o).rol;
    }
    
    public boolean isIMCNormal(){
        double imc = weight / Math.pow(height / 100.0, 2);
        
        return 18.5 <= imc && imc >= 24.9;
    }
    
    public boolean isYounger(Sticker other){
        return this.birthDate.compareTo(other.birthDate) > 0;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.team + "). Birthdate: " + this.birthDate.toString() 
            + ". Weight: " + this.weight + " kg. Height: " + this.height + " cm.";
    }
}