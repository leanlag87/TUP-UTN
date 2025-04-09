//Busqueda Binaria

Proceso Ejercicio2
	Definir encontrado,creciente Como Logico;
	Definir inf,sup,mitad,posicion Como entero;	
	Definir num,i,dato Como entero;
	Dimension num[5];
	
	Escribir "Digite los elementos del arreglo ascendentemente";
	
	Repetir
		creciente <- Verdadero;
		Para i<-0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar i,". Digite un numero: ";
			Leer num[i];
		FinPara
		
		Para i<-0 Hasta 3 Con Paso 1 Hacer
			Si num[i] > num[i+1] Entonces
				creciente <- Falso;
			FinSi
		FinPara
		
		Si creciente = Falso Entonces
			Escribir "El arreglo esta desordenado, vuelva a digitarlo";
		FinSi
	Hasta Que creciente = Verdadero;
	
	Escribir "";
	Escribir "Digite el dato a buscar: ";
	Leer dato;
	
	encontrado <- Falso;
	inf <- 0;
	sup <- 5;
	i <- 0;
	mitad <- trunc((inf+sup)/2);
	
	Mientras (inf<=sup y i<5 y encontrado = Falso) Hacer
		Si (num[mitad] = dato) Entonces
			encontrado <- Verdadero;
			posicion <- mitad;
		SiNo
			Si (num[mitad] < dato) Entonces
				inf <- mitad + 1;
			SiNo
				sup <- mitad - 1;
			FinSi
			mitad <- trunc((inf+sup)/2);
		FinSi
		i <- i + 1;
	FinMientras
	
	Si (encontrado = Verdadero) Entonces
		Escribir "El elemento ha sido encontrado en la posicion: ",posicion;
	SiNo
		Escribir "El elemento No ha sido encontrado";
	FinSi
FinProceso
