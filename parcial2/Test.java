package parcial2;
import java.util.Locale;
import java.util.Scanner;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test {
    public static void main(String args[]){
        Costume costume1 = new Costume();
        System.out.println(costume1.toString());
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Nombre");
        String nombre = teclado.nextLine();
        System.out.println("Día");
        int dia = teclado.nextInt();
        System.out.println("Mes");
        int mes = teclado.nextInt();
        System.out.println("Año");
        int anio = teclado.nextInt();
        
        
        for(int i = 0; i <= 50; i++){
            double precio = (36.0 - 5.0) * Math.random() + 5.0;
            double peso =  (3.0 - 0.5) * Math.random() + 0.5;
            System.out.println(precio + " " + peso);
        }
        
        double precio = (36.0 - 5.0) * Math.random() + 5.0;
        double peso =  (3.0 - 0.5) * Math.random() + 0.5;
        
        Costume costume2 = new Costume(nombre, Costume.VAMPIRE, "M", peso, precio, dia, mes, anio);
        System.out.println(costume2.toString());
        
        System.out.println("Is costume2 light? " + costume2.isLightWeight());
        System.out.println("Is costume2 released before costume1? " + costume2.isReleasedBefore(costume1));
        
        //Initially: x = 4.0, y = -1.0, p = (4.0, -1.0)
        //After invoking oneMethod: x = 4.0, y = -1.0, p = (3.0, -1.0)
        //After invoking otherMethod: x = -1.0, y = 3.0, p = (-1.0, 2.0)
    }
}