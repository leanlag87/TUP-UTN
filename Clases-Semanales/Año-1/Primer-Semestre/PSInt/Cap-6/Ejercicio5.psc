// Calcular el factorial de un número mayor o igual a 0
Proceso Ejercicio5
	Definir num como entero;
	Definir i,factorial como enteros;
	Repetir
		Escribir "Digite un numero: ";
		Leer num;
	Hasta Que num >=0
	i <- 1;
	factorial <- 1;
	Mientras i<=num Hacer
		factorial <- factorial * i;
		i <- i + 1;
	FinMientras
	Escribir "El factorial es: ",factorial;
FinProceso
