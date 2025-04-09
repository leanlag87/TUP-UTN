// Ejercicio 2:
// Determinar si un alumno aprueba o reprueba un curso, 
// sabiendo que aprobará si su promedio de tres calificaciones es mayor o igual a 70; reprueba caso contrario. 
Proceso Ejercicio2
	Definir nota1, nota2, nota3, promedio Como Real;
	// Solicitar al usuario las notas
	Escribir 'Digite las 3 calificaciones: ';
	Leer nota1, nota2, nota3;
	promedio <- (nota1+nota2+nota3)/3;
	Si promedio>=70 Entonces
		Escribir 'El alumno es aprobado con: ', promedio;
	SiNo // Si las 3 notas son >= a 70 entra aqui
		Escribir 'El alumno esta desaprobado con: ', promedio;
	FinSi // Si las 3 notas son <= a 70 entra aqui
FinProceso
