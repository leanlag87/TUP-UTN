import { Link, useLocation } from "react-router-dom";
import { navigation } from "./navigation";
import { Container } from "../ui";

const Navbar = () => {
  const location = useLocation();

  return (
    <nav className="bg-zinc-950">
      <Container className="flex justify-between items-center py-3">
        <Link to="/">
          <h1 className="text-white font-bold text-2xl">PERN App</h1>
        </Link>
        <ul className="flex gap-4 ml-auto p-4">
          {navigation.map(({ name, path }) => (
            <li
              key={name}
              className={`text-slate-200 ${
                location.pathname === path && "bg-sky-500 px-3 py-1 rounded-md"
              }`}
            >
              <Link to={path}>{name}</Link>
            </li>
          ))}
        </ul>
      </Container>
    </nav>
  );
};

export default Navbar;
