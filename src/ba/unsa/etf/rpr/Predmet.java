package ba.unsa.etf.rpr;

public class Predmet {
    private String nazivPredmeta;
    private int ECTS;
    private int brUpisanih;
public String getNazivPredmeta(){
    return nazivPredmeta;
}
public void setNazivPredmeta(String nazivPredmeta){
    this.nazivPredmeta=nazivPredmeta;
}
public void setBrECTS(int ECTS){
    this.ECTS=ECTS;

}
public int getBrECTS(){
    return ECTS;
}
public int getBrUpisanihSt(){
    return brUpisanih;
}
public void setBrUpisanihSt(){
    this.brUpisanih=brUpisanih;

}
    public Predmet(String nazivPredmeta, int ECTS, int brUpisanih) {
        this.nazivPredmeta=nazivPredmeta;
        this.ECTS=ECTS;
        this.brUpisanih=brUpisanih;


    }
}
