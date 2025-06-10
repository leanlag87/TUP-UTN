// Creamos una promesa que se resuelve o se rechaza según una condición
let miPromesa = new Promise((resolve, reject) => {
  let expresion = true; // Cambia a false para probar el rechazo
  if (expresion) {
    resolve(" Se realizó con Éxito!");
  } else {
    reject("Se produjo un Error!");
  }
});

// Usamos then para manejar la resolución de la promesa
// miPromesa.then(
//   // Función que se ejecuta si la promesa se resuelve
//   (valor) => console.log(valor),
//   // Función que se ejecuta si la promesa se rechaza
//   (error) => console.log(error)
// );

//Ahora con catch para manejar el rechazo de la promesa
// miPromesa
//   .then((valor) => console.log(valor))
//   .catch((error) => console.log(error));

//Ahora hacemos el uso de la funcion setTimeout
let promesa = new Promise((resolve) => {
  setTimeout(
    () =>
      resolve(
        "Saludos desde la promesa, callback, funcion flecha y setTimeout"
      ),
    3000
  );
});

//Llamamos a la promesa
//promesa.then((valor) => console.log(valor));

//Ahora con async
//async indica que una funcion retorna una promesa
async function funcionAsync() {
  return "Saludos con promesas y async";
}

//Llamamos a la funcion async
//funcionAsync().then((valor) => console.log(valor));

//ahora con async y await
async function funcionAsyncAwait() {
  let miPromesa = new Promise((resolve) => {
    resolve("Promesa con await");
  });
  console.log(await miPromesa);
  // await espera a que la promesa se resuelva antes de continuar
}

//funcionAsyncAwait();

//Promesas, await, async y setTimeout
async function funcionConSetTimeout() {
  let miPromesa = new Promise((resolve) => {
    console.log("Inicio de funcion"); //se va a imprimir primero
    // setTimeout simula una operación asíncrona que se resuelve después de 3 segundos
    setTimeout(() => resolve("Saludos desde la promesa con setTimeout"), 3000);
    console.log("Fin de funcion"); //se va a imprimir segundo
  });
  console.log(await miPromesa); // await espera a que la promesa se resuelva antes de continuar
  // Esto se ejecuta después de que la promesa se resuelve
}

//Llamamos a la funcion con setTimeout
funcionConSetTimeout();
