#1. Numeric Data types: int, float, boolean
a=44
print(a)
c=True
print(c)
print(type(a))
print("The type of c is:",type(c))
d=3.465
print("The type of d is:",type(d))
e=complex(3,5)
print("The type of e is:",type(e))

#2. sequenced data: list string and tuple
list1 = [4,3,2,4.3,'Apple',[-2,5],7]
print("List is:-",list1)

b="Hello"
print(b)
print("The type of b is:",type(b))

tuple1 = (1,4,3,'Apple','banana',4.5)
print("Tuple is:-",tuple1)

#3.mapped data: dict{keys:values}
dict1 = {'number':1, 'age':20, 'name':'Sunny',"couse":"BCA"}
print("Dictionary is:-",dict1)
print("Dictionary keys is:-",dict1.keys())
print("Dictionary value is:-",dict1.values())