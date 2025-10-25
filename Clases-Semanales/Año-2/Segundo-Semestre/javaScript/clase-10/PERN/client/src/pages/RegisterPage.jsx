import { useForm } from "react-hook-form";
import { Button, Card, Input, Label } from "../components/ui";
import { API_URL } from "../config/api";
import axios from "Axios";
import { Link } from "react-router-dom";

const RegisterPage = () => {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();

  // Función que se ejecuta al enviar el formulario hace la petición al backend
  const onSubmit = handleSubmit(async (data) => {
    // console.log(data);
    // const response = await fetch(`${API_URL}/register`, {
    //   credentials: "include",
    //   method: "POST",
    //   body: JSON.stringify(data),
    //   headers: {
    //     "Content-Type": "application/json",
    //   },
    // });
    // const json = await response.json();

    //Todo lo de arriba hecho con "fetch" lo reduciomos con estas lineas con Axios
    const res = await axios.post(`${API_URL}/register`, data, {
      withCredentials: true,
    });

    console.log(res);
  });

  return (
    <div className="flex flex-col items-center justify-center min-h-screen gap-4">
      <Card>
        <h3 className="text-4xl font-bold my-2">Registro</h3>
        <form
          className="flex flex-col gap-4 mt-4"
          onSubmit={handleSubmit(onSubmit)}
        >
          <Label htmlFor="name">Nombre</Label>
          <Input
            placeholder="Ingrese Su Nombre"
            {...register("name", { required: true })}
          />
          {errors.name && (
            <span className="text-red-500">Este campo es requerido</span>
          )}
          <Label htmlFor="email">Correo Electrónico</Label>
          <Input
            type="email"
            placeholder="Ingrese Su Correo "
            {...register("email", { required: true })}
          />
          {errors.email && (
            <span className="text-red-500">Este campo es requerido</span>
          )}
          <Label htmlFor="password">Contraseña</Label>
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
        <div className="flex justify-between items-center my-4">
          <p>Ya tienes una cuenta? </p>
          <Link
            to="/login"
            className="text-sm text-blue-500 hover:no-underline"
          >
            Iniciar Sesión
          </Link>
        </div>
      </Card>
    </div>
  );
};

export default RegisterPage;
