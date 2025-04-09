Proceso Ejercicio1
		
		Definir  horas,minutos,seg,totalSegundos Como Entero;  
		
		// Solicitar al usuario ingresar las horas, minutos y segundos
		Escribir "Ingrese las horas:";
		Leer horas;
		Escribir "Ingrese los minutos:";
		Leer minutos;
		Escribir "Ingrese los segundos:";
		Leer seg;
		
		// Calcular la cantidad total de segundos
		totalSegundos <- (horas * 3600) + (minutos * 60) + seg;
		
		// Mostrar el resultado
		Escribir "La cantidad total de segundos es:", totalSegundos;

FinProceso
