import { Card, Button } from "../ui";
import { useTasks } from "../../context/TasksContext";
import { useNavigate } from "react-router-dom";

export const CardTasks = ({ task }) => {
  const { deleteTask } = useTasks();
  const navigate = useNavigate();

  return (
    <Card key={task.id} className="py-4 px-7">
      <div>
        <h1 className="text-2xl font-bold">{task.titulo}</h1>
        <p>{task.descripcion}</p>
      </div>

      <div className="flex gap-x-2 justify-end">
        <Button
          className="bg-red-500 hover:bg-red-600"
          onClick={async () => {
            if (
              window.confirm("¿Estás seguro de que deseas eliminar esta tarea?")
            ) {
              // Lógica para eliminar la tarea
              await deleteTask(task.id);
            }
          }}
        >
          Eliminar
        </Button>
        <Button onClick={() => navigate(`/tasks/edit/${task.id}`)}>
          Editar
        </Button>
      </div>
    </Card>
  );
};
