// Copiar una matriz a otra
Proceso Ejercicio9
	Definir matriz1, matriz2, i, j Como Entero;
	Dimensionar matriz1(2,2), matriz2(2,2);
	// Llenar matriz1
	Para i<-0 Hasta 1 Hacer
		Para j<-0 Hasta 1 Hacer
			Escribir 'Digite un numero[', i, '][', j, '] 'Sin Saltar;
			Leer matriz1[i,j];
		FinPara
	FinPara
	Escribir '';
	// Copiamos una matriz a otra y mostramos
	Para i<-0 Hasta 1 Hacer
		Para j<-0 Hasta 1 Hacer
			matriz2[i,j]<-matriz1[i,j];
			// Condicionales solo para la vista
			Si i=0 Y j=0 Entonces
				// Use 12 espacios
				Escribir '           ', matriz2[i,j], ' 'Sin Saltar;
			SiNo
				// El condicional es solo para una matriz 2 * 2
				Si i=1 Y j=0 Entonces
					Escribir '           ', matriz2[i,j], ' 'Sin Saltar;
				SiNo
					Escribir matriz2[i,j], ' 'Sin Saltar;
				FinSi
			FinSi
		FinPara
		Escribir '';
	FinPara
	Escribir '';
FinProceso
