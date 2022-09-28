persone = [
    {"Nome":"Luigi", "Cognome":"Bianchi", "Eta":35},
    {"Nome":"Pietro", "Cognome":"Verdi", "Eta":38},
    {"Nome":"Laura", "Cognome":"Rossi", "Eta":32},
    {"Nome":"Giuseppe", "Cognome":"Neri", "Eta":41},
    {"Nome":"Fabrizio", "Cognome":"Strateanu", "Eta":22}
    ]
    
ordina_per_nome = persone.sort(key = lambda x: x['Nome'])
print(persone)

ordina_per_cognome = persone.sort(key = lambda x: x['Cognome'])
print(persone)


ordina_per_eta = persone.sort(key = lambda x: x['Eta'])
print(persone)