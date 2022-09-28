persone = [
    {"Nome":"Luigi", "Cognome":"Bianchi", "Eta":35},
    {"Nome":"Pietro", "Cognome":"Verdi", "Eta":38},
    {"Nome":"Laura", "Cognome":"Rossi", "Eta":32},
    {"Nome":"Giuseppe", "Cognome":"Neri", "Eta":41},
    {"Nome":"Fabrizio", "Cognome":"Strateanu", "Eta":22}
    ]
    
def my_giovane(persone):
    min = persone[0]
    for persona in persone:
        out = (lambda y:y['Eta'])(persona) <= min['Eta']
        if(out == True):
            min = persona
    return min
    
def my_vecchio(persone):
    max = persone[0]
    for persona in persone:
        out = (lambda y:y['Eta'])(persona) > max['Eta']
        if(out == True):
            max = persona
    return max
            
print(my_giovane(persone))
print(my_vecchio(persone))