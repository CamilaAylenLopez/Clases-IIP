package parcial_2018;


/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test {
    public static void main (String[] args){
        TimeInstant t = new TimeInstant();
        SaveGame sg = new SaveGame("SCES", 50760, 1, t);
        
        String s1 = sg.toHHMM(), s2 = t.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}