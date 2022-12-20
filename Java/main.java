package Java;
class main{
    public static void main(String[] args) {
        Driver driver=new Driver("Alvaro Palero", "77284493","alvaroTheGonpin@gmail.com","gordo3000");
        UberX car =new UberX("AMQ123",driver,"Suzuki","vocho");
        driver.printDataDriver();
        car.setPassenger(3);
        //car.passenger=4;
        car.printData();
        //System.out.println("Car license: " + car.license);
        System.out.println("\n------------------\n");
        UberVan uberVan=new UberVan("WER432",driver);
        uberVan.setPassenger(5);
        uberVan.printData();
    }
}