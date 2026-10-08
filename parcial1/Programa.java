package parcial1;


/**
 * Write a description of class Programa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Programa {
    public static void main(String[] args){
        Runner r1 = new Runner("Camila", 29, 06, 2006, "Argentina", 156, 5);
        Runner r2 = new Runner();
        
        System.out.println(r1.getBib());
        System.out.println(r2.getBib());
    }
}