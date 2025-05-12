//LLamo a mi funcion antes de declararla
miFuncion();

//Declaracion de la funcion
function miFuncion() {
  console.log("Hola desde mi funcion");
}

//Creamos una funcion anonima
const miFuncionAnonima = function () {
  console.log("Hola desde mi funcion anonima");
};

//Comenzamos con las funciones flecha
const miFuncionFlecha = () => {
  console.log("Hola desde mi funcion flecha");
};

//Llamo a mi funcion flecha, no se puede llamar antes de declararla
miFuncionFlecha();

//Creamos un funcion fleche en una sola linea
const saludar = () => console.log("Desde mi funcion flecha en una sola linea");

console.log(saludar); //Llamo a mi funcion flecha en una sola linea

//Ejempmplo de una funcion flecha que retorna
const saludar2 = () => {
  return "Hola desde mi funcion flecha en una sola linea";
};

console.log(saludar2());

//Ejemplo de una funcion flecha que retorna un objeto
const retornaObjeto = () => ({
  nombre: "Juan",
  apellido: "Perez",
});
console.log(retornaObjeto());

//Ejemplo de una funcion flecha que recibe un parametro
const funcionParametros = (mensaje) => console.log(mensaje);
funcionParametros("Hola desde mi funcion flecha con parametro");

//funcion clasica que recibe un parametro
funcionClasica = function (mensaje) {
  console.log(mensaje);
};
funcionClasica("Hola desde mi funcion clasica con parametro");

//Funcion flecha con sintaxis simplificada
const funcionConParametros = (mensaje) => console.log(mensaje);
funcionConParametros("Hola desde mi funcion flecha con parametro");

//Funcion flecha con varios parametros
const funcionVariosParametros = (op1, op2) => op1 + op2;
console.log(funcionVariosParametros(5, 10));
