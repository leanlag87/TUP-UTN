//Ejercicio Array

Proceso Array
	Definir num como entero;
	Definir i Como Entero;
	Dimension num[4];
	//Hay dos maneras en todo lenguaje de programacion
	//Para asignar los elementos: manualmente y pidiendole
	//Al usuario que nos digite la cantidad de elementos
	//del arreglo
	//num[0] <- 14;
	//num[1] <- 18;
	//num[2] <- 9;
	//num[3] <- 2;
	
	Para i <- 0 hasta 3 con paso 1 Hacer
		Escribir "Digite un numero: ";
		Leer num[i];
	FinPara
	
	//Mostrar los elementos del arreglo
	Para i <- 0 hasta 3 con paso 1 Hacer
		Escribir num[i];
	FinPara
FinProceso
