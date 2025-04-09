/*
Ejerrcicio hora del dia
de 6 a 11 nos saluda: Good morning/Buenos dias
de 12 a 16 nos saluda: Good afternom/Buenas tardes
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good nigth/Buenas noches
*/

//Declaramos las variables
let horaDia = 20;
let mensaje;

// Estructura condicional utilizando el operador logico "And"
if (horaDia >= 6 && horaDia <= 11) {
  mensaje = "Estoy Desayunando";
} else if (horaDia >= 12 && horaDia <= 16) {
  mensaje = "Estoy trabajando";
} else if (horaDia >= 17 && horaDia <= 19) {
  mensaje = "Estoy estudiando o en clases";
} else if (horaDia >= 20 && horaDia <= 23) {
  mensaje = "Estoy en el Gym y luego cenando";
} else {
  // Si la hora no está dentro de ninguno de los rangos, se mostrara el mensaje
  mensaje = "Valor incorrecto";
}

//Mostramos el resultado por consola
console.log(mensaje);
