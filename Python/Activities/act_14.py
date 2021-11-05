def fibbonoci(num):
    if num<=1:
        return num
    else:
        return (fibbonoci(num-1)+fibbonoci(num-2))

number = int(input("How many fibonacci numbers you want: "))
if number<=0:
    print("please enter a positive number")
else:
    print ("Fibbonocci sequence: ")
    for i in range (number):
        print(fibbonoci(i))
    
    
