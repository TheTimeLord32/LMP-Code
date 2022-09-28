numeri = [1,2,3,4,5,6,7,8,9,10]

print('Lista originale')
print(numeri)

print('Lista quadrati')
print(list(map(lambda x: x** 2, numeri)))

print('Lista cubi')
print(list(map(lambda x: x** 3, numeri)))
