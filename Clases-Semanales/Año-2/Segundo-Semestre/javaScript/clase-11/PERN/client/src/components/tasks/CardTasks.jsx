import { Card, Button } from "../ui";
import { useTasks } from "../../context/TasksContext";
import { useNavigate } from "react-router-dom";
import { FaTrashRestore } from "react-icons/fa";
import { PiPencilSimpleBold } from "react-icons/pi";

export const CardTasks = ({ task }) => {
  const { deleteTask } = useTasks();
  const navigate = useNavigate();

  return (
    <Card key={task.id} className="py-4 px-7 justify-center flex flex-col ">
      <div>
        <h1 className="text-2xl font-bold">{task.titulo}</h1>
        <p className="py-4">{task.descripcion}</p>
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
          <FaTrashRestore className="inline-block mr-1 text-white" />
          Eliminar
        </Button>
        <Button onClick={() => navigate(`/tasks/edit/${task.id}`)}>
          <PiPencilSimpleBold className="inline-block mr-1 text-white" />
          Editar
        </Button>
      </div>
    </Card>
  );
};
