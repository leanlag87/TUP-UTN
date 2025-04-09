//Ejercicio 4: Diseñe un algoritmo que elimine los espacios en blanco de un texto. 

Proceso Ejercicio10
	Definir frase,frase1 como cadena;
	Definir i Como Entero;
	
	Escribir Sin Saltar "Digite una cadena: ";
	Leer frase;
	
	i <- 0;
	frase1 <- "";
	
	Mientras (i<Longitud(frase)) Hacer
		Si SubCadena(frase,i,i) = " " Entonces
			i <- i + 1;
		SiNo
			frase1 <- Concatenar(frase1,SubCadena(frase,i,i));
			i <- i + 1;
		FinSi
	FinMientras
	
	frase <- frase1;
	Escribir "La cadena sin espacios es: ",frase;
	
FinProceso
