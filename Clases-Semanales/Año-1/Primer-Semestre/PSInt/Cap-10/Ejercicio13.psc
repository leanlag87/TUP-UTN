//Ejercicio 7: Ingresar una frase y modificarla convirtiendo el primer car�cter de cada palabra si esta fuera una letra, de min�sculas a may�sculas

Proceso Ejercicio13
	Definir i Como Entero;
	Definir frase,frase2 como cadenas;
	
	Escribir "Digite una cadena: ";
	Leer frase;
	
	frase2 <- ""; 
	
	//Transformas el primer caracter a mayuscula
	frase2 <- Concatenar(frase2, Mayusculas(Subcadena(frase,0,0)));
	
	i <-  1;
	
	Mientras i<Longitud(frase) Hacer
		Si Subcadena(frase,i,i) <> " " Entonces
			frase2 <- Concatenar(frase2,Subcadena(frase,i,i));
			i <- i + 1;
		SiNo
			Mientras Subcadena(frase,i,i) = " " Hacer
				frase2 <- Concatenar(frase2, " ");
				i <- i + 1;
			FinMientras
			frase2 <- Concatenar(frase2,Mayusculas(Subcadena(frase,i,i)));
			i <- i + 1;
		FinSi
	FinMientras
	
	frase <- frase2;
	Escribir frase;
	
FinProceso
