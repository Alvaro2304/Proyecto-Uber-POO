package Java;
import java.util.Map;
import java.util.ArrayList;

class UberVan extends car{
    Map<String,Map<String,Integer>>typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license,account driver,Map<String,Map<String,Integer>>typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted=typeCarAccepted;
        this.seatsMaterial=seatsMaterial;
    }
    
}
