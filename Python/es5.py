x = input("Inserisci il numero al quale si vuole aggiungere 15")
y = input("Inserisci il numero al quale si vuole moltiplicare "+x)
x = int(x)
y = int(y)

add = lambda x: x + 15
mul = lambda x,y: x*y
print(add(x))
print(mul(x,y))

