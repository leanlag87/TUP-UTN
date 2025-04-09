// Ejercicio 6: Leer por teclado una serie de 5 números reales. El programa debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados
Proceso Ejercicio6
	Definir i Como Entero;
	Definir creciente, decreciente Como Logico;
	Definir num Como Real;
	Dimensionar num(5);
	Para i<-0 Hasta 4 Hacer
		Escribir (i+1), '. Digite un numero: ';
		Leer num[i];
	FinPara
	creciente <- Falso;
	decreciente <- Falso;
	Para i<-0 Hasta 3 Hacer
		Si num[i]<num[i+1] Entonces
			creciente <- Verdadero;
		FinSi
		Si num[i]>num[i+1] Entonces
			decreciente <- Verdadero;
		FinSi
	FinPara
	Si creciente=Verdadero Y decreciente=Falso Entonces
		Escribir 'El arreglo esta en forma creciente';
	SiNo
		Si creciente=Falso Y decreciente=Verdadero Entonces
			Escribir 'El arreglo esta en forma decreciente';
		SiNo
			Escribir 'El arreglo esta en forma desordenada';
		FinSi
	FinSi
FinProceso
