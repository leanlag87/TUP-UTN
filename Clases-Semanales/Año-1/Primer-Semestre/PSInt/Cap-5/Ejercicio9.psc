// Ejercicio9:
// Hacer un programa que tenga un men� con las siguientes opciones:  
// Opci�n 1: Elevar un n�mero a una potencia X 
// Opci�n 2: Sacar la ra�z cuadrada de un n�mero 
// Opci�n 3: Salir 
Proceso Ejercicio9
	Definir opcion Como Entero;
	Escribir 'MENU';
	Escribir '1. Elevar un numero a una potencia X';
	Escribir '2. Sacar la raiz cuadrada de un numero';
	Escribir '3. Salir';
	Escribir 'Digite una opcion: ';
	Leer opcion;
	Segun opcion Hacer
		1:
			Definir num, pot, resultado Como Real;
			Escribir 'Digite un numero: ';
			Leer num;
			Escribir 'Digite la potencia';
			Leer pot;
			resultado <- num^pot;
			Escribir 'El resultado es: ', resultado;
		2:
			Definir num, resultado Como Real;
			Escribir 'Digite un numero: ';
			Leer num;
			resultado <- rc(num);
			Escribir 'El resultado es: ', resultado;
		3:
			Escribir 'Salio del menu';
		De Otro Modo:
			Escribir 'Se equivoco de opcion de menu';
	FinSegun
FinProceso
