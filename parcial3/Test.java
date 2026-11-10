package parcial3;
import java.util.Scanner;
import java.util.Locale;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test {
    public static void main(String[] args){
        Sticker st1 = new Sticker();
        System.out.println(st1.toString());
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nombre");
        String nombre = teclado.nextLine();
        System.out.println("Día");
        int dia = teclado.nextInt();
        System.out.println("Mes");
        int mes = teclado.nextInt();
        System.out.println("Año");
        int anio = teclado.nextInt();
        
        int alturaRandom = (int)((175 - 160 + 1) * Math.random() + 160);
        double pesoRandom = ((70 - 45) * Math.random() + 45);
        
        for(int i = 0; i <= 10; i++){
            int alturaRandomD = (int)((175 - 160 + 1) * Math.random() + 160);
            double pesoRandomD = ((70 - 45) * Math.random() + 45);
            System.out.println(alturaRandomD + " | " + pesoRandomD);
        }
        
        Sticker st2 = new Sticker(nombre, "Real Madrid C.F.", Sticker.DEFENDER, alturaRandom, pesoRandom, dia, mes, anio);
        
        System.out.println("Is her IMC within normal values? " + st2.isIMCNormal());
        System.out.println("Is she younger than Olga? " + st2.isYounger(st1));
        
        //Polygon with points: (0.0, 1.0) (2.0, -2.0) (6.0, 3.0) (3.0, -1.0)
        //Polygon with points: (1.0, 0.0) (2.0, -2.0) (3.0, 6.0) (3.0, -1.0)
    }
}