"""
Ejercicio: Valor dentro de un rango

Pedimos al usuario un valor numérico
Verificar si el valor ingresado se encuentra entre el rango de 0 a 5
La formula es: <num> >= 0  and  <num> <= 5


"""

# Solicitar al usuario que ingrese un valor numérico y almacenar el valor en una variable
valor = int(input("Digite un numero dentro del rango 0 al 5: "))

# Verificar si el valor ingresado se encuentra dentro del rango de 0 a 5 utilizando la condición <num> >= 0 and <num> <= 5
"""if valor >= 0 and valor <= 5:
    # Si la condición es verdadera, imprimir un mensaje indicando que el valor está dentro del rango
    print("El valor ingresado está dentro del rango de 0 a 5.")
else:
    # Si la condición es falsa, imprimir un mensaje indicando que el valor está fuera del rango
    print("El valor ingresado está fuera del rango de 0 a 5.")"""

valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo

if dentroRango:
    print(f"El valor {valor} ingresado está dentro del rango de 0 a 5.")
else:
    print(f"El valor {valor} ingresado está fuera del rango de 0 a 5.")