lista = [   {'nome': 'AMT', 'prezzo': 112},
            {'nome': 'BTM', 'prezzo': 224},
            {'nome': 'CAT', 'prezzo': 13}
        ]

lista.sort(key = lambda el: el['prezzo'])
print(lista)