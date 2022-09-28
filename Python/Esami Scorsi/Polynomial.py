from functools import reduce

def polynomial(a,b,c,d,e):
    polinomio = [a,b,c,d,e]
    print (polinomio[0],' + ',end ='')
    for i in range(1,len(polinomio)-1):
        print(polinomio[i],'x^',i,' + ',end='')
    print(polinomio[len(polinomio)-1],'x^',len(polinomio)-1)
    out = reduce(lambda x: a+b*x
    return out



print(polynomial(5,4,3,2,8))