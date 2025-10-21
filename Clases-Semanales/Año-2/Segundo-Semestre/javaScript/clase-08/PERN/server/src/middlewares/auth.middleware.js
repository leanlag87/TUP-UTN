export const isAuth = (req, res, next) => {
  console.log("Middleware de autenticación ejecutado");
  next();
};
