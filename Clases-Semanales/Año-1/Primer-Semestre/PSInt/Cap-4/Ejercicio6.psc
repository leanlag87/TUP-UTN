//Ejercicio 6:
//Un alumno desea saber cuál será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:  
//55% del promedio de sus tres calificaciones parciales. 
//30% de la calificación del examen final. 
//15% de la calificación de un trabajo final. 

Proceso Ejercicio6

	Definir parcial1, parcial2, parcial3, promedio_parciales, notas_parcial, examen_final, nota_examen, nota_trabajo, nota_final_trabajo, nota_final Como Real;
	
	// Solicitar al usuario el valor
	Escribir "Digite las 3 notas de los parciales";
	
	Leer parcial1, parcial2, parcial3;
	
	promedio_parciales <- (parcial1+parcial2+parcial3)/3;
	notas_parcial <- promedio_parciales*0.55;
	
	// Solicitar al usuario el valor
	Escribir "Digite la nota del examen final: ";
	Leer examen_final;
	
	nota_examen <- examen_final * 0.3;
	
	// Solicitar al usuario el valor
	Escribir "Digite la nota del trabajo final: ";
	Leer nota_trabajo;
	
	// Calcular el valor ingresado y sacar el resultado final 
	nota_final_trabajo <- nota_trabajo * 0.15;
	nota_final <- notas_parcial + nota_examen + nota_final_trabajo;
	
	// Mostrar resultado
	Escribir "La calificacion final es: ",nota_final;

FinProceso
