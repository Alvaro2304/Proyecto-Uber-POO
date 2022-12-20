package Java;
class main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        Driver driver=new Driver("Alvaro Palero", "77284493","alvaroTheGonpin@gmail.com","gordo3000");
        UberX car =new UberX("AMQ123",driver,"Suzuki","vocho");
        car.passenger=4;
        //car.passenger=4;
        car.printData();
        //System.out.println("Car license: " + car.license);
        
        driver.printDataDriver();
    }
}