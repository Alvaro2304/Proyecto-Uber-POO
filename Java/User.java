package Java;

class User extends account{
    public User(String name, String document,String email,String password){
        super(name, document,email,password);
    }

    void printDataUser(){
        System.out.println("Hola "+name+",bienvenido de vuelta!\nNumero de documento: "+document);
    }
}
