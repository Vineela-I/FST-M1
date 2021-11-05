fruitshop = dict(apple="100",orange="50",banana="40")
fruit = input("Enter the fruit you want: ")
if fruit in fruitshop:
        print(fruit+" is present in fruitshop")
else:
        print(fruit+" is not present in fruitshop")