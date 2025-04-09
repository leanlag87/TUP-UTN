#Ejercicio 3: 
#Intercambiar el valor de dos variables en Python
#Por ejemplo: 
#a = 10  ->   a = 5
#b = 5  ->    b = 10

#Definimos las variables

a = 10
b = 5

#Mostramos sus valores 

print("Valores originales:")
print("a =", a)
print("b =", b)

#Cambiamos los valores

temporal = a
a = b
b = temporal

#Mostramos el intercambio
print("\n")
print("Valores intercambiados:")
print("a =", a)
print("b =", b)