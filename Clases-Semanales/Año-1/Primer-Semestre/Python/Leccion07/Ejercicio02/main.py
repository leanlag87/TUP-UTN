# Ejercicio Etapas de Vida

#función que recibe la edad y devuelve una descripción de la etapa de vida 
def obtener_etapa_de_vida(edad):
    if 0 <= edad <= 10:
        return "La infancia es increíble y bella."
    elif 11 <= edad <= 19:
        return "Tienes muchos cambios, mucho que estudiar."
    elif 20 <= edad <= 29:
        return "Amor y comienza el trabajo."
    
    elif 30 <= edad <= 39:
        return "Etapa de crecimiento personal y profesional."
    elif 40 <= edad <= 49:
        return "Estabilidad y reflexión sobre la vida."
    elif 50 <= edad <= 59:
        return "Sabiduría y nuevas oportunidades."
    elif 60 <= edad <= 69:
        return "Disfrute de la vida y la familia."
    elif 70 <= edad <= 79:
        return "Momento de paz y tranquilidad."
    elif 80 <= edad:
        return "Época de legado y recuerdos valiosos."
    else:
        return "Edad no válida."

#función que solicita al usuario que ingrese su edad y verifica que el valor sea un numero entero no negativo
def main():
    try:
        edad = int(input("Ingrese su edad: "))
        if edad < 0:
            print("La edad no puede ser negativa.")
        else:
            etapa = obtener_etapa_de_vida(edad)
            print(f"Con {edad} años: {etapa}")
    except ValueError:
        print("Entrada no válida. Por favor, ingrese un número entero.")

if __name__ == "__main__":
    main()
