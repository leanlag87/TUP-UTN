import { Button, Card, Input, Label } from "../components/ui";
import { Link } from "react-router-dom";
import { useForm } from "react-hook-form";
import { API_URL } from "../config/api";
import axios from "Axios";

const LoginPage = () => {
  const { register, handleSubmit } = useForm();

  const onSubmit = handleSubmit(async (data) => {
    console.log(data);
    // lógica para manejar el inicio de sesión
    const res = await axios.post(`${API_URL}/login`, data, {
      withCredentials: true,
    });
    console.log(res);
  });

  return (
    <div className="h-[calc(100vh-64px)] flex items-center justify-center">
      <Card>
        <h1 className="text-4xl font-bold my-2 text-center">Iniciar Sesión</h1>

        <form onSubmit={onSubmit} className="flex flex-col gap-2 w-80">
          <Label htmlFor="email">Correo Electrónico</Label>
          <Input
            type="email"
            placeholder="Ingrese su correo"
            {...register("email", { required: true })}
          />
          <Label htmlFor="password">Contraseña</Label>
          <Input
            type="password"
            placeholder="Ingrese su contraseña"
            {...register("password", { required: true })}
          />
          <Button type="submit" className="mt-4 text-center">
            Ingresar
          </Button>
        </form>
        <div className="flex justify-between items-center my-4">
          <p>¿No tienes una cuenta? </p>
          <Link
            to="/register"
            className="text-sm text-blue-500 hover:no-underline"
          >
            Regístrarte
          </Link>
        </div>
      </Card>
    </div>
  );
};

export default LoginPage;
