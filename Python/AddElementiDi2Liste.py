import functools as fct
num1 = [45,575,87,2,34,46,65745,54234,3,65,0]

print('Original list')

print(num1)
num1.sort()
print(num1)

print( sorted(num1, key=lambda x: x) )
