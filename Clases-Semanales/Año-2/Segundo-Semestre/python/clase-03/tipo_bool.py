# Bool contiene los valores de true y false
# Los tipos numericos, es false para el 0 (cero) y true para los demas valores

valor = 0
resultado = bool(valor)
print(f"El valor de {valor} se evalua como: {resultado}")

valor = 8  # cualquier numero distinto de 0 es true pueden ser negativos o positivos
resultado = bool(valor)
print(f"El valor de {valor} se evalua como: {resultado}")

# Tipo string -> False "", True demas valores
valor = ""
resultado = bool(valor)
print(f"El valor de {valor} se evalua como: {resultado}")

valor = "Hola"
resultado = bool(valor)
print(f"El valor de {valor} se evalua como: {resultado}")

# Tipo colecciones -> False para colecciones vacias
# Tipo colecciones -> True para todas las demas
# Lista
valor = []
resultado = bool(valor)
print(f"El valor de una lista vacía {valor} se evalua como: {resultado}")

valor = [1, 2, 3]
resultado = bool(valor)
print(f"El valor de una lista con contenido {valor} se evalua como: {resultado}")

# Tupla
valor = ()
resultado = bool(valor)
print(f"El valor de una tupla vacía {valor} se evalua como: {resultado}")

valor = (1, 2, 3)
resultado = bool(valor)
print(f"El valor de una tupla con contenido {valor} se evalua como: {resultado}")

# Diccionario
valor = {}
resultado = bool(valor)
print(f"El valor de un diccionario vacío {valor} se evalua como: {resultado}")

valor = {"clave": "valor"}
resultado = bool(valor)
print(f"El valor de un diccionario con contenido {valor} se evalua como: {resultado}")

# Sentencias de control con bool
if []:  # lista vacia
    print("Regresa verdadero")
else:
    print("Regresa falso")

# Ciclos
variable = 8
while variable:
    print("Regresa verdadero")
    break
else:
    print("Regresa falso")
