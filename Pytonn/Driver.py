from account import account
class Driver(account):
    def __init__(self, name, document, email, password):
        super().__init__(name, document, email, password)

    def printDataUser(self):
        print("Hola "+self.name+",bienvenido de vuelta!\nNumero de documento: "+self.document)