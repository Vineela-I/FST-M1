lists = list(input("Please enter the values into the list: "))
for list in lists:
    print(list)
if (lists[0]==lists[-1]):
   print(True)
else:
   print(False)