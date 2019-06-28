n=int(input())
temp=n
ans=0
while(temp>0):
    dig=temp%10
    ans=ans+dig**3
    temp=temp//10
if n==ans:
    print('yes')
else:
    print('no')

