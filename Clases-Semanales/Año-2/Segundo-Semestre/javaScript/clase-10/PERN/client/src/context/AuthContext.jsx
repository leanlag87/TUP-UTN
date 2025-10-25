import { createContext, useState } from "react";

const AuthContext = createContext();

export const AuthProvider = ({ children }) => {
  const [user, setUser] = useState(null);
  const [isAuth, setIsAuth] = useState(false);
  const [error, setError] = useState(null);

  return (
    <AuthContext.Provider
      value={{ user, setUser, isAuth, setIsAuth, error, setError }}
    >
      {children}
    </AuthContext.Provider>
  );
};
