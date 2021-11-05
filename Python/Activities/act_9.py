list1 = [10,20,40,50,35]
list2 = [22,31,34,34,56]

list3 = []
for num in list1:
    if(num % 2 != 0):
        list3.append(num)

for num in list2:
    if(num % 2 == 0):
        list3.append(num)

print("Values in List3: ",list3)