package parcial1;
import java.util.Scanner;
import java.util.Locale;

/**
 * Write a description of class Programa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Programa {
    public static void main(String[] args){
        
        //a
        Runner r1 = new Runner();
        System.out.println(r1.toString());
        
        //b
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nombre");
        String nombre = teclado.nextLine();
        System.out.println("Pais");
        String pais = teclado.nextLine();
        System.out.println("Altura");
        double altura = teclado.nextDouble();
        System.out.println("Día de nacimiento");
        int dia = teclado.nextInt();
        System.out.println("Mes de nacimiento");
        int mes = teclado.nextInt();
        System.out.println("Año de nacimiento");
        int anio = teclado.nextInt();
        
        //c
        Runner r2 = new Runner(nombre, dia, mes, anio, pais, altura, Runner.HALF_MARATHON);
        
        //d
        r2.setRandomBib(50, 100);
        
        //e
        System.out.println(r2.toString());
        
        //f
        System.out.println("Is yonger? " + r1.isYounger(r2));
        
        //ULTIMO PUNTO
        //Initially: x = 5.0, y = 2.0, p = (5.0, 2.0)
        //After firstMethod: x = 5.0, y = 2.0, p = (7.0, 3.0)
        //"After secondMethod: x = 5.0, y = 2.0, p = (3.0, 7.0)
    }
}