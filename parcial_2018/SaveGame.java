package parcial_2018;
import java.time.Instant;

/**
 * Write a description of class SaveGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SaveGame {
    public static final int MINUTOS_POR_DIA = 1440;
    private String region;
    private int posicion, identificador;
    private float progreso;

    
    public SaveGame(String region, int identificador, int posicion, int t){
        this.region = region;
        this.identificador = identificador;
        this.posicion = posicion;
        this.progreso = (t / MINUTOS_POR_DIA) * 100;   
    }
    
    public String toHHMM(){
        int hs = (int) (((progreso / 100) * MINUTOS_POR_DIA) / 60.0);
        int mm = (int) (((progreso / 100) * MINUTOS_POR_DIA) % 60.0);
        return hs + ":" + mm;
    }
    
    @Override
    public boolean equals(Object other){
        return other instanceof SaveGame
            && this.identificador == ((SaveGame) other).identificador
            && this.progreso == ((SaveGame) other).progreso;
    }
    
    @Override
    public String toString(){
        String formato;
        double progresoR = Math.round(progreso * 10) / 10.0;
        if (region.equals("SCES") || region.equals("SLES")){
            formato = "PAL";
        } else if(region.equals("SCUS") || region.equals("SLUS")){
            formato = "USA";
        } else{
            formato = "JAP";
        }
        return region + ": " + formato + "_" + (identificador / 100.0) + " - " + posicion +
            " - " + progreso + "%";
    }
    
    public int compareTo(SaveGame o){
        if(this.region.equals(o.region)){
            if(this.identificador != o.identificador){
                return Math.min(this.identificador, o.identificador);
            }else{
                if(this.progreso < o.progreso){
                    return (int) this.progreso;
                }else{
                    return (int) o.progreso;
                }
            }
            
        }else{
            return 9;
        }
    }
}