"""Ejercicio rectangulo
Instrucciones de la tarea: Ejercicio Rectángulo
En el siguiente ejercicio se solicita calcular el área y el perímetro de un rectángulo. Para ello debemos de crear las siguientes variables:
alto (int)
ancho (int)
El usuario debe de proporcionar los valores de alto y ancho, después se debe de imprimir el resultado en el siguiente formato:

Proporciona el alto del rectángulo: 5
Proporciona el ancho del rectángulo: 3
Área: 15
Perímetro: 16

Las fórmulas para calcular el área y el perímetro de un rectángulo son: 
Área: alto * ancho
Perímetro: (alto + ancho) * 2
"""


# Solicitamos al usuario que proporcione el alto del rectángulo y lo convertimos a entero
alto = int(input("Proporciona el alto del rectángulo: "))

# Solicitamos al usuario que proporcione el ancho del rectángulo y lo convertimos a entero
ancho = int(input("Proporciona el ancho del rectángulo: "))

# Calculamos el área del rectángulo multiplicando el alto por el ancho
area = alto * ancho

# Calculamos el perímetro del rectángulo sumando los lados iguales (alto y ancho) y multiplicando por 2
perimetro = (alto + ancho) * 2

# Imprimimos el valor del área del rectángulo
print("Area: ", area)

# Imprimimos el valor del perímetro del rectángulo
print("Perimetro: ", perimetro)