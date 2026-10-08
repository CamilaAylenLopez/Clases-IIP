package tema1;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Date;

public class Programa { //empieza la clase
    //puerta de entrada principal
    public static void main(String[] args){
        System.out.flush();
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        boolean error = false;
        
        System.out.println("Hola estrellita! El mundo te dice HOLA"); //usamos la clase System
        
        do{
            System.out.println("Elegí una opción:\n1.Introducir datos\n2.Nota parcial\n3.Subir datos de un alumno\n4.Número random\n5.Redondear número");
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
                //practica pedir datos
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
            case 3:
                //practica objetos
                int i = 0;
                //do{
                    String alumnoUno;
                    String fechaNacimientoD;
                    int curso;
                    double notaD;
                    
                    System.out.println("Nombre del alumno");
                    alumnoUno = teclado.nextLine();
                    
                    System.out.println("Fecha de nacimiento del alumno día:");
                    int dia = teclado.nextInt();
                    System.out.println("Fecha de nacimiento del alumno mes:");
                    int mes = teclado.nextInt();
                    System.out.println("Fecha de nacimiento del alumno año:");
                    int anio = teclado.nextInt();
                    Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
                    
                    System.out.println("Curso del alumno");
                    curso = teclado.nextInt();
                    
                    System.out.println("Nota del alumno");
                    notaD = teclado.nextDouble();
                    
                    Alumno alumno = new Alumno(alumnoUno, fechaNacimiento, curso, notaD);
                    
                    System.out.println("Alumno: " + alumno.getNombre() + "\nFecha de nacimiento: " + alumno.getFacheNacimiento() + "\nCurso: " + alumno.getCurso() + "\nNota: " + alumno.getNota());
                    i++;
               // }while(i == 10);
            break;
            case 4:
                //practica número random
                System.out.println("Cual es el menor valor que puede tomar el número random?");
                try{
                    int numInferior = teclado.nextInt();
                    System.out.println("Cual es el mayor valor que puede tomar el número random?");
                    int numSuperior = teclado.nextInt();
                    if(numSuperior <= numInferior){
                        System.out.println("Error! El número superior es inferior o igual al superior.");
                    }
                    for(int j = 0; j< 10; j++){
                        double random = Math.random();
                        int numEl = numSuperior - numInferior + 1;
                        random = random * numEl;
                        random = random + numInferior;
                        System.out.println("Tu número random es " + (int) random);
                    }
                }catch(Exception e){
                    System.out.println("Error número no valido");
                }
                
            break;
            case 5:
                //practica redondear número
                System.out.println("Escribi el número que hay que redondear");
                try{
                    double num = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.printf("Escribe a la cantidad de decimales a las que se quiere redondear '%s' ", num);
                    System.out.println();
                    int decimal = teclado.nextInt();
                    
                    //proceso para redondear un número
                    //1. se le corren las comas a la derecha según la cantidad que haya elegido el usuario
                    num = num * Math.pow(10, decimal);
                    //2. lo redondeamos
                    num = Math.round(num);
                    //3. le volvemos a correr la coma a su posición inicial
                    num = num / Math.pow(10, decimal);
                    //YA ESTAA
                    System.out.printf("El número redondeado a %s decimal queda %s", decimal, num);
                }catch(Exception e){
                    System.out.println("Número no valido");
                }
            break;
            default:
                if(!error){
                    System.out.println("Esa opción no existe chaval");   
                }  
        }
    }
}