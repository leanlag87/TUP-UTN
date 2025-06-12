//Seleccionamos los elementos del DOM
const btnPersonajeJugador = document.getElementById("btn-personaje");
const btnPuño = document.getElementById("btn-puño");
const btnPatada = document.getElementById("btn-patada");
const btnBarrida = document.getElementById("btn-barrida");
const btnReiniciar = document.getElementById("btn-reiniciar");

// Variables para el conteo
let triunfos = 0;
let derrotas = 0;

// Función para mostrar/ocultar reglas
function toggleReglas() {
  const contenidoReglas = document.getElementById("contenido-reglas");
  const btnReglas = document.getElementById("btn-reglas");

  if (contenidoReglas.style.display === "none") {
    contenidoReglas.style.display = "block";
    btnReglas.textContent = "🔼 Ocultar Reglas";
  } else {
    contenidoReglas.style.display = "none";
    btnReglas.textContent = "📋 Ver Reglas del Juego";
  }
}

// Función para elegir aleatoriamente el personaje del enemigo
function aleatoria() {
  const personajes = ["Zuko", "Katara", "Toph", "Aang"];
  const indiceAleatorio = Math.floor(Math.random() * personajes.length);
  return personajes[indiceAleatorio];
}

// Función para elegir ataque aleatorio del enemigo
function ataqueAleatorioEnemigo() {
  const ataques = ["puño", "patada", "barrida"];
  const indiceAleatorio = Math.floor(Math.random() * ataques.length);
  return ataques[indiceAleatorio];
}

// Función de combate
function combate(ataqueJugador, ataqueEnemigo) {
  // Combate
  if (ataqueEnemigo === ataqueJugador) {
    return "EMPATE";
  } else if (ataqueJugador === "puño" && ataqueEnemigo === "barrida") {
    triunfos++;
    return "GANASTE";
  } else if (ataqueJugador === "patada" && ataqueEnemigo === "puño") {
    triunfos++;
    return "GANASTE";
  } else if (ataqueJugador === "barrida" && ataqueEnemigo === "patada") {
    triunfos++;
    return "GANASTE";
  } else {
    derrotas++;
    return "PERDISTE";
  }
}

//Creamos uuna funcion para seleccionar el personaje del jugador
function seleccionarPersonajeJugador() {
  // Obtenemos el valor del personaje seleccionado
  const personajeSeleccionado = document.querySelector(
    'input[name="personaje"]:checked'
  );
  if (personajeSeleccionado) {
    const personajeNombre = personajeSeleccionado.labels[0].innerText;

    // Actualizamos el span con el nombre del personaje
    document.getElementById("personaje-jugador").innerText = personajeNombre;

    // Seleccionamos el personaje enemigo usando la función aleatoria
    const personajeEnemigo = aleatoria();

    // Actualizamos el span con el nombre del personaje enemigo
    document.getElementById("personaje-enemigo").innerText = personajeEnemigo;
  } else {
    alert("No has seleccionado un personaje");
  }
}

//Funcion para manejar ataques
function ataque(tipoAtaque) {
  const personajeJugador =
    document.getElementById("personaje-jugador").innerText;
  const personajeEnemigo =
    document.getElementById("personaje-enemigo").innerText;

  if (personajeJugador && personajeEnemigo) {
    // El enemigo elige un ataque aleatorio
    const ataqueEnemigo = ataqueAleatorioEnemigo();

    // Determinamos el resultado del combate
    const resultado = combate(tipoAtaque, ataqueEnemigo);

    // Creamos el mensaje completo
    const mensaje = `Tu personaje ${personajeJugador} atacó con ${tipoAtaque}, el personaje del enemigo ${personajeEnemigo} atacó con ${ataqueEnemigo} ${resultado}`;

    // nuevo párrafo para el historial
    const nuevoParrafo = document.createElement("p");
    nuevoParrafo.innerText = mensaje;

    // Agregar al historial usando appendChild
    document.getElementById("mensajes").appendChild(nuevoParrafo);
  } else {
    alert("Debes seleccionar un personaje antes de atacar");
  }
}

//Funciones para los ataques específicos
function ataquePuño() {
  ataque("puño");
}

function ataquePatada() {
  ataque("patada");
}

function ataqueBarrida() {
  ataque("barrida");
}

//Función para reiniciar el juego
function reiniciarJuego() {
  // Limpiamos los spans de los personajes
  document.getElementById("personaje-jugador").innerText = "";
  document.getElementById("personaje-enemigo").innerText = "";

  // Limpiamos el mensaje de ataque
  document.getElementById("mensajes").innerHTML = "";

  // Reiniciamos la selección de personajes
  const personajes = document.querySelectorAll('input[name="personaje"]');
  personajes.forEach((personaje) => (personaje.checked = false));
}

//Agreamos los eventos a los botones y funciones
btnPersonajeJugador.addEventListener("click", seleccionarPersonajeJugador);
btnPuño.addEventListener("click", ataquePuño);
btnPatada.addEventListener("click", ataquePatada);
btnBarrida.addEventListener("click", ataqueBarrida);
btnReiniciar.addEventListener("click", reiniciarJuego);
