#Calcular el factorial de un numero mayor o igal a 0

# Inicializamos las variables
num = -1

# Pedimos al usuario un número hasta que sea mayor o igual a 0
while num < 0:
    num = int(input("Digite un número: "))

# Inicializamos el factorial y el contador
i = 1
factorial = 1

# Calculamos el factorial
while i <= num:
    factorial *= i
    i += 1

# Mostramos el resultado
print(f"El factorial es: {factorial}")
