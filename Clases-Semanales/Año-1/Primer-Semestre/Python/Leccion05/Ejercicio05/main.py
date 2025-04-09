"""
Ejercicio: Tienda de libros
Mostrar: Ingrese los siguientes datos del libro
Digite el nombre del libro
Digite el ID del libro
Digite el precio del libro
Indicar si el envío es gratuito (True/False)
Mostrar:
	Nombre:
	ID: 
	Precio:
	Envío Gratuito?:
"""
print("Digite los siguientes datos del libro")
nombre = input("Digite el numbre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el libro es gratuito (True/False): ")

if envioGratuito == True:
    envioGratuito = True
elif envioGratuito == False:
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
    print(f"""
Nombre: {nombre}
ID: {id}
Precio: {precio}
Envio gratuito?: {envioGratuito}
""")