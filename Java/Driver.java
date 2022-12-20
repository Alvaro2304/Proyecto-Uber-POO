package Java;

class Driver extends account{
    public Driver(String name,String document,String email,String password){
        super(name,document,email,password);
    }
    void printDataDriver(){
        System.out.println("Hola "+name+",bienvenido de vuelta!\nNumero de documento: "+document);
    }
}
