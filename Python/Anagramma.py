from collections import Counter

parole = ['bcda','abce','cbda','cbea','adcb']
str = 'abcd'

print('Lista originale')
print(parole)

result = list(filter(lambda x: (Counter(str) == Counter(x)),parole))
print(result)