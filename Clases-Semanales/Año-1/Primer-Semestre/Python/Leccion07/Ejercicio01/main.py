#Ejercicio Calcular estacion del año

#Funcion que recibe el numero del mes y devuelve la estación correspondiente.
def obtener_estacion(mes):
    if mes in [1, 2, 3]:
        return "Verano"
    elif mes in [4, 5, 6]:
        return "Otoño"
    elif mes in [7, 8, 9]:
        return "Invierno"
    elif mes in [10, 11, 12]:
        return "Primavera"
    else:
        return None

#funcion que solicita al usuario que ingrese un mes del año y verifica si el valor ingresado está entre 1 y 12.
def main():
    try:
        mes = int(input("Ingrese un mes del año (1-12): "))
        if 1 <= mes <= 12:
            estacion = obtener_estacion(mes)
            print(f"El mes {mes} corresponde a la estación: {estacion}")
        else:
            print("Por favor, ingrese un número entre 1 y 12.")
    except ValueError:
        print("Entrada no válida. Por favor, ingrese un número entero.")

if __name__ == "__main__":
    main()
