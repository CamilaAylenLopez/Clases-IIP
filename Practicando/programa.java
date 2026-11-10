package Practicando;
import java.util.Scanner;


/**
 * Write a description of class programa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class programa {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola mundo!");
        boolean seguir = true;
        
        do{
            System.out.println("Cual ejercicio quieres ver?\n1.Salir\n2.Casting\n3.Clase Math\n4.Clase circulo\n5.Número random\n6.Dime tus datos\n7.Clase String\n8.Clase alumno");
            int op = teclado.nextInt();
        
            switch(op){
                case 1:
                    seguir = false;
                    break;
                case 2:
                    //casting
                    int a = 6;
                    double b = a;
                    System.out.println(a);
                    System.out.println(b);
                    b = 10;
                    a = (int) b;
                    System.out.println(a);
                    System.out.println(b);
                    break;
                case 3:
                    //Clase Math
                    int c = 10, d = 2;
                    int cdp = (int) Math.pow(c, d);
                    double cds = Math.sqrt(c);
                    int cdm = Math.max(c, d);
                    System.out.println("10 elevado 2: " + cdp);
                    System.out.println("Raiz cuadrada de 10: " + cds);
                    System.out.println("El número más grande entre 10 y 2 es " + cdm);
                    
                    double area = Math.PI * Math.pow(c, 2);
                    double areaRedondeada = Math.round(area * Math.pow(10, 3)) / Math.pow(10,3);
                    
                    System.out.println("Area circulo de radio 10 " + area);
                    System.out.println("Area redondeada " + areaRedondeada);
                    break;
                case 4:
                    //clase circulo
                    Circulo c1 = new Circulo(10);
                    
                    System.out.println("Area circulo de radio 10 " + c1.getArea());
                    System.out.println("Area redondeada circulo de radio 10 " + c1.redondearArea(3));
                    break;
                case 5:
                    //numero random
                    System.out.println("Numero minimo");
                    int min = teclado.nextInt();
                    System.out.println("Numero maximo");
                    int max = teclado.nextInt();
                    
                    for(int i = 0; i <= 9; i++){
                        int numeroAl = (int) (Math.random() * (max - min + 1) + min);
                        System.out.println(numeroAl);
                    }
                    break;
                case 6:
                    //pedir datos
                    teclado.nextLine();
                    System.out.println("Nombre");
                    String nombre = teclado.nextLine();
                    System.out.println("Apellido");
                    String apellido = teclado.nextLine();
                    System.out.println("Edad");
                    int edad = teclado.nextInt();
                    System.out.println("Curso");
                    int curso = teclado.nextInt();
                    System.out.printf("Nombre: %s \nApellido: %s \nEdad: %s \nCurso: %s \n", nombre, apellido, edad, curso);
                    break;
                case 7:
                    //clase string
                    String cadena = "Hola";
                    String cadenaD = cadena;
                    String cadenaT = "Hola";
                    String cadenaC = new String("Hola");
                    
                    //comparar cadenas
                    System.out.println("Las cadenas son iguales? " + (cadena == cadenaD)); //true
                    System.out.println("Las cadenas son iguales? " + (cadena == cadenaT));//true
                    System.out.println("Las cadenas son iguales? " + (cadena == cadenaC));//false
                    System.out.println("Las cadenas son iguales? " + cadena.equals(cadenaC));//true
                    
                    System.out.println("Cuantos caracteres tiene \"Hola\" " + cadena.length());//4
                    System.out.println("Posición que letra esta en la pos 2 en \"Hola\" " + cadena.charAt(2));//l (la primera pos es 0)
                    System.out.println(cadena.substring(1,2)); //ol
                    System.out.println(cadena.toUpperCase()); //HOLA
                    System.out.println(cadena.toLowerCase()); //hola
                    System.out.println(cadena.contains("ol")); //true
                    
                    String cadenaQ = "HOLA       ";
                    cadenaQ = cadenaQ.trim();
                    System.out.println("Última letra " + cadena.charAt(cadena.length() - 1)); //a
                    //System.out.println("Última letra " + cadena.charAt(cadena.length())); //error
                    break;
                case 8:
                    //clase alumno
                    Alumno a1 = new Alumno("Camila", "Lopez", 29, 06, 2006, 1, 10);
                    Alumno a2 = new Alumno("Camila", "Lopez", 29, 06, 2006, 1, 10);
                    Alumno a3 = new Alumno("Juan", "Lopez", 16, 9, 2004, 2, 10);
                    System.out.println(a1.toString());
                    System.out.println("Cantidad de alumnos " + Alumno.cantAlumnos());
                    System.out.println(a3.equals(a2));//false
                    System.out.println(a1.equals(a2));//true
                    break;
                case 9:
                    String wiwi = "012";
                    System.out.println(wiwi.substring(2));
                    System.out.println("aca " + wiwi.substring(wiwi.length() -2));
                    System.out.println(wiwi.length());
                break;
                default:
                    System.out.println("No existe esa opción");
                    
            }
            teclado.nextLine();
        }while(seguir);
    }
}