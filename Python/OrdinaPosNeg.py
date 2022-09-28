array = [-1,2,-3,5,7,8,9,-10]

print('Original array')
print(array)

ordinato = sorted(array, key = lambda i: 0 if i==0 else -1/i)
print(ordinato)