modelli = [{'make': 'Nokia','model' : 216, 'color' : 'Black'},
            {'make' : 'Mi Max','model' : 2, 'color' : 'Gold'},
            {'make' : 'Samsung','model' : 7, 'color' : 'Blue'}]

print('Lista originale')
print(modelli)

sorted_modelli = sorted(modelli, key = lambda x: x['color'])
print('Lista modificata')
print(sorted_modelli)
