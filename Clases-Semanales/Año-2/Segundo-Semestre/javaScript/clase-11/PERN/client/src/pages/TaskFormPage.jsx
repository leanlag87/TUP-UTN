import { Card, Input, TextArea, Label, Button } from "../components/ui";
import { useForm } from "react-hook-form";
import { useNavigate } from "react-router-dom";

import { useState } from "react";
import { useTasks } from "../context/TasksContext.jsx";

const TaskFormPage = () => {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();
  const navigate = useNavigate();
  const { postError, setPostError } = useState([]);
  const { createTask } = useTasks();

  const onSubmit = handleSubmit(async (data) => {
    const response = await createTask(data);
    if (response) {
      navigate("/tasks");
    } else {
      setPostError(["Error al crear la tarea"]);
    }
  });

  return (
    <div className="flex h-[80vh] justify-center items-center">
      <Card>
        {postError &&
          postError.map((error) => (
            <p key={error} className="bg-red-500 text-white p-2 mb-2">
              {error}
            </p>
          ))}

        <h1 className="text-3xl font-bold my-4">Formulario de Tareas</h1>
        <form onSubmit={onSubmit}>
          <Label htmlFor="titulo">Titulo</Label>
          <Input
            type="text"
            placeholder="Titulo"
            autoFocus
            {...register("titulo", { required: true })}
          />
          {errors.titulo && (
            <span className="text-red-500">El titulo es requerido</span>
          )}

          <Label htmlFor="descripcion">Descripción</Label>
          <TextArea
            placeholder="Descripción"
            rows={3}
            {...register("descripcion")}
          />

          <Button type="submit">Guardar</Button>
        </form>
      </Card>
    </div>
  );
};

export default TaskFormPage;
