def mul(n):
    return lambda x: x*n
    
x = input("Inserisci un numero ")
x = int(x)

result = mul(2)
print("Il doppio di ",x," e' ",result(x))
result = mul(3)
print("Il triplo di ",x," e' ",result(x))
result = mul(4)
print("Il quadruplo di ",x," e' ",result(x))
result = mul(5)
print("Il quintuplo di ",x," e' ",result(x))
