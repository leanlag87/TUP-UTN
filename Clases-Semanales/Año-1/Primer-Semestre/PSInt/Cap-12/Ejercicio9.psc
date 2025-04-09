// Ejercicio 9: Implementar un subprograma recursivo que permita sumar los dígitos de un número. 
Proceso Ejercicio9
	Definir num Como Entero;
	// Pedimos el numero al usuario
	pedirDatos(num);
	// Sumamos los digitos del numero
	Escribir 'La suma es: ', sumarDigitos(num);
FinProceso

SubAlgoritmo pedirDatos(num por Referencia)
	Escribir 'Digite un numero: 'Sin Saltar;
	Leer num;
FinSubAlgoritmo

SubAlgoritmo retorno <- sumarDigitos(num)
	Definir retorno Como Entero;
	Si num=0 Entonces
		retorno <- num;
	SiNo
		retorno <- sumarDigitos(trunc(num/10))+(num MOD 10);
	FinSi
FinSubAlgoritmo
