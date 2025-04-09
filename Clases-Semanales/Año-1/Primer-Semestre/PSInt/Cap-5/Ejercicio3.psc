// Ejercicio3:
// En un almacén se hace un 20 MOD  de descuento a los clientes cuya compra supere los $100. 
// ¿Cuál será la cantidad que pagará una persona por su compra? 
Proceso Ejercicio3
	Definir compra, descuento, precio_final Como Real;
	// Solicitar al usuario el monto
	Escribir 'Digite la cantidad a pagar: ';
	Leer compra;
	Si compra>100 Entonces
		descuento <- compra*0.2;
	SiNo // Si la compra supera los 100
		descuento <- 0;
	FinSi // Si la compra no supera los 100
	precio_final <- compra-descuento;
	Escribir 'El precio a pagar es: US$', precio_final;
FinProceso
