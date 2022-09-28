num1 = [4,2,6,2,11]
num2 = [5,2,3,3,9]

def lista_resti(num1,num2):
    return list(map(lambda x,y: x%y,num1,num2))

print(lista_resti(num1,num2))