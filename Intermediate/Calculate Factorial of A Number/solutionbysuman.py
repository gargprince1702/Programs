def fact(n):
    
    if n==1:
        return n
    else:
        return n*fact(n-1)
    
    
num=int(input("Enter the number:"))

if  num<0:
    print("Factorial doesn't exist for negative number!!")
elif num==0:
    print("The factorial of no. is 1.")
else:
    print("The factorial of", num,"is",fact(num))
        
