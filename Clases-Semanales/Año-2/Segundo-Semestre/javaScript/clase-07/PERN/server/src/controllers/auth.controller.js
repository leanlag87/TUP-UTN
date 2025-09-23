import { pool } from "../db.js";

// Controlador para la autenticación

export const login = (req, res) =>
  res.send("Iniciando sesión con datos: " + JSON.stringify(req.body));

export const register = (req, res) => {
  const { name, email, password } = req.body;
  res.send(`Registrando usuario: ${name}, Email: ${email}`);

  pool.query("INSERT INTO users (name, email, password) VALUES ($1, $2, $3)", [
    name,
    email,
    password,
  ]);
};

export const logout = (req, res) => res.send("Cerrando sesión");

export const getProfile = (req, res) =>
  res.send("Obteniendo perfil de usuario");
