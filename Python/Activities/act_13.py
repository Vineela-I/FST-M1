elements = list(input("Enter the list of elements: ").split(', '))
def sum(elements):
    num = 0
    for element in elements:
        num+= int(element)
    return num
res = sum(elements)
print(res)