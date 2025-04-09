#Ingresar "N" enteros, visualizar la suma de los numeros pares de la lista
#cuantos numeros pares existen y cual es el promedio de los numero impares

# Pedimos al usuario la cantidad de elementos a ingresar
n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))

# Inicializamos las variables
suma_pares = 0
conteo_pares = 0
suma_impares = 0
conteo_impares = 0

# Iteramos hasta obtener todos los elementos
for i in range(n_elementos):
    num = int(input(f"Digite el número {i + 1}: "))
    
    # Verificamos si el número es par o impar
    if num % 2 == 0:
        suma_pares += num
        conteo_pares += 1
    else:
        suma_impares += num
        conteo_impares += 1

# Mostramos la suma y el conteo de los números pares
print("La suma de los números pares es:", suma_pares)
print("El conteo de los números pares es:", conteo_pares)

# Calculamos y mostramos el promedio de los números impares
if conteo_impares > 0:
    promedio_impares = suma_impares / conteo_impares
    print("El promedio de los números impares es:", promedio_impares)
else:
    print("No se han digitado números impares")
