# Ejercicio 1:
#Escribir la siguiente expresión en forma de expresión algorítmica en Python
#a3 x (b2 – 2ac)
#2b
#1-Pedimos al usuario 3 valores = a, b, c
#2-Mostramos el resultado final

#Pedimos al usuarios los valos de a, b y c

a = float(input("Ingrese el valor de a: "))
b = float(input("Ingrese el valos de b: "))
c = float(input("Ingrese el valor de c: "))

#Ahora calculamos el resultado final

resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)

#Mostramos el resultado

print(f"El resultado fina es: , {resultado}")