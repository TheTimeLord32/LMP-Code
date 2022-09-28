numbers = [12,32,3,42,5,6,73,8]

def my_max(l):
    max = l[0]
    for x in l:
        out = (lambda y:y)(x) > max
        if(out == True):
            max = x
    return max
    
def my_min(l):
    min = l[0]
    for x in l:
        out = (lambda y:y)(x) < min
        if(out == True):
            min = x
    return min
    
print(my_max(numbers))
print(my_min(numbers))