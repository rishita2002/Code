#one dimensional array
row1=2
col1=3
l=[]
for i in range (row1):
    m=[]
    for j in range(col1):
        inp=input()
        m.append(int(inp))
    l.append(m)
row2=2
col2=3
a=[]
for i in range(row2):
    b=[]
    for j in range(col2):
        inp=input()
        b.append(int(inp))
    a.append(b)
sum=[[0,0,0],[0,0,0]]
for i in range(len(l)):
    for j in range(len(l[0])):
        sum[i][j]=l[i][j]+a[i][j]
print(sum)