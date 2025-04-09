// Ejercicio 3: Hacer un algoritmo que llene una matriz de 4*4. Calcular la suma de cada fila y almacenarla en un arreglo, la suma de cada columna y almacenarla en otro arreglo
Proceso Ejercicio3
	Definir num,i,j como enteros;
	Dimension num[4,4];
	Definir filas,suma_filas,posFila como enteros;
	Dimension filas[4];
	Definir columnas,suma_col,posCol como enteros;
	Dimension columnas[4];
	// Pedimos los elementos de la matriz al usuario
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir "Digite un numero[",i,"][",j,"]: ";
			Leer num[i,j];
		FinPara
	FinPara
	// Mostar matriz
	Escribir "";
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir Sin Saltar num[i,j]," ";
		FinPara
		Escribir "";
	FinPara
	// Recorremos la matriz y sumamos las filas
	posFila <- 0;
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		suma_filas <- 0;
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			suma_filas <- suma_filas + num[i,j];
		FinPara
		filas[posFila] <- suma_filas;
		posFila <- posFila + 1;
	FinPara
	// Recorremos la matriz y sumamos las columnas
	posCol <- 0;
	Para j<-0 Hasta 3 Con Paso 1 Hacer
		suma_col <- 0;
		Para i<-0 Hasta 3 Con Paso 1 Hacer
			suma_col <- suma_col + num[i,j];
		FinPara
		columnas[posCol] <- suma_col;
		posCol <- posCol + 1;
	FinPara
	// Mostramos el arreglo con las sumas de las filas
	Escribir "";
	Escribir Sin Saltar "La suma de las filas son: ";
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Escribir Sin Saltar filas[i]," ";
	FinPara
	// Mostramos el arreglo con las sumas de las columnas
	Escribir "";
	Escribir Sin Saltar "La suma de las columnas son: ";
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Escribir Sin Saltar columnas[i]," ";
	FinPara
	Escribir "";
FinProceso
