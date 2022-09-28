array1 = [1,2,3,4,5,6,7,8,9,10]
array2 = [1,2,4,8,9]

print(array1)
print(array2)

array3 = list(filter(lambda x: x in array1,array2))
print(array3)