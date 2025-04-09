//Ordenamiento de Seleccion

Proceso Ejercicio3
	Definir i,j,min,aux,num Como Entero;
	Dimension num[5];
	
	Escribir "Digite los numeros de los elementos: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir Sin Saltar (i+1),". Digite un numero: ";
		Leer num[i];
	FinPara
	
	//Metodo de seleccion
	Para i<-0 Hasta 3 con Paso 1 Hacer
		min <- i;
		Para j<-i+1 Hasta 4 Con Paso 1 Hacer
			Si num[j] < num[min] Entonces
				min <- j;
			FinSi
		FinPara
		aux <- num[i];
		num[i] <- num[min];
		num[min] <- aux;
	FinPara
	Escribir"";
	
	Escribir "El arreglo ordenado es: ";
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir Sin Saltar num[i];
	FinPara
	Escribir "";
	
	Para i<-4 Hasta 0 Con Paso -1 Hacer
		Escribir Sin Saltar num[i];
	FinPara
	Escribir "";
FinProceso

