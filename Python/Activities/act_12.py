n = int(input("Enter a number: "))
def mysum(n):
    if n<=0:
        return n
    else:
        return n+mysum(n-1)
res = mysum(n)
print(res)