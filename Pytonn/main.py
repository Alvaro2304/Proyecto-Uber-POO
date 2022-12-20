from car import car
from account import account
from Driver import Driver

if __name__=="__main__":
    print("Hola mundo")
    Conductor=Driver("Juan Gonzales","12345674","JuanTheChucha@outlook.com","bubba123")
    Car=car("ASA153",Conductor)
    print(vars(Car))
    print(vars(Car.driver))
    Conductor.printDataUser()