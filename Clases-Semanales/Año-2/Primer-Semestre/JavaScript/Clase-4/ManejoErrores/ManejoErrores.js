"use strict";

try {
  let x = 10;
  //miFuncion();
  throw "Mi Error Personalizado";
} catch (error) {
  console.log(error);
} finally {
  console.log("Esto se ejecuta siempre");
}

console.log("Continuamos...");

///==========================================///

//let resultado = 5;
let resultado = -5;
//let resultado = "";

try {
  //Creamos un if para comoprobar que es un numero con isNaN
  if (isNaN(resultado)) throw "El resultado no es un número";
  //con el throw lanzamos un error si no es un número
  else if (resultado === "") throw "El resultado es una cadena vacía";
  else if (resultado >= 0) throw "El resultado es un número positivo";
  else if (resultado < 0) throw "El resultado es un número negativo";
} catch (error) {
  console.log(error);
  console.log(error.name);
  console.log(error.message);
} finally {
  console.log("Termina la revisión de errores");
}
