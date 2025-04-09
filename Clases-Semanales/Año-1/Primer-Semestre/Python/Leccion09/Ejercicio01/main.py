#Ejercicio año bisiesto

'''if __name__ == '__main__':
	num = int()
	opcion = int()
	print("Comprobamos que anio es bisiesto")
	while True:# no hay 'repetir' en python
		print("Ingrese el anio: ")
		num = int(input())
		if ((num%4==0) and (num%100!=0) or num%400==0):
			print("El anio es Bisiesto")
		else:
			print("El anio no es Bisiesto")
		print("Para seguir adelante digite la opcion 1: ")
		opcion = int(input())
		if opcion!=1: break'''


def es_bisiesto(anio):
    # Un año es bisiesto si es divisible por 4 y no es divisible por 100,
    # o si es divisible por 400.
    if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0):
        return True
    else:
        return False

def main():
    while True:
        # Solicitar al usuario que ingrese un año
        anio = int(input("Ingrese un año para verificar si es bisiesto: "))
        
        # Verificar si el año es bisiesto y mostrar el resultado
        if es_bisiesto(anio):
            print(f"El año {anio} es bisiesto.")
        else:
            print(f"El año {anio} no es bisiesto.")
        
        # Preguntar al usuario si desea verificar otro año
        continuar = input("¿Desea verificar otro año? (s/n): ").lower()
        if continuar != 's':
            print("Saliendo del programa...")
            break

# Ejecutar la función principal
if __name__ == "__main__":
    main()
