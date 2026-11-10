import java.util.Scanner;
import java.util.Locale;

/**
 * Write a description of class PruebasRapidas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PruebasRapidas {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double a = 89.9;
        System.out.println((int) a);
        System.out.println(Math.round(a));
        System.out.println(Math.sqrt(-5));
        //System.out.println(9/0);
        
        System.out.println("NUMERO RANDOM, numero uno:");
        int num = teclado.nextInt();
        System.out.println("numero dos");
        int numD = teclado.nextInt();
        
        for(int i = 0; i <= 10; i++){
             System.out.println((int) ((Math.abs(num - numD) + 1) * Math.random() + Math.min(num, numD)));   
        }
        
        System.out.println("---------------------------------");
        
        System.out.println("Numero en decimal");
        double numDecimal = teclado.nextDouble();
        System.out.println("cant decimales");
        int decimales = teclado.nextInt();
        
        System.out.println(Math.round(Math.pow(10, decimales) * numDecimal) / Math.pow(10, decimales));
        
        int cuatro = 4, seis = 6;
        
        System.out.println((Math.pow(cuatro, 2) + seis) / (double) seis);
        
        int dos = 2, menosSiete = -7, tres = 3;
        System.out.println((- menosSiete + Math.sqrt(Math.pow(menosSiete, 2) - 4 * dos * tres))/ (2.0 * dos));
        
    }
}