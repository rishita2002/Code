phone=input()
lst=[6,7,8,9]
flag= False
match=""
count=0
if([phone[0] in lst]):
    flag=True
if(len(phone)==10):
    flag= True
for i in phone:
    if i not in match:
        match+=i
    else:
        count+=1
if(count>1):
    flag= False
if(flag):
    print("VALID")
else:
    print("INVALID")