import statistics
a=list()
n=int(input())
for x in range (0,n):
    z=int(input())
    a.append(z)
print(statistics.median(a))