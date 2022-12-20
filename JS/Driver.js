class Driver extends account{
    constructor(name,document,email,password){
        super(name,document,email,password)
    }
    printDataDriver(){
        console.log(this.name)
        console.log(this.document)
        console.log(this.email)
        console.log(this.password)
    }
}