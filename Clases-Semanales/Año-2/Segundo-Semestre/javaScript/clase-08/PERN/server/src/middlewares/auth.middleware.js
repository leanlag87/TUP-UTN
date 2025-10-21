export const isAuth = (req, res, next) => {
  console.log(req.headers);
  console.log("Middleware de autenticación ejecutado");
  next();
};
