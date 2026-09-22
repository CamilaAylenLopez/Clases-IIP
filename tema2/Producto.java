package tema2;

public class Producto{ //clase tipo de datos
    //ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;
    
    //METODOS
    //constructor
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void registrarVenta(int unidades){
        if(unidades <= stock){
            stock = stock - unidades;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String newName){
        nombre = newName;
    }
    
    public int getStock(){
        return stock;
    }
}