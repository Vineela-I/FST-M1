tuples = tuple(input("Enter the values into the tuple: ").split(', '))
for tupl in tuples:
    num = int(tupl)
    if(num % 5 == 0):
        print(num)
    