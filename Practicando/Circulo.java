package Practicando;


/**
 * Write a description of class Circulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circulo {
    private static double pi = Math.PI;
    private double radio;
    private double area;
    
    public Circulo(double radio){
        this.radio = radio;
        area = area();
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double getArea(){
        return area;
    }
    
    public double area(){
        return pi * Math.pow(radio, 2);
    }
    
    public double redondearArea(int decimales){
        return Math.round((Math.pow(10, decimales) * area)) / Math.pow(10, decimales);
    }
}