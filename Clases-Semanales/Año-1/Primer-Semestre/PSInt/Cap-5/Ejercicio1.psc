// Ejercicio 1:
// Estructuras Condicionales 
// Ingrese un número entero y reportar si es par o impar
Proceso Ejercicio1
	Definir num Como Entero;
	// Solicitar al usuario el numero
	Escribir 'Digite un numero: ';
	Leer num;
	Si num MOD 2=0 Entonces
		Escribir 'El numero ', num, ' es par';
	SiNo // Si el numero ingresado es par fin del proceso
		Escribir 'El numero ', num, ' es impar';
	FinSi // Si el numero es impar entra en esta condicion 
FinProceso
