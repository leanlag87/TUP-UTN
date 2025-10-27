import { useEffect } from "react";
import { CardTasks } from "../components/tasks/CardTasks";
import { useTasks } from "../context/TasksContext";

export const TasksPage = () => {
  const { tasks, getTasks } = useTasks();

  useEffect(() => {
    getTasks();
  }, []);

  return (
    <div className="grid grid-cols-3 gap-2">
      {tasks.map((task) => (
        <CardTasks key={task.id} task={task} />
      ))}
    </div>
  );
};
