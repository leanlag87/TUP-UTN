import { Link, useLocation } from "react-router-dom";
import { PrivateRoutes, PublicRoutes } from "./navigation";
import { Container } from "../ui";
import { useAuth } from "../../hooks/useAuth";
import { twMerge } from "tailwind-merge";

const Navbar = () => {
  const location = useLocation();
  const { isAuth, signout } = useAuth();
  return (
    <nav className="bg-zinc-950">
      <Container className="flex justify-between items-center py-3">
        <Link to="/">
          <h1 className="text-white font-bold text-2xl">PERN App</h1>
        </Link>
        <ul className="flex gap-4 ml-auto p-4">
          {isAuth ? (
            <>
              {PrivateRoutes.map(({ name, path }) => (
                <li
                  className={twMerge(
                    "text-slate-300 items-center flex px-3 py-1 rounded-md",
                    location.pathname === path && "bg-sky-500rounded-md"
                  )}
                  key={name}
                >
                  <Link to={path}>{name}</Link>
                </li>
              ))}
              <li
                onClick={() => signout()}
                className="text-slate-200 cursor-pointer items-center flex px-3 px-1 hover:cursor-pointer rounded-md hover:bg-red-600"
              >
                Cerrar Sesión
              </li>
            </>
          ) : (
            PublicRoutes.map(({ name, path }) => (
              <li
                key={name}
                className={twMerge(
                  "text-slate-300 items-center flex px-3 py-1 rounded-md",
                  location.pathname === path && "bg-sky-500 rounded-md"
                )}
              >
                <Link to={path}>{name}</Link>
              </li>
            ))
          )}
        </ul>
      </Container>
    </nav>
  );
};

export default Navbar;
