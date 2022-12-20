package Java;

public class car {
    private Integer id;
    private String license;
    private account driver;
    protected Integer passenger;

    public car(String license, account driver){
        this.license=license;
        this.driver=driver;
    }

    void printData(){
        if(passenger != null){
            System.out.println("License: "+ license + "\nDriver: "+ driver.name+"\nPassengers: "+passenger);
        }
    }


    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if (passenger<=4){
            this.passenger=passenger;
        }
        else{
            System.out.println("Puedes embarcar un máximo de 4 pasajeros");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public account getDriver() {
        return driver;
    }

    public void setDriver(account driver) {
        this.driver = driver;
    }

    
}
