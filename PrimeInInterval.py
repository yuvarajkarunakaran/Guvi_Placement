n1=int(input())
n2=int(input())
for x in range(n1,n2+1):
    for i in range(2,x):
        if x%2==0:
            break
    else:
        print(x)
            
