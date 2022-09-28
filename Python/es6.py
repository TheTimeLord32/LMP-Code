import random

x = input("Inserisci un numero ")
x = int(x)

y = random.randint(0,10)
print(y)
mul = lambda x,y: x*y

print(mul(x,y))

