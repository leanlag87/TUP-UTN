// Leer 10 números e imprimir cuantos son positivos, cuantos negativos y cuantos neutros. 
Proceso Ejercicio3
	Definir num, i Como Entero;
	Definir conteoPositivo, conteoNegativo, conteoNeutro Como Entero;
	conteoPositivo <- 0;
	conteoNegativo <- 0;
	conteoNeutro <- 0;
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir i, '. Digite un numero: ';
		Leer num;
		Si num=0 Entonces
			conteoNeutro <- conteoNeutro+1;
		SiNo
			Si num>0 Entonces
				conteoPositivo <- conteoPositivo+1;
			SiNo
				conteoNegativo <- conteoNegativo+1;
			FinSi
		FinSi
	FinPara
	Escribir 'La cantidad de positivos es: ', conteoPositivo;
	Escribir 'La cantidad de negativos es: ', conteoNegativo;
	Escribir 'La cantidad de neutros es: ', conteoNeutro;
FinProceso
