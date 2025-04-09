//Ejercicio 5: Cambiar una cadena de caracteres, al revés 

Proceso Ejercicio11
	Definir i Como Entero;
	Definir frase,frase1 como cadena;
	
	Escribir Sin Saltar "Digite una cadena: ";
	Leer frase;
	
	frase1 <- "";
	
	Para i<-(Longitud(frase)-1) Hasta 0 Con Paso -1 Hacer
		frase1 <- Concatenar(frase1,SubCadena(frase,i,i));
	FinPara
	
	frase <- frase1;
	
	Escribir "La cadena al reves es: ",frase;
	
FinProceso
