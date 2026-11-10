package parcial5;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 * Write a description of class TimeInstant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeInstant {
    
    private int hh, mm;
    
    public TimeInstant(int hh, int mm){
        this.hh = hh;
        this.mm = mm;
    }
    
    public TimeInstant(){
        LocalTime tiempoActual = LocalTime.now();
        
        this.hh = tiempoActual.getHour();
        this.mm = tiempoActual.getMinute();
    }
}