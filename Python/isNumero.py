is_num = lambda x: x.replace('.','').isdigit()
print(is_num("26587"))
print(is_num("4.2365"))
print(is_num('-12547'))
print(is_num('00'))
print(is_num('A001'))
print(is_num('001'))

is_num1 = lambda x: is_num(x[1:]) if x[0] == '-' else is_num(x)
print(is_num1('-16.4'))
print(is_num1('-24587.11'))