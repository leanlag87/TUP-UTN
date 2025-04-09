//Ingresar "N" enteros, 
//visualizar la suma de los números pares de la lista, 
//cuántos números pares existen y cuál es el promedio de los números impares. 

Proceso Ejercicio7
	Definir n_elementos,i,num Como Enteros;
	Definir suma_pares,conteo_pares Como Enteros;
	Definir suma_impares,conteo_impares Como Enteros;
	Definir promedio_impares Como Real;
	
	Escribir "Digite la cantidad de elementos a ingresar: ";
	Leer n_elementos;
	
	i <- 1;
	suma_pares <- 0;
	conteo_pares <- 0;
	
	suma_impares <- 0;
	conteo_impares <- 0;
	
	Mientras i<= n_elementos Hacer
		Escribir i,". Digite un numero: ";
		Leer num;
		
		si num mod 2 = 0 Entonces
			
			suma_pares <- suma_pares + num;
			
			conteo_pares <- conteo_pares + 1;
			
		SiNo
			suma_impares <- suma_impares + num;
			
			conteo_impares <- conteo_impares + 1;
		FinSi
		
		i <- i + 1;
	FinMientras
	
	si conteo_pares = 0 Entonces
		Escribir "No se han digitado numeros pares: ";
	SiNo
		Escribir "La suma de los numeros pares es: ",suma_pares;
		Escribir "El conteo de los numeros pares es: ",conteo_pares;
	FinSi
	
	Si conteo_impares = 0 Entonces
		Escribir "No se han digitado numeros impares";
	SiNo
		promedio_impares <- suma_impares/conteo_impares;
		Escribir "El promedio de impares es: ",promedio_impares;
		
	FinSi
FinProceso
