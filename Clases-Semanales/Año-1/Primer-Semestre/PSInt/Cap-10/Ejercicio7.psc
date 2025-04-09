//Ejercicio 1: Diseñe un programa que permita ingresar una cadena de caracteres, y detecte cuántas vocales tiene

Proceso Ejercicio7
	Definir i,j,conteoVocales Como Entero;
	Definir frase,vocales como cadenas;
	
	Escribir Sin Saltar "Digite una cadena: ";
	Leer frase;
	
	//Pasamos la frase a minuscula
	frase <- Minusculas(frase);
	
	vocales <- "aeiou";
	conteoVocales <- 0;
	
	Para i<-0 Hasta (Longitud(frase)-1) Con Paso 1 Hacer
		Para j<-0 Hasta (Longitud(vocales)-1) Con Paso 1 Hacer
			Si (SubCadena(frase,i,i) = SubCadena(vocales,j,j)) Entonces
				conteoVocales <- conteoVocales + 1;
			FinSi
		FinPara
	FinPara
	
	Escribir "El numero de vocales en la cadena es: ",conteoVocales;
FinProceso
