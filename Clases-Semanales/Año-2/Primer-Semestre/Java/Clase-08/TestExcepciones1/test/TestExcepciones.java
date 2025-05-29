package test;

public class TestExcepciones {
   public static void main(String[] args) {
      int resultado = 0;
      try {
         resultado = 10 / 0; // Esto generará una excepción de división por cero
      } catch (Exception e) {
         System.out.println("Ocurrio un ERROR");
         e.printStackTrace(System.out); // Se conoce como la pila de excepciones
      }

      System.out.println("La variable de resultado tiene como valor: " + resultado);
   }
}
