import { Button, Card, Input, Label } from "../components/ui";
import { Link } from "react-router-dom";

const LoginPage = () => {
  return (
    <div className="h-[calc(100vh-64px)] flex items-center justify-center">
      <Card>
        <h1 className="text-4xl font-bold my-2 text-center">Iniciar Sesión</h1>

        <form className="flex flex-col gap-2 w-80">
          <Label htmlFor="email">Correo Electrónico</Label>
          <Input
            type="email"
            id="email"
            placeholder="Ingrese su correo"
            required
          />
          <Label htmlFor="password">Contraseña</Label>
          <Input
            type="password"
            id="password"
            placeholder="Ingrese su contraseña"
            required
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
