//Ejercicio5
//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto deberá pagar finalmente por su compra. 

Proceso Ejercicio5
	
	Definir precio, descuento, precio_final Como Real;
	
	// Solicitar al usuario el valor
	Escribir  "Digite el precio a pagar: ";
	Leer precio;
	
	// Calcular el valor ingresado y hacer el descuento
	descuento <- precio*0.15;
	precio_final <- precio - descuento;
	
	// Mostrar resultado
	Escribir "El precio a pagar es de: ",precio_final;
	
	
FinProceso
