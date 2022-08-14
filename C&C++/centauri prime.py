T=int(input())
for i in range(1,T+1):
    a=input()
    K=[]
    for j in a:
        K.append(j)
    if K[-1] in "AEIOUaeiou":
        print ("Case #{}: {} is ruled by Alice".format(i,a))
    elif K[-1]=="y":
        print ("Case #{}: {} is ruled by nobody.".format(i,a))
    else:
        print ("Case #{}: {} is ruled by Bob.".format(i,a))