//Ejercicio 1: Diseñar un algoritmo que pida un nombre al usuario y que despliegue en pantalla el nombre entre asteriscos. La cantidad de asteriscos debe ser la misma que caracteres en el nombre incluido espacios

//Procedimiento para pedir el nombre
SubProceso pedirDatos(nombre Por Referencia) //Parametro
	Escribir Sin Saltar "Digite su nombre: ";
	Leer nombre;
FinSubProceso
//Procedimiento para poner el nombre entre asteriscos
SubProceso copiarNombre(nombre)
	Definir tamanio,i Como Entero;
	tamanio <- Longitud(nombre);
	//Primera fila de asteriscos
	Para i<-1 Hasta tamanio Con Paso 1 Hacer
		Escribir Sin Saltar "*";
	FinPara
	Escribir "";
	Escribir nombre;
	//Segunda fila de asteriscos
	Para i<-1 Hasta tamanio Con Paso 1 Hacer
		Escribir Sin Saltar "*";
	FinPara
FinSubProceso
Proceso Principal 
	Definir nombre Como cadena;
	pedirDatos(nombre);
	copiarNombre(nombre);
	Escribir "";
FinProceso
