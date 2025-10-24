import React from "react";
import Input from "../components/ui/input";

const RegisterPage = () => {
  return (
    <div>
      <h3 className="text-2xl font-bold">RegisterPage</h3>

      <form>
        <Input placeholder="Ingrese Su Nombre" />
        <Input type="email" placeholder="Ingrese Su Correo " />
        <Input type="password" placeholder="Ingrese Su Contraseña" />

        <button>Registrarse</button>
      </form>
    </div>
  );
};

export default RegisterPage;
