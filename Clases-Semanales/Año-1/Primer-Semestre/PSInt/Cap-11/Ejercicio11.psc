// Ejercicio 11: Matriz transpuesta
Proceso Ejercicio11
	Definir matriz, i, j Como Entero;
	Dimensionar matriz(3,3);
	// Llenar matriz
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir 'Digite un numero[', i, '][', j, ']: 'Sin Saltar;
			Leer matriz[i,j];
		FinPara
	FinPara
	Escribir '';
	// Mostrar matriz transpuesta
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir matriz[j,i], ' 'Sin Saltar;
		FinPara
		Escribir '';
	FinPara
	Escribir '';
FinProceso
