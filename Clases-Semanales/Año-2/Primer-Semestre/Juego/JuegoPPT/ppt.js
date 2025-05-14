//1 sera piedra, 2 sera papel y 3 sera tijera

//funcion que genera un numero aleatorio entre 1 y 3
function randomNumber(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}

function eleccion(jugada) {
  let resultado = "";
  if (jugada === 1) {
    resultado = "Piedra";
  } else if (jugada === 2) {
    resultado = "Papel";
  } else if (jugada === 3) {
    resultado = "Tijera";
  } else {
    resultado = "Mal elegido";
  }
  return resultado;
}

let jugador = 0;
//generamos un numero aleatorio entre 1 y 3
let pc = 0;
let triunfos = 0;
let derrotas = 0;

while (triunfos < 3 && derrotas < 3) {
  pc = randomNumber(1, 3);
  jugador = prompt("Elige 1 para piedra, 2 para papel y 3 para tijera");

  alert("PC elige: " + eleccion(pc));
  alert("Tu elige: " + eleccion(jugador));

  //alert("El jugador ha elegido: " + jugador);

  //Combate
  if (pc === jugador) {
    alert("EMpPATE");
  } else if (jugador == 1 && pc == 3) {
    alert("GANASTE");
    triunfos++;
  } else if (jugador == 2 && pc == 1) {
    alert("GANASTE");
    triunfos++;
  } else if (jugador == 3 && pc == 2) {
    alert("GANASTE");
    triunfos++;
  } else {
    alert("PERDISTE");
    derrotas++;
  }
}

alert("Ganaste " + triunfos + " veces. Perdiste " + derrotas + " veces.");
