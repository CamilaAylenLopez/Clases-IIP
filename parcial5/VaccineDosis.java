package parcial5;


/**
 * Write a description of class VaccineDosis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VaccineDosis {
    public static final int JANSSEN = 1, ASTRAZENECA = 2, PFIZER = 3;
    private int type;
    private double dosis;
    private TimeInstant prepTime;
    private String sip;
    
    public VaccineDosis(int type, double dosis, int hh, int mm, String sip){
        this.type = type;
        this.dosis = dosis;
        this.prepTime = new TimeInstant(hh, mm);
        this.sip = sip;
    }
    
    public VaccineDosis(){
        type = ASTRAZENECA;
        dosis = 0.5;
        prepTime = new TimeInstant();
        sip = "";
    }
    
    @Override
    public boolean equals(Object o){
        return o instanceof VaccineDosis v
            && this.type == v.type
            && this.dosis == v.dosis
            && this.prepTime.equals(v.prepTime);
    }
    
    public int compareTo(VaccineDosis other){
        int dif = this.type - other.type;
        if(dif == 0){
            if(this.dosis > other.dosis){
                dif = 1;
            }
            else if(this.dosis < other.dosis){
                dif = -1;
            }
        }
        return dif;
    }
    
    @Override
    public String toString(){
        String tipo;
        if(type == 1){
            tipo = "JANSSEN";
        }else if(type == 2){
            tipo = "ASTRAZENECA";
        }
        else{
            tipo = "PFIZER";
        }
        
        double dosisRedondeado = Math.round(dosis * 10) / 10.0;
        String alguien = "";
        if(sip != ""){
            alguien = " injected to SIP = " + sip;
        }
        return "Vaccine: " + tipo + " " + dosisRedondeado + " ml. prepared at" + prepTime.toString() + alguien;
    }
}