package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class PlanStudija {
    private ArrayList<Predmet>obavezan;
    private ArrayList<Predmet>izboran;
    public ArrayList<Predmet>getObavezanPredmet(){
        return obavezan;
    }
    public ArrayList<Predmet>getIzboranPredmet(){
        return izboran;
    }
    public void setObavezanPredmet(ArrayList<Predmet>obavezan){
        this.obavezan=obavezan;
    }
    public void setIzboranPredmet(ArrayList<Predmet>izboran){
        this.izboran=izboran;
    }
    public PlanStudija(ArrayList<Predmet>obavezan,ArrayList<Predmet>izboran){
        this.obavezan=obavezan;
        this.izboran=izboran;
    }


}
