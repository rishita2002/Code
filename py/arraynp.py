import numpy as np
a=np.array([1,2,3])
b=np.array([[1,2,3],[2,3,4]])
c=np.array([2,4,6,5])
print(a.ndim,a.shape)
print(b.ndim,b.shape)
print(c.ndim,c.shape)
a=np.resize(a,c.shape[0])
w=a+c
print(w)