def parDisp(array):
    pari = len(list(filter(lambda x: x%2 == 0, array)))
    print(pari)
    dispari = len(list(filter(lambda x: x%2 != 0, array)))
    print(dispari)

array = [1,2,3,5,7,8,9,10]

print('Original array')
print(array)

parDisp(array)