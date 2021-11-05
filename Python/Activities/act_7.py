lists = list(input("Please enter the values into the list: ").split(','))
sum = 0
for list in lists:
    sum+= int(list)
print(sum)