lista_interi = [1,2,3,4,5,6,7,8,9,10]

print('Lista originale')
print(lista_interi)

pari = filter(lambda x: x%2 == 0,lista_interi)
print('PARI')
print(list(pari))

dispari = filter(lambda x: x%2 != 0, lista_interi)
print('DISPARI')
print(list(dispari))
