package Java;

 class UberX extends car{
    String brand;
    String model;

    public UberX(String license,account driver,String brand, String model){
        super(license,driver);
        this.brand=brand;
        this.model=model;
        
    }

    @Override
    void printData() {
        // TODO Auto-generated method stub
        super.printData();
        System.out.println("\nBrand: "+brand+"Model: "+model);
    }

}
