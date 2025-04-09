"""
Ejercicio: Operador or

La pregunta es si un padre puede asistir al juego de su hijo.
Verificamos si tiene vacaciones
Verificamos si tiene el día libre
Usar estructura ‘if else’ con el operador or
Imprimir

"""
vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print("Puede asistir al juego")

