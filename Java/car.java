package Java;

public class car {
    Integer id;
    String license;
    account driver;
    Integer passenger;

    public car(String license, account driver){
        this.license=license;
        this.driver=driver;
    }

    void printData(){
        System.out.println("License: "+ license + "\nDriver: "+ driver.name+"\nPassengers: "+passenger);
    }

}
