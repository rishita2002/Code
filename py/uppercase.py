text=input("Enter a list of Name\n")
StrList=text.split()
newStr=''
for val in StrList:
  newStr += val.capitalize()+' '
  print(newStr)

