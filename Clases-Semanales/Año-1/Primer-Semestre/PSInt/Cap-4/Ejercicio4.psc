//Ejercicio 4:
// Un profesor prepara tres cuestionarios para una evaluación final: A, B y C. 
//Se sabe que se tarda 5 minutos en revisar el cuestionario A, 8 en revisar el cuestionario B y 6 en el C. 
//La cantidad de exámenes de cada tipo se entran por teclado. 
//¿Cuántas horas y cuántos minutos se tardará en revisar todas las evaluaciones? 

Proceso Ejercicio4
	
    Definir cantidad_A, cantidad_B, cantidad_C Como Entero;
	Definir tiempo_A, tiempo_B, tiempo_C Como Entero;
    Definir tiempo_total_minutos, horas, minutos_restantes Como Entero;
    
    
    // Solicitar al usuario la cantidad de cada tipo de evaluación
    Escribir "Ingrese la cantidad de cuestionarios A:";
    Leer cantidad_A;
    Escribir "Ingrese la cantidad de cuestionarios B:";
    Leer cantidad_B;
    Escribir "Ingrese la cantidad de cuestionarios C:";
    Leer cantidad_C;
    
    // Calcular el tiempo total en minutos
    tiempo_A <- cantidad_A * 5;
    tiempo_B <- cantidad_B * 8;
    tiempo_C <- cantidad_C * 6;
    tiempo_total_minutos <- tiempo_A + tiempo_B + tiempo_C;
    
    // Convertir minutos a horas y minutos
	horas <- trunc(tiempo_total_minutos / 60);
	minutos_restantes <- tiempo_total_minutos mod 60; 
	
    
    // Mostrar resultados
    Escribir "El tiempo total de revisión es: ",horas, " horas y ",minutos_restantes, " minutos.";
FinProceso
