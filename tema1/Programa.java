package tema1;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Write a description of class Programa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Programa { //empieza la clase
    //puerta de entrada principal
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int edad = 0;
        
        System.out.println("Hola mundo!"); //usamos la clase System
        String name = JOptionPane.showInputDialog("Cual es tu nombre?");
        System.out.printf("El nombre del usuario es '%s'.\n", name);
        
        System.out.println("Ingrese un valor entero:");
        //edad = teclado.nextInt(); NO FUNCIONOOOOOOOO :((((( pipipi
        
        if(edad == 0){
            edad = 16;
        }
        
        System.out.println("Edad " + edad);
        
        double practicas = 8.0;
        double teoria = 6.0;
        double nota = practicas * 0.25 + teoria * 0.75;
        
        System.out.println("Nota: " + nota);
    }
}