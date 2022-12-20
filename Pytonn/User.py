from account import account
class User(account):
    def __init__(self, name, document, email, password):
        super().__init__(name, document, email, password)

    def printDataUser():
        print("Hola "+account.name+",bienvenido de vuelta!\nNumero de documento: "+account.document)