a=list()
n=int(input())
for x in range(0,n):
    b=int(input())
    a.append(b)
for x in range(len(a)):
    print(a[x])
    print(a.index(a[x]))
