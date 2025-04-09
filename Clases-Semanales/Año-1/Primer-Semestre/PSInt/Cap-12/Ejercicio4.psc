//Ejercicio 4: Escriba un subprograma nombrado cambio() que tenga un parámetro en número entero y seis parámetros de referencia en número entero nombrados cien, cincuenta, veinte, diez, cinco y uno, respectivamente. La función tiene que considerar el valor entero transmitido como una cantidad en dólares y convertir el valor en el número menor de billetes equivalentes. 

SubProceso pedirDatos(dolares Por Referencia) //Parametro
	Escribir Sin Saltar "Digite la cantidad de dolares: ";
	Leer dolares;
FinSubProceso

SubProceso cambio(dolares,cien Por Referencia,cincuenta Por Referencia,veinte Por Referencia,diez Por Referencia,cinco Por Referencia,uno Por Referencia)
	cien <- trunc(dolares/100);
	dolares <- dolares mod 100;
	cincuenta <- trunc(dolares/50);
	dolares <- dolares mod 50;
	veinte <- trunc(dolares/20);
	dolares <- dolares mod 20;
	diez <- trunc(dolares/10);
	dolares <- dolares mod 10;
	cinco <- trunc(dolares/5);
	uno <- dolares mod 5;
FinSubProceso

SubProceso mostrarDatos(cien,cincuenta,veinte,diez,cinco,uno)
	Escribir "";
	Escribir "La cantidad de billetes necesarios es: ";
	Escribir "Cien: ",cien;
	Escribir "Cincuenta: ",cincuenta;
	Escribir "Veinte: ",veinte;
	Escribir "Diez: ",diez;
	Escribir "Cinco: ",cinco;
	Escribir "Uno: ",uno;
FinSubProceso

Proceso Ejercicio4
	Definir dolares como real;
	Definir cien,cincuenta,veinte,diez,cinco,uno como enteros;
	
	//Primero pedimos la cantidad de dolares al usuario
	pedirDatos(dolares); //Argumento
	
	//Convertimos a billetes
	cambio(dolares,cien,cincuenta,veinte,diez,cinco,uno);
	
	//Mostramos los datos
	mostrarDatos(cien,cincuenta,veinte,diez,cinco,uno);
	
FinProceso
