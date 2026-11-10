package parcial2_2;
import java.util.Scanner;
import java.util.Locale;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test {
    public static void main (String[] args){
        Costume costume1 = new Costume();
        System.out.println(costume1.toString());
        
        for(int i = 0; i <= 20; i++){
            double precioRandom = (36 - 5.0) * Math.random() + 5.0;
            double pesoRandom = (3 - 0.5) * Math.random() + 0.5;
            System.out.println(precioRandom + " | " + pesoRandom);
        }
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nombre");
        String name = teclado.nextLine();
        System.out.println("Día");
        int dia = teclado.nextInt();
        System.out.println("Mes");
        int mes = teclado.nextInt();
        System.out.println("Año");
        int anio = teclado.nextInt();
        
        double precioRandom = (36 - 5.0) * Math.random() + 5.0;
        double pesoRandom = (3 - 0.5) * Math.random() + 0.5;
        
        Costume costume2 = new Costume(name, Costume.VAMPIRE, "M", pesoRandom, precioRandom, dia, mes, anio);
        
        System.out.println(costume2.toString());
        
        System.out.println("Is costume2 light? " + costume2.isLightWeight());
        System.out.println("Is costume2 released before costume1? " + costume2.isReleasedBefore(costume1));
    }
}