""" 
Ejercicio: Determinar si es mayor de edad

Pedir un número al usuario
Almacenar el valor en una variable
Usar la estructura ‘if else’
La formula es: <num> >= 18
True: Eres mayor de edad, Imprimir
False: Eres menor de edad, Imprimir

"""

# Solicitar al usuario que ingrese su edad y almacenar el valor en una variable
edad = int(input("Ingrese su edad: "))

# Utilizar la estructura 'if else' para verificar si la edad es mayor o igual a 18
if edad >= 18:
    # Si la condición es verdadera, imprimir el mensaje indicando que es mayor de edad
    print("Eres mayor de edad")
else:
    # Si la condición es falsa, imprimir el mensaje indicando que es menor de edad
    print("Eres menor de edad")