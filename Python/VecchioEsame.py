lista = [('bla',200,'carbone','ecc'),
         ('bla',100,'ferro','ecc'),
         ('bla',150,'alluminio','ecc')]

print(lista)

result = sorted(lista,key = lambda x:x[1])
print(result)