// Ejercicio 2: Dise�e un algoritmo que muestre un men� al usuario con las siguientes opciones: potenciaci�n, ra�z cuadrada y terminar, que cada opci�n la realice una funci�n o procedimiento. 
Proceso Ejercicio2
	menu;
	Escribir "";
FinProceso

SubProceso menu
	Definir opcion como entero;
	Definir num,exponente como reales;
	Repetir
		Escribir "MENU";
		Escribir "1. Potenciacion";
		Escribir "2. Raiz cuadrada";
		Escribir "3. Salir";
		Escribir Sin Saltar "Digite una opcion: ";
		Leer opcion;
		Escribir "";
		Segun opcion Hacer
			1:
				Escribir Sin Saltar "Digite un numero: ";
				Leer num;
				Escribir Sin Saltar "Digite un exponente: ";
				Leer exponente;
				Escribir "La potencia es: ",potencia(num,exponente);
			2:
				Escribir Sin Saltar "Digite un numero: ";
				Leer num;
				Escribir "La raiz cuadrada es: ",raizCuadrada(num);
			3:
			De Otro Modo:
				Escribir "Se equivoco de opcion de menu";
		FinSegun
		Escribir "";
	Hasta Que opcion = 3
FinSubProceso

SubProceso pot <- potencia(num,exponente)
	Definir pot como real;
	pot <- num^exponente;
FinSubProceso

SubProceso raiz_C <- raizCuadrada(num)
	Definir raiz_C como real;
	raiz_C <- rc(num);
FinSubProceso
