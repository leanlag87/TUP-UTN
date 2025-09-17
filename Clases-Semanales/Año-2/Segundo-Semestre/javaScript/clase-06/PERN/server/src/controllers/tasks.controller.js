// Controlador para las tareas

import { pool } from "../db.js";

export const getTasks = (req, res) => res.send("Obteniendo tareas");

export const getTaskById = (req, res) =>
  res.send("Obteniendo tarea con ID: " + req.params.id);

export const createTask = async (req, res, next) => {
  const { title, description } = req.body;

  try {
    const result = await pool.query(
      "INSERT INTO tasks (title, description) VALUES ($1, $2) RETURNING *",
      [title, description]
    );
    res.json(result.rows[0]);
    console.log(result);
    // res.send("Creando tarea");
  } catch (error) {
    if (error.code === "23505") {
      return res.status(409).json({ message: "La tarea ya existe" });
    }
    console.error(error);
    next(error); // Pasar el error al middleware de manejo de errores
  }
};

export const updateTask = (req, res) =>
  res.send(
    "Actualizando tarea con ID: " +
      req.params.id +
      ", Nuevos datos: " +
      JSON.stringify(req.body)
  );

export const deleteTask = (req, res) =>
  res.send("Eliminando tarea con ID: " + req.params.id);
