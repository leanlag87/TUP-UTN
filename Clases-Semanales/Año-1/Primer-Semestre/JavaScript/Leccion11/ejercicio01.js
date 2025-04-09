// Ejercicio "Meses del año"

//array con los meses del año en español
const mesesDelAnioEspanol = [
  "Enero",
  "Febrero",
  "Marzo",
  "Abril",
  "Mayo",
  "Junio",
  "Julio",
  "Agosto",
  "Septiembre",
  "Octubre",
  "Noviembre",
  "Diciembre",
];

//array con los meses del año en ingles
const mesesDelAnioIngles = [
  "January",
  "February",
  "March",
  "April",
  "May",
  "June",
  "July",
  "August",
  "September",
  "October",
  "November",
  "December",
];

//función que toma un número y devuelve el nombre del mes correspondiente en español e inglés
function getMonth(n) {
  //Verificamos si el número está fuera del rango valido
  if (n < 1 || n > 12) {
    // Si el numero está fuera del rango, lanzamos un error
    throw new Error("out of range");
  }
  //Devolvemos el nombre del mes en español e ingles
  return {
    español: mesesDelAnioEspanol[n - 1],
    ingles: mesesDelAnioIngles[n - 1],
  };
}

// Llamamos a la funcion y mostramos el resultado en la consola
const mes = getMonth(4);
console.log(`En español: ${mes.español}, en ingles: ${mes.ingles}`);
