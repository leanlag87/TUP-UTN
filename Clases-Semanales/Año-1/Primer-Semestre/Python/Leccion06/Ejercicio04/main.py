#Ejercicio 4: Área y longitud de un circulo
#Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia en Phyton
#Área = Pi * r2
#Longitud = 2 * Pi * r
#En este ejercicio vamos a necesitar importar el modulo math porque tiene el valor de Pi
#Se escribe: import math

#Importamos el modulo
import math

#Pedimos al usuario que ingrese el radio del circulo
radio= float(input("Ingrese el radio del circulo: "))

#Calculamos el area del circulo
area = math.pi * radio**2

#Calculamos la longitud de la cincurferencia
longitud = 2 * math.pi * radio

#Mostramos los resultados
print("El area del circulo es.", area)
print("La longitud de la circunferencia es:", longitud)