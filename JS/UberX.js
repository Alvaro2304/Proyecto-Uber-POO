class UberX extends car{
    constructor(license,driver,brand,model){
        super(license,driver)
        this.brand=brand
        this.model=model
    }

    printDataCar(){
        console.log(this.license)
        console.log(this.driver)
        console.log(this.brand)
        console.log(this.model)
    }
}