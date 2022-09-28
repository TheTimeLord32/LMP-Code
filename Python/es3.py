sorted(["This","is","af","test","string"], key = lambda x: x[1])


def my_map(l,f):
    lista_out = []
    for e in l:
        lista_out.append(f(e))
    return lista_out
    
def my_map2(l,f):
    return [f(x) for x in l]
    
def my_reduce(l,f):
    
    if lista == []:
        return 0
        
    totale = lista[0]
    for el in range(1,len(lista)):
        totale = f(totale,el)
    return totale    
       
out = my_map2([1,2,3], lambda x: x+1)