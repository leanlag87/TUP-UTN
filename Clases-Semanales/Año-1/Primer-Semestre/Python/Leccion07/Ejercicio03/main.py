#Ejercicio Sistema de calificaciones

# función que recibe el valor ingresado y devuelve la calificación correspondiente
def obtener_calificacion(valor):
    if 9 <= valor <= 10:
        return "A"
    elif 8 <= valor < 9:
        return "B"
    elif 7 <= valor < 8:
        return "C"
    elif 6 <= valor < 7:
        return "D"
    elif 0 <= valor < 6:
        return "F"
    else:
        return None

#La funcion solicita al usuario que ingrese un valor entre 0 y 10.
def main():
    try:
        valor = float(input("Ingrese un valor del 0 al 10: "))
        if 0 <= valor <= 10:
            calificacion = obtener_calificacion(valor)
            print(f"La calificación correspondiente es: {calificacion}")
        else:
            print("El valor ingresado es incorrecto. Debe estar entre 0 y 10.")
    except ValueError:
        print("Entrada no válida. Por favor, ingrese un número.")

if __name__ == "__main__":
    main()
