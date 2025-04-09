//Capítulo 6: Estructuras Repetitivas
//Ejercicio 1: Calcular la suma de los "N" primeros números

Proceso Ejercicio1
	Definir N, suma, i Como Entero;
	
	Escribir Sin Saltar "Digite la cantidad de numeros a sumarse: ";
	Leer N;
	
	suma <- 0;
	
	Para i<-1 Hasta N Con Paso 1 Hacer
		suma <- suma + i;
	FinPara
	Escribir "La suma es: ",suma;
FinProceso
