//Creamos funciones para llamarlas entre ellas
function miFuncion1() {
  console.log("Hola soy la función 1");
}

function miFuncion2() {
  console.log("Hola soy la función 2");
}

miFuncion1();
miFuncion2();

//Funciones de tipo Callback
function imprimir(mensaje) {
  console.log(mensaje);
}

function sumar(a, b, funcionCallback) {
  let resultado = a + b;
  funcionCallback(`Resultado: ${resultado}`);
}

//Llamamos a la función sumar y le pasamos la función imprimir como callback
sumar(5, 10, imprimir);

//LLamadas asincronas con uso de setTimeout
function miFuncionCallback() {
  console.log("Saludos asincrono despues de 3 segundos");
}

setTimeout(miFuncionCallback, 3000); //Llamamos a la función miFuncionCallback después de 3 segundos

//Ejemplo de setTimeout con una función anónima
setTimeout(function () {
  console.log("Saludos asincrono con función anónima después de 5 segundos");
}, 5000); //Llamamos a la función anónima después de 5 segundos

//Ejemplo de setTimeout con una función de flecha
setTimeout(() => {
  console.log("Saludos asincrono con función de flecha después de 6 segundos");
}, 6000); //Llamamos a la función de flecha después de 6 segundos

//Ejemplo con un reloj
const reloj = () => {
  let fecha = new Date();
  console.log(
    `La hora es: ${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`
  );
};

//Con la funcion setInterval llamamos a la función reloj cada segundo
setInterval(reloj, 1000); //Llamamos a la función reloj cada segundo
