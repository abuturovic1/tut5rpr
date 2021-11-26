package ba.unsa.etf.rpr;
import java.util.ArrayList;
public class Semestar {
    private ArrayList<Predmet>predmeti;
    private int ukupnoECTS;
    public ArrayList<Predmet>getPredmeti(){
        return predmeti;
    }
    public void setPredmeti(ArrayList<Predmet>predmeti)
    {
        this.predmeti=predmeti;
    }
    public int getUkupnoECTS(){
        return ukupnoECTS;
    }
    public void setUkupnoECTS(int ukupnoECTS){
        this.ukupnoECTS=ukupnoECTS;
    }
    public Semestar(ArrayList<Predmet>predmeti,int ukupnoECTS){
        this.predmeti=predmeti;
        this.ukupnoECTS=ukupnoECTS;
    }

}
