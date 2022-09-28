parole = ['aaa','Python','ada','php','ciao','w3r']

print('Lista originale')
print(parole)

result = list(filter(lambda x: (x == "".join(reversed(x))),parole))
print(result)
