// Ejercicio 8: Mostrar la diagonal principal de una matriz
Proceso Ejercicio8
	Definir i, j Como Entero;
	Definir matriz Como Cadena;
	Dimensionar matriz(3,3);
	matriz[0,0]<-'1';
	matriz[0,1]<-'2';
	matriz[0,2]<-'3';
	matriz[1,0]<-'4';
	matriz[1,1]<-'5';
	matriz[1,2]<-'6';
	matriz[2,0]<-'7';
	matriz[2,1]<-'8';
	matriz[2,2]<-'9';
	Escribir '';
	// Mostrar la matriz
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j]," ";
		FinPara
		Escribir "";
	FinPara
	Escribir "";
	// Mostramos la diagonal principal
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Si i = j Entonces
				Escribir Sin Saltar matriz[i,j]," ";
			SiNo
				Si i <> j Entonces
					matriz[i,j] <- " ";
					Escribir Sin Saltar matriz[i,j]," ";
				FinSi
			FinSi
		FinPara
		Escribir "";
	FinPara
	Escribir "";
FinProceso
