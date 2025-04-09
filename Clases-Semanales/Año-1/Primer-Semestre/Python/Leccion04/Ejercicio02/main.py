"""Ejercicio: Número par o impar
1-Solicitamos que el usuario ingrese un número
2-Este se asigna a una variable
3-Utilizaremos la estructura ‘if else’
4-La formula: <num> % 2 == 0 Esta operación nos dice si es un número par
5-Si es True imprimimos que es par
6-Si es False imprimimos que es impar"""

# Solicitamos al usuario que ingrese un número y lo convertimos a entero
numero = int(input("Ingrese un número: "))

# Verificamos si el número es par o impar utilizando la operación de módulo (%)
# Si el residuo de la división entre el número y 2 es igual a 0, entonces es par
if numero % 2 == 0:
    # Imprimimos un mensaje indicando que el número es par
    print("Es par")
else:
    # En caso contrario, imprimimos un mensaje indicando que el número es impar
    print("Es impar")