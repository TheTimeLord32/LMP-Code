str1 = 'sdf 23 safs8 5 sdfsd8 sdfs 56 21sfs 20 5'
print("Original string: ",str1)

str_num = [ i for i in str1.split(' ')]
print(str_num)

length = len(str_num)
numbers = sorted([int(x) for x in str_num if x.isdigit()])
print(numbers)

for i in ((filter(lambda x: x>length,numbers))):
    print(i,end=' ')