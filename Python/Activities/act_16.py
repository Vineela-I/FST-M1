class Car:
    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer+" "+self.model+" "+"started moving")

    def stop(self):
        print(self.manufacturer+" "+self.model+" "+"stopped moving")
    
car1 = Car("Maruthi","Swift","2019","Manual","White")
car2 = Car("Santro","Sports","2020","Automatic","Red")

car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()