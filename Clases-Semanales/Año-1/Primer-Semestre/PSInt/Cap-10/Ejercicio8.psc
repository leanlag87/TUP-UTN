// Ejercicio 2: Calcular la longitud de 2 cadenas de caracteres, y mostrar la cadena con la mayor longitud
Proceso Ejercicio8
	Definir frase1, frase2 Como Cadena;
	Escribir 'Digite una cadena: ';
	Leer frase1;
	Escribir 'Digite otra cadena: ';
	Leer frase2;
	Escribir '';
	Si Longitud(frase1)=Longitud(frase2) Entonces
		Escribir 'Ambas cadenas tienen la misma longitud';
	SiNo
		Si Longitud(frase1)>Longitud(frase2) Entonces
			Escribir frase1;
			Escribir 'Su longitud es: ', Longitud(frase1);
		SiNo
			Escribir frase2;
			Escribir 'Su longitud es: ', Longitud(frase2);
		FinSi
	FinSi
FinProceso
