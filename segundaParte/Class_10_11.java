package segundaParte;
import java.util.Scanner;
import java.util.Locale;

public class Class_10_11 {
    public static void main (String arg[]){
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        String frutas[] = {"manzana", "banana", "peras"};
        
        frutas[0] = "cereza";
        
        for (String fruta : frutas){
            System.out.println(fruta);
        }
        
        System.out.println("Escribi una palabra: ");
        String cadenaUno = teclado.nextLine();
        cadenaUno = cadenaUno.trim();
        System.out.println("Escribi otra palabra: ");
        String cadenaDos = teclado.nextLine();
        cadenaDos = cadenaDos.trim();

        boolean correcto = true;
        
        if(cadenaUno.length() == cadenaDos.length()){
            for(int i = 0; i < cadenaUno.length(); i++){
                if(cadenaUno.charAt(i) != cadenaDos.charAt(cadenaUno.length() - 1 - i)){
                    correcto = false;
                    break;
                }
            }
        }else{
            correcto = false;
        }
        
        System.out.println("La cadena es la inversa de la otra? " + correcto);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
               System.out.print("@");
            }
           System.out.println();
        }
    }
}