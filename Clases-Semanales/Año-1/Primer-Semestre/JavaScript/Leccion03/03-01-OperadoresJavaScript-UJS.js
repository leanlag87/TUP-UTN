//Ejercicio para encontrar numeros pares.

let parImpar = 10;
if (parImpar % 2 == 0) {
  console.log("Es un numero PAR");
} else {
  console.log("Es un numero IMPAR");
}

//Ejercicio: es mayor de edad
let edad = 20,
  adulto = 18;
if (edad >= adulto) {
  console.log("Usted es una persona adulta");
} else {
  console.log("Usted es una persona menor de edad");
}

//Ejercicio dentro de un rango
let dentroRango = 5; //Aqui vamos a ir cambiando el valor
let vaelMin = 0,
  valMax = 20;

if (dentroRango >= vaelMin && dentroRango <= valMax) {
  console.log("El número está dentro del rango");
} else {
  console.log("El número está fuera del rango");
}
