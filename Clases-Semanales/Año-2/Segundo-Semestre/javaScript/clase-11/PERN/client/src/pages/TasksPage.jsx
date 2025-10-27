import { useEffect } from "react";
import { CardTasks } from "../components/tasks/CardTasks";
import { useTasks } from "../context/TasksContext";

export const TasksPage = () => {
  const { tasks, getTasks } = useTasks();

  useEffect(() => {
    getTasks();
  }, [getTasks]);

  if (tasks.length === 0) {
    return (
      <div className="flex justify-center items-center h-[calc(100vh-10rem)]">
        <h1 className="text-3xl font-bold">No hay tareas </h1>
      </div>
    );
  }

  return (
    <div className="grid grid-cols-3 gap-2">
      {tasks.map((task) => (
        <CardTasks key={task.id} task={task} />
      ))}
    </div>
  );
};
