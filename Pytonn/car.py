class car:
    id          =int
    license     =str
    driver      =str
    passenger   =int
    def __init__(self,license,driver):
        self.license=license
        self.driver=driver