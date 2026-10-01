package tema1;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Programa { //empieza la clase
    //puerta de entrada principal
    public static void main(String[] args){
        System.out.flush();
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        boolean error = false;
        
        System.out.println("Hola estrellita! El mundo te dice HOLA"); //usamos la clase System
        
        do{
            System.out.println("Elegí una opción:\n1.Introducir datos\n2.Nota parcial");
            try{
                op = teclado.nextInt();
                teclado.nextLine();
                error = false;
            }catch(Exception e){
                System.out.println("Error escribiste una opción lo valida " + e);
                teclado.nextLine();
                error = true;
            }
        }while(error);
        
        switch(op){
            case 1:
                System.out.println("Cual es tu nombre?");
                String name = teclado.nextLine();
                System.out.printf("El nombre del usuario es '%s'.\n", name);
                
                int edad = -1;
                do{
                    System.out.println("Ingrese tu edad:");
                    try{
                        edad = teclado.nextInt(); 
                        teclado.nextLine();
                        error = false;
                    }catch(Exception e){
                        System.out.println("Error! Edad no valida: " + e);
                        teclado.nextLine();
                        error = true;
                    }
                }while(error);
                
                if(edad >= 0 && edad <= 100){
                    if(edad <= 3){
                        System.out.println("La edad " + edad + " correpsonde a Infante");
                    }
                    else if(edad <= 12){
                        System.out.println("La edad " + edad + " correpsonde a Niño");
                    }
                    else if(edad <= 18){
                        System.out.println("La edad " + edad + " correpsonde a Adolecente");
                    }
                    else{
                        System.out.println("La edad " + edad + " correpsonde a adulto");
                    }    
                }else{
                    System.out.println("Es imposible tener la edad que dice");
                }
                break;
            case 2:
                double practicas = -1;
                double teoria = -1;
                do{
                    System.out.println("Ingrese su nota obtenida en practicas:");
                    try{
                        practicas = teclado.nextDouble(); 
                        teclado.nextLine();
                        error = false;
                    }catch(Exception e){
                        System.out.println("Error! Nota no valida: " + e);
                        teclado.nextLine();
                        error = true;
                    }
                }while(error);
                
                do{
                    System.out.println("Ingrese su nota obtenida en teoria:");
                    try{
                        teoria = teclado.nextDouble(); 
                        teclado.nextLine();
                        error = false;
                    }catch(Exception e){
                        System.out.println("Error! Nota no valida: " + e);
                        teclado.nextLine();
                        error = true;
                    }
                }while(error);
                
                double nota = practicas * 0.25 + teoria * 0.75;
                
                System.out.println("Nota: " + nota);
            break;
            default:
                if(!error){
                    System.out.println("Esa opción no existe chaval");   
                }  
        }
    }
}