package segundaParte;
import java.util.Scanner;
import java.util.Locale;

public class Test {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        boolean detener = false;
        boolean gano = false;
        String msg;
        
        do{
            System.out.println("Elige una opción");
            String op = teclado.nextLine();
            switch(op.toUpperCase()){
                case "UNO":
                    System.out.println("Hola mundo!");
                break;
                case "RANDOM":
                    System.out.println("Elige una dificultad: (facil - media - dificil - supremo)");
                    String opJuego = teclado.nextLine();
                    
                    switch(opJuego.toUpperCase()){
                        case "FACIL":
                            System.out.println("Tienes 5 intentos para adivinar el numero que esta entre 0 y 10");
                            int numRandom = (int) (Math.random() * (11));
                            for(int i = 0; i <= 4; i++){
                                System.out.print("Intento 1: ");
                                int valor = teclado.nextInt();
                                if(valor == numRandom){
                                    gano = true;
                                    break;
                                }else{
                                    if(i != 4){
                                        String pista = (numRandom > valor) ? "grande" : "pequeño";
                                        System.out.println("Incorrecto. Pista: el número es más " + pista);
                                    }
                                }
                            }
                            msg = (gano) ? "Ganasteeeeee" : "PERDISTEEEEEEEEEEEE el número era " + numRandom;
                            System.out.println(msg);
                            gano = false;
                            break;
                        case "MEDIA":
                            System.out.println("Tienes 5 intentos para adivinar el numero que esta entre 0 y 50");
                            int numRandomD = (int) (Math.random() * (51));
                            for(int i = 0; i <= 4; i++){
                                System.out.print("Intento 1: ");
                                int valor = teclado.nextInt();
                                if(valor == numRandomD){
                                    gano = true;
                                    break;
                                }else{
                                    if(i != 4){
                                        String pista = (numRandomD > valor) ? "grande" : "pequeño";
                                        System.out.println("Incorrecto. Pista: el número es más " + pista);
                                    }
                                }
                            }
                            msg = (gano) ? "Ganasteeeeee" : "PERDISTEEEEEEEEEEEE el número era "  + numRandomD;
                            System.out.println(msg);
                            gano = false;
                            break;
                        case "DIFICIL":
                            System.out.println("Tienes 5 intentos para adivinar el numero que esta entre 0 y 100");
                            int numRandomT = (int) (Math.random() * (101));
                            for(int i = 0; i <= 4; i++){
                                System.out.print("Intento 1: ");
                                int valor = teclado.nextInt();
                                if(valor == numRandomT){
                                    gano = true;
                                    break;
                                }else{
                                    if(i != 4){
                                        String pista = (numRandomT > valor) ? "grande" : "pequeño";
                                        System.out.println("Incorrecto. Pista: el número es más " + pista);
                                    }
                                }
                            }
                            msg = (gano) ? "Ganasteeeeee" : "PERDISTEEEEEEEEEEEE el número era " + numRandomT;
                            System.out.println(msg);
                            gano = false;
                            break;
                        case "SUPREMO":
                            System.out.println("Tienes 5 intentos para adivinar el numero que esta entre 0 y 150");
                            int numRandomC = (int) (Math.random() * (151));
                            for(int i = 0; i <= 4; i++){
                                System.out.print("Intento 1: ");
                                int valor = teclado.nextInt();
                                if(valor == numRandomC){
                                    gano = true;
                                    break;
                                }else{
                                    String pista = (numRandomC > valor) ? "grande" : "pequeño";
                                    if(i != 4){
                                        System.out.println("Incorrecto. Pista: el número es más " + pista);
                                    }
                                }
                            }
                            msg = (gano) ? "Ganasteeeeee" : "PERDISTEEEEEEEEEEEE el número era " + numRandomC;
                            System.out.println(msg);
                            gano = false;
                            break;
                        default:
                            System.out.println("Esa opción no existe");
                    }
                    
                    teclado.nextLine();
                break;
                case "SALIR":
                    detener = true;
                    break;
                default:
                    System.out.println("Esa opción no existe");
        }}while(!detener);
    }
}