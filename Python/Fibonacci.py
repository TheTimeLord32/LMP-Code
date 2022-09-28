from functools import reduce

fib_series = lambda n: reduce(lambda x,_: x+[x[-1]+x[-2]],range(n-2), [0,1])

num = input('Inserisci il numero di cui vuoi la serie di fibonacci')
num = int(num)
print(fib_series(5))