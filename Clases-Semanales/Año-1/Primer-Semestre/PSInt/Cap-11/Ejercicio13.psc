//Ejercicio 13: Determinar si una matriz es simetrica

Proceso Ejercicio13
	Definir matriz1,i,j,filas,columnas,matriz2 Como entero;
	Dimension matriz1[100,100],matriz2[100,100];
	Definir band Como Caracter;
	
	band <- "F";
	
	Escribir "Digite el numero de filas: ";
	Leer filas;
	Escribir "Digite el numero de columnas: ";
	Leer columnas;
	//Llenamos la matriz
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir Sin Saltar "Digite un numero[",i,"][",j,"]: ";
			Leer matriz1[i,j];
			matriz2[j,i] <- matriz1[i,j];
		FinPara
	FinPara
	Escribir "";
	//Mostramos la matriz transpuesta
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz2[i,j]," ";
		FinPara
		Escribir "";
	FinPara
	//Vemos si la matriz es cuadrada
	Si filas = columnas Entonces
		Para i<-0 Hasta filas-1 Con paso 1 Hacer
			Para j<- 0 Hasta columnas-1 Con paso 1 Hacer
				Si i <> j y matriz1[i,j] = matriz1[j,i] Entonces
					band <- "V";
				FinSi
			FinPara
	FinPara
FinSi
Escribir "";
Si band = "V" Entonces
	Escribir "la matriz es simetrica";
SiNo
	Escribir "La matriz No es simetrica";
FinSi

FinProceso
