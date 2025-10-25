import { useForm } from "react-hook-form";
import { Button, Card, Input } from "../components/ui";
import { API_URL } from "../config/api";

const RegisterPage = () => {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();

  // Función que se ejecuta al enviar el formulario hace la petición al backend
  const onSubmit = async (data) => {
    console.log(data);
    const response = await fetch(`${API_URL}/register`, {
      credentials: "include",
      method: "POST",
      body: JSON.stringify(data),
      headers: {
        "Content-Type": "application/json",
      },
    });
    const json = await response.json();
    console.log(json);
  };

  return (
    <div className="flex flex-col items-center justify-center min-h-screen gap-4">
      <Card>
        <h3 className="text-2xl font-bold">Registro</h3>
        <form
          className="flex flex-col gap-4 mt-4"
          onSubmit={handleSubmit(onSubmit)}
        >
          <Input
            placeholder="Ingrese Su Nombre"
            {...register("name", { required: true })}
          />
          {errors.name && (
            <span className="text-red-500">Este campo es requerido</span>
          )}
          <Input
            type="email"
            placeholder="Ingrese Su Correo "
            {...register("email", { required: true })}
          />
          {errors.email && (
            <span className="text-red-500">Este campo es requerido</span>
          )}
          <Input
            type="password"
            placeholder="Ingrese Su Contraseña"
            {...register("password", { required: true })}
          />
          {errors.password && (
            <span className="text-red-500">Este campo es requerido</span>
          )}

          <Button>Registrarse</Button>
        </form>
      </Card>
    </div>
  );
};

export default RegisterPage;
