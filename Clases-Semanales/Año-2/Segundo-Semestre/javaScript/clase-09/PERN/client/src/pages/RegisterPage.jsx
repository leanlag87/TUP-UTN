import Input from "../components/ui/input";
import Card from "../components/ui/Card";
import Button from "../components/ui/Button";

const RegisterPage = () => {
  return (
    <div className="flex flex-col items-center justify-center min-h-screen gap-4">
      <Card>
        <h3 className="text-2xl font-bold">Registro</h3>
        <form>
          <Input placeholder="Ingrese Su Nombre" />
          <Input type="email" placeholder="Ingrese Su Correo " />
          <Input type="password" placeholder="Ingrese Su Contraseña" />

          <Button>Registrarse</Button>
        </form>
      </Card>
    </div>
  );
};

export default RegisterPage;
