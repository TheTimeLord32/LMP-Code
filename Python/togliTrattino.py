lista = ['C-3','P-O','R-2','D-2']

def togliTrattino(lista):
    return list(map(lambda el: el.replace('-',''),lista))
 
togliTrattino(lista)