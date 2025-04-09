//Ejercicio3: Un maestro desea saber qué porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes.

Proceso Ejercicio3
	
    Definir hombres, mujeres, total_estudiantes Como Entero;
    Definir porcentaje_hombres, porcentaje_mujeres Como Real;
    
    // Solicitar al usuario el número de hombres y mujeres
    Escribir "Ingrese el número de hombres:";
    Leer hombres;
    Escribir "Ingrese el número de mujeres:";
    Leer mujeres;
    
    // Calcular el total de estudiantes
    total_estudiantes <- hombres + mujeres;
    
    // Calcular el porcentaje de hombres y mujeres
    porcentaje_hombres <- hombres / total_estudiantes * 100;
    porcentaje_mujeres <- mujeres / total_estudiantes * 100;
    
    // Mostrar resultados
    Escribir "Porcentaje de hombres:", porcentaje_hombres, "%";
    Escribir "Porcentaje de mujeres:", porcentaje_mujeres, "%";
	
FinProceso
