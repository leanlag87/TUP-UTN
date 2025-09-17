// Controlador para las tareas

import { pool } from "../db.js";

export const getTasks = (req, res) => res.send("Obteniendo tareas");

export const getTaskById = (req, res) =>
  res.send("Obteniendo tarea con ID: " + req.params.id);

export const createTask = async (req, res) => {
  const { title, description } = req.body;

  try {
    const { rows } = await pool.query(
      "INSERT INTO tasks (title, description) VALUES ($1, $2) RETURNING *",
      [title, description]
    );
    console.log(rows);
    res.send("Creando tarea");
  } catch (error) {
    console.log(error);
    res.status(500).send("Error al crear tarea");
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
