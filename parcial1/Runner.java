package parcial1;
import java.util.Date;

/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner {
    private String nombre;
    private int dia, mes, anio;
    private Date fechaNacimiento;
    private String paisNacimiento;
    private double altura;
    private int bib;
    private double distancia;
    
    public static final int TEN_K = 1000, HALF_MARATHON = 21097, MARATHON = 42195;
    
    public Runner(String nombre, int dia, int mes, int anio, 
                    String paisNacimiento, double altura, double distancia){
        bib = 0;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        fechaNacimiento = new Date(dia, mes, anio);
        this.paisNacimiento = paisNacimiento;
        this.altura = altura;
        this.distancia = distancia;
    }
    
    public Runner(){
        nombre = "Sebastian Sawe";
        fechaNacimiento = new Date(16, 04, 1996);
        paisNacimiento = "Kenya";
        altura = 168;
        bib = 1;
    }
    
    public int getBib(){
        return bib;
    }
    
    public void setRandomBib(int min, int max){
        if(min >= 0 && min < max){
            double numeroAl = Math.random();
            numeroAl = (max - min + 1) * numeroAl + min;
            this.bib = (int) numeroAl;
        }
    }
    
    public double getHeightInMetersRounded(){
        double alturaMetros = 0;
        alturaMetros = this.altura / 100.0;
        return Math.round(alturaMetros * 10) / 10.0;
    }
    
    public boolean isYounger(Runner other){
        return this.fechaNacimiento.before(other.fechaNacimiento);
    }
    
}