Proceso Ejercicio3
	Definir a,b,aux Como Entero;
	Escribir "Digite el valor de a: "; //Ingresar 10
	Leer a;
	Escribir "Digite el valor de b: "; //Ingresar 5
	Leer b;
	
	aux <- a; // Guardamos el valor de adentro de aux
	a <- b; // Pasamos el valor de b hacia b 
	b <- aux; // Pasamos el valor de aux (a) hacia b
	
	Escribir "El valor de a es: ",a;
	Escribir "El valor de b es: ",b;
	
FinProceso
