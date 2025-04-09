Proceso EjercicioAnioBisiesto
	Definir num, opcion Como Entero;
	Escribir 'Comprobamos que anio es bisiesto';
	Repetir
		Escribir 'Ingrese el anio: ';
		Leer num;
		Si ((num MOD 4=0) Y (num MOD 100<>0) O num MOD 400=0) Entonces
			Escribir 'El anio es Bisiesto';
		SiNo
			Escribir 'El anio no es Bisiesto';
		FinSi
		Escribir 'Para seguir adelante digite la opcion 1: ';
		Leer opcion;
	Hasta Que opcion<>1
FinProceso
