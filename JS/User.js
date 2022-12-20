class User extends account{
    constructor(name,document,email,password){
        super(name,document,email,password)
    }
    printDataUser(){
        console.log(this.name)
        console.log(this.document)
        console.log(this.email)
        console.log(this.password)
    }
}