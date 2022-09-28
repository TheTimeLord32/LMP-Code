def my_any(lista):
    out = False
    for i in lista:
        if((lambda x:x)(i) == True):
            out = True
    return out
    
def my_all(lista):
    out = True
    for i in lista:
        if((lambda x:x)(i) == False):
            out = False
    return out
    
print(my_any([True,False,True,False]))
print(my_all([True,True,True,True]))