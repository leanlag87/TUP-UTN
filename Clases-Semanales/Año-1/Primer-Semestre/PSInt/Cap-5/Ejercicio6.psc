// Ejercicio6:
// Una fruter�a ofrece las manzanas con descuento seg�n la siguiente tabla:  
// N�mero de kilos comprados 
// Determinar cu�nto pagar� una persona que compre manzanas en esa fruter�a. 
Proceso Ejercicio6
	Definir precioK, kilos, precio_inicial, descuento, precio_final Como Real;
	Escribir 'Cuanto cuesta el kilo de manzanas? ';
	Leer precioK;
	Escribir 'Cuantos kilos compraste? ';
	Leer kilos;
	precio_inicial <- precioK*kilos;
	Si kilos>=0 Y kilos<=2 Entonces
		descuento <- 0;
	SiNo
		Si kilos>=2.01 Y kilos<=5 Entonces
			descuento <- precio_inicial*0.1;
		SiNo
			Si kilos>=5.01 Y kilos<=10 Entonces
				descuento <- precio_inicial*0.15;
			SiNo
				descuento <- precio_inicial*0.2;
			FinSi
		FinSi
	FinSi
	precio_final <- precio_inicial-descuento;
	Escribir 'El precio a pagar es: US$', precio_final;
FinProceso
