n=int(input())
hr=0
min=0
if n<60:
    print(hr)
    print(min+n)
else:
    a=n//60
    print(a)
    b=n%60
    print(b)