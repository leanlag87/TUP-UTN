import { pool } from "../db.js";
import bcrypt from "bcrypt";

// Controlador para la autenticación

export const login = (req, res) =>
  res.send("Iniciando sesión con datos: " + JSON.stringify(req.body));

export const register = async (req, res) => {
  const { name, email, password } = req.body;

  try {
    // Hashear la contraseña antes de guardarla
    const hashedPassword = await bcrypt.hash(password, 10);
    console.log(hashedPassword);

    // Guardar el usuario en la base de datos
    const result = await pool.query(
      "INSERT INTO users (name, email, password) VALUES ($1, $2, $3) RETURNING *",
      [name, email, hashedPassword]
    );

    console.log(result);
    return res.json(result.rows[0]);
  } catch (error) {
    if (error.code === "23505") {
      // Código de error para violación de restricción única
      return res
        .status(400)
        .json({ error: "Error: El correo electrónico ya está en uso." });
    }
  }
};

export const logout = (req, res) => res.send("Cerrando sesión");

export const getProfile = (req, res) =>
  res.send("Obteniendo perfil de usuario");
