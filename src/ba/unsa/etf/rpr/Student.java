package ba.unsa.etf.rpr;

public class Student {
    private String imeStudenta;
    private String prezimeStudenta;
    private int brIndexa;
public Student(String imeStudenta,String prezimeStudenta,int brIndexa){
    this.imeStudenta=imeStudenta;
    this.brIndexa=brIndexa;
}
public void setImeStudenta(String imeStudenta){
    this.imeStudenta=imeStudenta;
}
public String getImeStudenta(){
    return imeStudenta;
}
public int getBrIndexa(){
    return brIndexa;
}
public void setBrIndexa(int brIndexa){
    this.brIndexa=brIndexa;
}

}
