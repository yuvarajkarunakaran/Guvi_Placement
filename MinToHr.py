n=int(input())
hr=0
min=0
if n<60:
    print(hr,end='')
    print(min+n)
else:
    a=n//60
    print(a,end='')
    b=n%60
    print(b,end='')
