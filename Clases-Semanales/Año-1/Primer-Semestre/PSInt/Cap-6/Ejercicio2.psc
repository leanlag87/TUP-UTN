// Se desea calcular independientemente la suma de los números pares e impares comprendidos entre 1 y 50. 
Proceso Ejercicio2
	Definir sumaPares, sumaImpares, i Como Entero;
	sumaPares <- 0;
	sumaImpares <- 0;
	Para i<-2 Hasta 49 Con Paso 1 Hacer
		Si i MOD 2=0 Entonces
			sumaPares <- sumaPares+i;
		SiNo
			sumaImpares <- sumaImpares+i;
		FinSi
	FinPara
	Escribir 'La suma de pares es: ', sumaPares;
	Escribir 'La suma impares es: ', sumaImpares;
FinProceso
