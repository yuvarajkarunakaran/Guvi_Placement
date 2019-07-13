h1=int(input())
m1=int(input())
h2=int(input())
m2=int(input())
if h1>12 or h2>12 or m1>60 or m2>60:
    print('invalid')
else:
    if h1 >= h2 and m1 >= m2:
        print(h1 - h2, end=' ')
        print(m1 - m2)
    elif h1 > 0 and m2 > m1:
        m1 += 60
        h1 -= 1
        print(h1 - h2, end=' ')
        print(m1 - m2)




