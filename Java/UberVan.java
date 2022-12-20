package Java;
import java.util.Map;
import java.util.ArrayList;

class UberVan extends car{
    Map<String,Map<String,Integer>>typeCarAccepted;
    ArrayList<String> seatsMaterial;

    // public UberVan(String license,account driver,Map<String,Map<String,Integer>>typeCarAccepted,
    // ArrayList<String> seatsMaterial){
    //     super(license, driver);
    //     this.typeCarAccepted=typeCarAccepted;
    //     this.seatsMaterial=seatsMaterial;
    // }
    
    public UberVan(String license, account driver){
        super(license, driver);

    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger<=6){
            this.passenger=passenger;
        }
        else{
            System.out.println("Puedes embarcar un máximo de 6 pasajeros");
        }
    }

}
