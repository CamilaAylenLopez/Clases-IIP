package tema2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Tienda { //clase tipo programa xq tiene main
    
    //METODOS
    //CONSTRUCTOR pribado
    private Tienda(){} // por proteccion, que nadie se cree un objeto tienda
    
    public static void main(String[] args){
        Scanner tecladoReal = new Scanner(System.in);
        String nombreProducto;
        
        Producto mesita = new Producto("mesa de madera", 10.5, 10);
        Producto silla = new Producto("silla", 3, 100);
        Producto florero = new Producto("florero", 15, 5);
        Producto teclado = new Producto("teclado", 100, 1000);
        
        List<Producto> productos = new ArrayList<>();
        productos.add(mesita);
        productos.add(silla);
        productos.add(florero);
        productos.add(teclado);
        
        System.out.println("Cantidad de mesas: " + mesita.getStock());
        mesita.registrarVenta(1);
        System.out.println("Se ha vendido una mesa");
        System.out.println("Nombre de producto" + mesita.getNombre());
        System.out.println("Cantidad de mesas: " + mesita.getStock());
        
        System.out.println("Cantidad de teclados: " + teclado.getStock());
        teclado.registrarVenta(2);
        System.out.println("Se ha vendido dos teclado");
        System.out.println("Nombre de producto" + teclado.getNombre());
        System.out.println("Cantidad de teclados: " + teclado.getStock());
        
        System.out.println("Opciones: \n 1. consultar stock (CS) \n 2. modificar stock (MS)");
        String opcion = tecladoReal.next();;
        switch(opcion){
            case "CS":
                System.out.println("Consultar stock de producto...");
                try{
                    nombreProducto = tecladoReal.next();
                    boolean seEncontro = false;
                    for (Producto product : productos){
                        String name = product.getNombre();
                        if(name.equals(nombreProducto)){
                            System.out.println("Se ha encontrado");
                            System.out.println("El stock disponible de "+ name + " es " + product.getStock());
                            seEncontro = true;
                        }
                    }
                    if(!seEncontro){
                        System.out.println("No se encontro");
                    }
                }catch(Exception e){
                    System.out.println("Escribiste cualquier cosa. Chau.");
                }
                break;
            
            case "MS":
                System.out.println("Cambiar stock de producto...");
                try{
                    nombreProducto = tecladoReal.next();
                    System.out.println("Cuantas unidades se vendieron?");
                    //int cantidad = tecladoReal.next();
                    boolean seEncontro = false;
                    for (Producto product : productos){
                        String name = product.getNombre();
                        if(name.equals(nombreProducto)){
                            System.out.println("Se ha encontrado");
                            System.out.println("El stock disponible de "+ name + " es " + product.getStock());
                            seEncontro = true;
                        }
                    }
                    if(!seEncontro){
                        System.out.println("No se encontro");
                    }else{
                        
                    }
                    
                }catch(Exception e){
                    System.out.println("Escribiste cualquier cosa. Chau.");
                }

                break;
                
            default:
                System.out.println("No es valido");
        }
        
    }
}