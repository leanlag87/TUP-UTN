# Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos. 
# Realizar un algoritmo para calcular la calificación promedio y la calificación más baja de todo el grupo

if __name__ == '__main__':
	calificacionpromedio = float()
	calificacionbaja = float()
	calificacion = float()
	suma = float()
	i = int()
	suma = 0
	calificacionbaja = 99999
	for i in range(1,11):
		print(i," .Digite una calificacion: ")
		calificacion = float(input())
		suma = suma+calificacion
		# Suma iterativa de las calificaciones
		# Calculamos la menor calificacion 
		if calificacion<calificacionbaja:
			calificacionbaja = calificacion
	calificacionpromedio = suma/10
	print("La calificacion promedio es: ",calificacionpromedio)
	print("La calificacion mas baja es: ",calificacionbaja)