package parcial2;
import java.util.Date;


/**
 * Write a description of class Costume here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Costume {
    private String name;
    private int type;
    private String size;
    private double weight;
    private double price;
    private Date releaseDate;
    
    public static final int MONSTER = 1, GHOST = 2, WITCH = 3, 
        VAMPIRE = 4;
    
    public Costume(){
        name = "Classic Ghost";
        type = 2;
        size = "M";
        weight = 0.5;
        price = 20.99;
        releaseDate = new Date(31, 10, 2022);
    }
        
    public Costume(String name, int type, String size, double weight, double price, int dia, int mes, int anio){
        this.name = name;
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.releaseDate = new Date(dia, mes, anio);
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double newPrice){
        price = newPrice;
    }
    
    public boolean isLightWeight(){
        return 1 > weight && weight > 0.1;
    }
    
    public boolean isReleasedBefore(Costume other){
        return (this.releaseDate.compareTo(other.releaseDate)) < 0;
        //return (other.releaseDate.compareTo(this.releaseDate)) > 0;
    }
    
    @Override
    public boolean equals(Object o){
        return o instanceof Costume
            && this.name.equals(((Costume) o).name)
            && this.type == ((Costume) o).type;
    }
    
    public String toString(){
        double priceRedondeado = this.price, pesoRedondeado = this.weight;
        priceRedondeado = Math.round(priceRedondeado * Math.pow(10, 2)) / Math.pow(10, 2);
        pesoRedondeado = Math.round(pesoRedondeado * Math.pow(10, 1)) / Math.pow(10, 1);
        return name + ". Release date: " + releaseDate.toString()
            + ". Price: " + priceRedondeado + " euros. Weight: "
            + pesoRedondeado + " kg.";
    }
}