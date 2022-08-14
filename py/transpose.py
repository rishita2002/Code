def transpose(mat):
    row=int(input())
    column=int(input())
    M=[]
    for i in range(column):
        r=[]
        for j in range(row):
            r.append(0)
        M.append(r)

    for i in range(column):
        for j in range(row):
            M[i][j]=mat[j][i]
            if(j!=column-1):
                M[i][j]=str(M[i][j])+","
        return(M)
A=[[1,2,3],[4,5,6]]
print(transpose(A))
