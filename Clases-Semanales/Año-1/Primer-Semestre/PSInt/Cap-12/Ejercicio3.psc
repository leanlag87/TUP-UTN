// Ejercicio 3: Desarrollar un programa que pueda calcular el valor del tipo de cambio de moneda (de tu moneda ? hacia dólar y viceversa). 
Proceso Ejercicio3
	menu;
	Escribir "";
FinProceso

SubProceso menu
	Definir opcion como entero;
	Definir pesos,dolares como real;
	Repetir
		Escribir "MENU";
		Escribir "1. Cambiar Pesos a Dolares";
		Escribir "2. Cambiar Dolares a Pesos";
		Escribir "3. Salir";
		Escribir Sin Saltar "Digite una opcion de menu: ";
		Leer opcion;
		Escribir "";
		Segun opcion Hacer
			1:
				Escribir Sin Saltar "Digite la cantidad de pesos: ";
				Leer pesos;
				dolares <- cambioADolares(pesos);
				Escribir "El cambio a dolar es: $",dolares;
			2:
				Escribir Sin Saltar "Digite la cantidad de dolares: ";
				Leer dolares;
				pesos <- cambioDolaresAPesos(dolares);
				Escribir "El cambio a pesos es: $",pesos;
			3:
			De Otro Modo:
				Escribir "Se equivoco de opcion de menu";
		FinSegun
		Escribir "";
	Hasta Que opcion = 3
FinSubProceso

SubProceso dolar <- cambioADolares(pesos)
	Definir dolar como real;
	dolar <- pesos/200;
FinSubProceso

SubProceso pesos <- cambioDolaresAPesos(dolares)
	Definir pesos como real;
	pesos <- dolares*200;
FinSubProceso
