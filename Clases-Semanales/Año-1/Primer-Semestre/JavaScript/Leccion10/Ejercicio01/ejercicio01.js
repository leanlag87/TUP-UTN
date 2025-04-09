//Ejercicio carlcular estacion del año

//Creamos las variables
let mes = 10; //Le asignamos un valor
let estacion; //Undefined

//Usamos el opedor or y el operador de igual para comparar
if (mes == 1 || mes == 2 || mes == 12) {
  estacion = "Verano";
} else if (mes == 3 || mes == 4 || mes == 5) {
  estacion = "Otoño";
} else if (mes == 6 || mes == 7 || mes == 8) {
  estacion = "Invierno";
} else if (mes == 9 || mes == 10 || mes == 11) {
  estacion = "Primavera";
} else {
  estacion = "Valor incorrecto";
}

//Mostramos el resultado por consola
console.log("El valor corresponde a la estacion: " + estacion);

//El mismo ejercicio con las estructura switch
switch (mes) {
  case 1:
  case 2:
  case 12:
    estacion = "Verano";
    break;
  case 3:
  case 4:
  case 5:
    estacion = "Otoño";
    break;
  case 6:
  case 7:
  case 8:
    estacion = "Invierno";
    break;
  case 9:
  case 10:
  case 11:
    estacion = "Primavera";
    break;
  default:
    estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estacion de : " + estacion);
