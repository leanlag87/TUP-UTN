//Ejercicio5:
//Leer tres números diferentes e imprimir el número mayor de los tres

Proceso Ejercicio5
	
	Definir num1,num2,num3 como reales;
	
	// Solicitar al usuario los numeros
	Escribir "Digite 3 numeros diferentes: ";
	Leer num1,num2,num3;
	Si num1>num2 y num1>num3 Entonces
		Escribir "El mayor es: ",num1;
	SiNo
		Si num2>num1 y num2>num3 Entonces
			Escribir "El mayor es: ",num2;
		SiNo
			Escribir "El mayor es: ",num3;
		FinSi
	FinSi
	
	
FinProceso
