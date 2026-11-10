package parcial2_2;
import java.util.Date;


/**
 * Write a description of class Costume here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Costume {
    public static final int MONSTER = 1, GHOST = 2, WITCH = 3, VAMPIRE = 4;
    
    private String name, size;
    private int type;
    private double weight, price;
    private Date releaseDate;
    
    public Costume(String name, int type, String size, double weight, double price, int dia, int mes, int anio){
        this.name = name;
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.releaseDate = new Date(dia, mes, anio);
    }
    
    public Costume(){
        name = "Classic Ghost";
        type = GHOST;
        size = "M";
        weight = 0.5;
        price = 20.99;
        releaseDate = new Date(31, 10, 2022);
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public boolean isLightWeight(){
        if((weight * 1000) > 100 && weight < 1){
            return true;
        }
        return false;
    }
    
    public boolean isReleasedBefore(Costume other){
        return (this.releaseDate.compareTo(other.releaseDate)) < 0;
    }
    
    @Override
    public boolean equals(Object o){
        return o instanceof Costume c
            && this.name.equals(c.name)
            && this.type == c.type;
    }
    
    @Override
    public String toString(){
        double priceR = Math.round(price * 100) / 100.0;
        double weightR = Math.round(weight * 10) / 10.0;
        return name + ". Release date: " + releaseDate.toString() + ". Price: " +
            priceR + " euros. Weight: " + weightR + " kg.";
    }
}