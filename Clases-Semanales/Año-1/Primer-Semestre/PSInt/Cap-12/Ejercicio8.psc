// Ejercicio 8: Implementar un subprograma recursivo que realice la serie Fibonacci. 
Proceso Ejercicio8
	Definir nElementos Como Entero;
	// Primero, pedimos los elementos
	pedirDatos(nElementos);
	// Mostramos la serie
	mostrarSerie(nElementos);
FinProceso

SubAlgoritmo pedirDatos(nElementos por Referencia)
	Escribir 'Digite el numero de elementos: 'Sin Saltar;
	Leer nElementos;
FinSubAlgoritmo

SubAlgoritmo mostrarSerie(nElementos)
	Definir i Como Entero;
	Escribir '';
	Escribir 'La serie fibonacci es: ';
	Escribir '0 'Sin Saltar;
	Para i<-1 Hasta nElementos-1 Con Paso 1 Hacer
		Escribir fibonacci(i), ' 'Sin Saltar;
	FinPara
	Escribir '';
FinSubAlgoritmo

SubAlgoritmo retorno <- fibonacci(num)
	Definir retorno Como Entero;
	Si num=1 O num=2 Entonces
		retorno <- 1;
	SiNo
		retorno <- fibonacci(num-1)+fibonacci(num-2);
	FinSi
FinSubAlgoritmo
