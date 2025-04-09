//Ejercicio4:
//Leer 2 números; 
//si son iguales que los multiplique, si el primero es mayor que el segundo que los reste y si no que los sume. 

Proceso Ejercicio4
	
	Definir num1,num2,resultado Como Real;
	
	// Solicitar al usuario los numeros
	Escribir "Digite 2 numeros: ";
	Leer num1,num2;
	
	si num1=num2 Entonces
		resultado <- num1 * num2; //Si son iguales multiplicamos
	SiNo
		si num1>num2 Entonces
			resultado <- num1 - num2; //Si el primer numero es mayor entonces restamos.
		SiNo
			resultado <- num1 + num2; //Si el segundo numeroes mayor se suman
		FinSi
	FinSi
	
	Escribir "El resultado es: ",resultado;
FinProceso
