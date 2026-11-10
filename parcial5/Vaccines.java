package parcial5;
import java.util.Scanner;
import java.util.Locale;

/**
 * Write a description of class Vaccines here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vaccines {
    public static void main(String[] args){
        VaccineDosis vac1 = new VaccineDosis();
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("SIP");
        String sip = teclado.nextLine();
        System.out.println("Dosis");
        double dosis = teclado.nextDouble();
        
        VaccineDosis vac2 = new VaccineDosis(VaccineDosis.PFIZER, dosis, 8, 0, sip);
        
        String res = "VAC1";
        
        if(vac1.compareTo(vac2) == -1){
            res = "VAC2";
        }else if(vac1.compareTo(vac2) == 0){
            res = "que son iguales";
        }
        
        System.out.println("La dosis más efectiva es " + res);
    }
}