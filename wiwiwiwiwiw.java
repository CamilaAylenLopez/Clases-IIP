import java.util.Scanner;
import java.util.Locale;

/**
 * Write a description of class wiwiwiwiwiw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wiwiwiwiwiw {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Decime un número");
        double numero = teclado.nextDouble();
        System.out.println("Redondear a que número?");
        int decimales = teclado.nextInt();
        
        double resultado = Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
        
        System.out.println(resultado);
        
        System.out.println("Decime un numero");
        int numUno = teclado.nextInt();
        System.out.println("Decime otro numero");
        int numDos = teclado.nextInt();
        
        for(int i = 0; i <= 10; i++){
            System.out.println((int) (Math.random() * (Math.abs(numUno - numDos) + 1) + Math.min(numUno, numDos)));
        }
        
        int a = 5;
        int b = 10;
        
        //int numRandom = (int) (Math.random() * (b - a + 1) + a);
        
        for(int i = 0; i <= 10; i++){
            int numRandom = (int) (Math.random() * (b - a + 1) + a);
            System.out.println(numRandom);
        }
        
        for(int i = 0; i <= 10; i++){
            double numRandom = (Math.random() * (b - a) + a);
            System.out.println(numRandom);
        }
    }
}