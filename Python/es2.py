successore = lambda n: lambda f: lambda x: f((n) (f) (x))
add = (lambda m: lambda n: lambda f: lambda x: n(f)(m(f)(x)))

zero = lambda f: lambda x:x
uno = successore(zero)
due = successore(uno)

ris = due(lambda x: x + 5)(10)

quattro = add(due)(due)

ris = add(quattro)(due)(lambda x: "s(" + x + ")")("0")