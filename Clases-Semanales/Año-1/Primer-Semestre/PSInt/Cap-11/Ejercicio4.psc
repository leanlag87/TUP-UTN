// Ejercicio 4: Hacer un algoritmo que llene una matriz de 3*4. Sumar las columnas e imprimir que columna tuvo la máxima suma y la suma de esa columna
Proceso Ejercicio4
	Definir num,i,j como enteros;
	Dimension num[3,4];
	Definir mayor,suma_col,posCol como enteros;
	// Pedimos los elementos de la matriz
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir Sin Saltar "Digite un numero[",i,"][",j,"]: ";
			Leer num[i,j];
		FinPara
	FinPara
	Escribir "";
	// Mostramos la matriz
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			Escribir Sin Saltar num[i,j]," ";
		FinPara
		Escribir "";
	FinPara
	// Almacenamos dentro de mayor la suma de los elementos de la primera columna
	suma_col <- 0;
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		suma_col <- suma_col + num[i,0];
	FinPara
	// Por el momento la primera columna es la que tiene la mayor sum_col
	mayor <- suma_col;
	posCol <- 0;
	// Ahora, vamos a recorrer las demas columnas y sumamos
	Para j<-1 Hasta 3 Con Paso 1 Hacer
		suma_col <- 0;
		Para i<-0 Hasta 2 Con Paso 1 Hacer
			suma_col <- suma_col + num[i,j];
		FinPara
		Si suma_col > mayor Entonces
			mayor <- suma_col;
			posCol <- j;
		FinSi
	FinPara
	Escribir "";
	Escribir "La columna con la mayor suma es: ",posCol;
	Escribir "La suma de dicha columna es: ",mayor;
	Escribir "";
FinProceso
