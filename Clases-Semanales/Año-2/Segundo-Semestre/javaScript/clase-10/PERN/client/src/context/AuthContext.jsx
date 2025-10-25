/* eslint-disable react-refresh/only-export-components */
import { createContext, useState, useContext } from "react";
import { API_URL } from "../config/api";
import axios from "Axios";

export const AuthContext = createContext();

// Hook personalizado para usar el contexto
export const useAuth = () => {
  const context = useContext(AuthContext);
  if (!context) {
    throw new Error("useAuth debe ser usado dentro de un AuthProvider");
  }
  return context;
};

export const AuthProvider = ({ children }) => {
  const [user, setUser] = useState(null);
  const [isAuth, setIsAuth] = useState(false);
  const [error, setError] = useState(null);

  const signin = async (data) => {
    const res = await axios.post(`${API_URL}/login`, data, {
      withCredentials: true,
    });
    console.log(res.data);
    setUser(res.data.user);
  };

  const signup = async (data) => {
    const res = await axios.post(`${API_URL}/register`, data, {
      withCredentials: true,
    });

    console.log(res.data);
    setUser(res.data.user);
  };

  return (
    <AuthContext.Provider
      value={{
        user,
        isAuth,
        error,
        signup,
        signin,
        setUser,
        setIsAuth,
        setError,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
};
