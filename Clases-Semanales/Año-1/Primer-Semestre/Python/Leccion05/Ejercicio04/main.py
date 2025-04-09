"""
Ejercicio: El mayor de dos números
Solicitar al usuario dos valores, determinar cual es el mayor.
Solicitar al usuario dos valores
	numero1 (int)
	numero2 (int)
Se debe imprimir el mayor de los dos números (La salida debe ser identica a la siguiente):
	Digite el valor para el numero1:
	Digite el valor para el numero2:
	El número mayor es:   <numeroMayor>

"""
numero1 = int(input("Digite el valor para el Numero1: "))
numero2 = int(input("Digite el valor para el Numero2: "))

if numero1 > numero2:
    print("El numero 1 es mayor")
else:
    print("El numero 2 es mayor")
