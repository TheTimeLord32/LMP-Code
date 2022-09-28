zero = lambda f: lambda x:x
uno = lambda f: lambda x:f(x) 

successore = lambda n: lambda f: lambda x: f((n) (f) (x))

H = successore(successore(uno))(lambda x: x + 5) (10)