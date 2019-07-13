n1=int(input())
n2=int(input())
for x in range (n1,n2+1):
    y = x
    sum = 0

    while (y>0):
        n=y%10
        sum=sum+n**3
        y=y//10
    if sum==x:
        print(x)




