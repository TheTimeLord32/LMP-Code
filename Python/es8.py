materie = 
[('Inglese',88),('Scienza',90),('Matematica',97),
('Scienze sociali',82)]

print("Lista originale di tuple:")
print(materie)

materie.sort(key = lambda x: x[1])
print("Lista ordinata")
print(materie)