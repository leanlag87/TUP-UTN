// Ejercicio 5: Leer 8 n�meros enteros dentro de un arreglo. Debemos mostrarlos en el siguiente orden: el primero, el �ltimo, el segundo, el pen�ltimo, el tercero, etc. 
Proceso Ejercicio5
	Definir num, i Como Entero;
	Dimensionar num(8);
	Para i<-0 Hasta 7 Hacer
		Escribir (i+1), ' . Digite un numero: ';
		Leer num[i];
	FinPara
	Para i<-0 Hasta 3 Hacer
		Escribir num[i];
		Escribir num[7-i];
	FinPara
FinProceso
