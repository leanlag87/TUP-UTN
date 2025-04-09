"""
Ejercicio: Rango entre las edades 20 y 30 años

Preguntar la edad al usuario
Si la edad esta dentro de los 20 o 30 años, esta dentro del rango
Combinamos los operadores and y or para saber si el usuario esta dentro del rango o no

"""
edad = int(input("Ingrese su edad:"))

"""veinte = edad >= 20 and edad <= 30
print(veinte)
treinta = edad >= 30 and edad <= 40
print(treinta)"""

"""if veinte or treinta:
    print("Estas dentro del rango de los (20\'0) a (30\'0) años")
else:
    print("No estas dentro del rango de los (20\'0) a (30\'0) años")"""

if ( 20 <= edad < 30 )  or  ( 30 <= edad < 40 ): #Sintaxis simplificada del operador and

    print("Estas dentro del rango de los (20\'0) a (30\'0) años")
else:
    print("No estas dentro del rango de los (20\'0) a (30\'0) años")
