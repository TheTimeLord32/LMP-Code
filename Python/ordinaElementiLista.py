l = [(1,2),(4,1),(5,0),(3,3)]

def ordina_lista(l):
    return sorted(l,key= lambda elemento: elemento[1])
    
print(ordina_lista(l))