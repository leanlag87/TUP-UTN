const AboutPage = () => {
  return (
    <div>
      <h1 className="text-center font-bold py-4 px-3 text-4xl">
        Tecnologias Utilizadas
      </h1>
      <h2 className="py-4 px-2 text-2xl">
        Proyecto de Gestión de Tareas - UTN 2025
      </h2>
      <h3 className="py-4 px-2">
        Bienvenido al proyecto de gestión de tareas desarrollado como parte del
        curso de Desarrollo de Aplicaciones Web en la Universidad Tecnológica
        Nacional (UTN). Esta aplicación permite a los usuarios crear, editar y
        gestionar sus tareas de manera eficiente.
      </h3>
      <h2 className="py-4 px-2 text-2xl">Configuracion del proyecto</h2>
      <h3 className="py-4 px-2">
        Este proyecto esta configurado con las siguientes tecnologias:
      </h3>
      <h2 className="py-4 px-2 text-2xl">Frontend</h2>
      <h3 className="py-4 px-2">
        Este proyecto utiliza React, Tailwind CSS y Vite como herramientas
        principales para el desarrollo del frontend. React es una biblioteca de
        JavaScript para construir interfaces de usuario, Tailwind CSS es un
        framework de CSS que facilita el diseño responsivo y Vite es una
        herramienta de construcción rápida para proyectos web modernos.
      </h3>
      <h2 className="py-4 px-2 text-2xl">Backend</h2>
      <h3 className="py-4 px-2">
        Este proyecto utiliza Node.js, Express y MongoDB como herramientas
        principales para el desarrollo del backend. Node.js es un entorno de
        ejecución para JavaScript en el servidor, Express es un framework para
        construir aplicaciones web y APIs en Node.js, y MongoDB es una base de
        datos NoSQL que permite almacenar datos de manera flexible y escalable.
      </h3>
    </div>
  );
};

export default AboutPage;
