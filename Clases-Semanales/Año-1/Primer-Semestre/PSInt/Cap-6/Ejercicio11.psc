//Ejercicio 11: Imprimir la serie de los "N" términos de la serie de Fibonacci. 

Proceso Ejercicio11
	Definir n_elementos,i,a,b,c Como Entero;
	Repetir
		Escribir "Digite la cantidad de elementos a recorrer: ";
		Leer n_elementos;
	Hasta Que n_elementos > 2
	a <- 0;
	b <- 1;
	c <- 1;
	Escribir "0";
	Escribir "1";
	i <- 3;
	Repetir
		c <- a + b;
		Escribir c;
		a <- b;
		b <- c;
		i <- i + 1;
	Hasta Que i > n_elementos
FinProceso
