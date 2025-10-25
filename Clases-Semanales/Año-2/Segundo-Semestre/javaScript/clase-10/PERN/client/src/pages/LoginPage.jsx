import { Button, Card, Input } from "../components/ui";

const LoginPage = () => {
  return (
    <div className="h-[calc(100vh-64px)] flex items-center justify-center">
      <Card>
        <h1 className="text-4xl font-bold my-2 text-center">Iniciar Sesión</h1>

        <form className="flex flex-col gap-4 w-80">
          <Input type="email" placeholder="Ingrese su correo" required />
          <Input type="password" placeholder="Ingrese su contraseña" required />
          <Button type="submit" className="mt-4">
            Ingresar
          </Button>
        </form>
      </Card>
    </div>
  );
};

export default LoginPage;
