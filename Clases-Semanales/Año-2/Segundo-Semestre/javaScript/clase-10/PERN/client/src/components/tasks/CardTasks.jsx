import { Card } from "../ui/Card";

export const CardTasks = ({ task }) => {
  return (
    <Card key={task.id}>
      <h1 className="text-2xl font-bold">{task.titulo}</h1>
      <p>{task.descripcion}</p>
    </Card>
  );
};
