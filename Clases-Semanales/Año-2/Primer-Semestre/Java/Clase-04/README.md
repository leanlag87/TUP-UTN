## Clase 4 Sobreescritura, Polimorfismo y instanceof

### Introducción

En esta clase se estudia la sobreescritura de métodos, el polimorfismo y el operador `instanceof`.

Se estudia la sobreescritura de métodos, el polimorfismo y el operador `instanceof`.

### Objetivos

- Entender la sobreescritura de métodos y su relación con el polimorfismo.
- Comprender el operador `instanceof` y su uso en la programación orientada a objetos.
- Entender el concepto de polimorfismo en la programación orientada a objetos.
- Aprender a utilizar el operador `instanceof` para verificar el tipo de un objeto en tiempo de ejecución.
- Aprender a utilizar la sobreescritura de métodos para implementar el polimorfismo en Java.
- Comprender la importancia de la sobreescritura en la programación orientada a objetos.
- Aprender a utilizar el operador `instanceof` para verificar el tipo de un objeto en tiempo de ejecución.
- Aprender a utilizar la sobreescritura de métodos para implementar el polimorfismo en Java.
- Comprender la importancia de la sobreescritura en la programación orientada a objetos.
- Aprender a utilizar el operador `instanceof` para verificar el tipo de un objeto en tiempo de ejecución.
- Aprender a utilizar la sobreescritura de métodos para implementar el polimorfismo en Java.
- Comprender la importancia de la sobreescritura en la programación orientada a objetos.

## Ejemplo de sobreescritura de métodos y polimorfismo

```java
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido(); // El animal hace un sonido.
        miPerro.hacerSonido();  // El perro ladra.
        miGato.hacerSonido();   // El gato maulla.

        // Polimorfismo
        hacerSonidoAnimal(miPerro); // El perro ladra.
        hacerSonidoAnimal(miGato);  // El gato maulla.
    }

    public static void hacerSonidoAnimal(Animal animal) {
        animal.hacerSonido();
    }
}
```

### Explicación del código

- Se define una clase `Animal` con un método `hacerSonido()` que imprime un mensaje genérico.
- Se definen dos clases `Perro` y `Gato` que heredan de la clase `Animal` y sobreescriben el método `hacerSonido()` para imprimir un mensaje específico.
- En la clase `Main`, se crean instancias de `Animal`, `Perro` y `Gato` y se llama al método `hacerSonido()` en cada una de ellas.
- Se demuestra el polimorfismo al llamar al método `hacerSonidoAnimal()` con diferentes tipos de objetos `Animal`, que invocan el método sobreescrito correspondiente a su tipo real.
- El método `hacerSonidoAnimal()` recibe un objeto de tipo `Animal` y llama al método `hacerSonido()`, que se resuelve en tiempo de ejecución al tipo real del objeto, demostrando el polimorfismo.
- El operador `instanceof` se puede utilizar para verificar el tipo de un objeto en tiempo de ejecución, lo que permite realizar acciones específicas según el tipo del objeto.

### Ejemplo de uso del operador instanceof

```java
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}


class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}


class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}


class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();

        if (miAnimal instanceof Perro) {
            System.out.println("miAnimal es un Perro.");
        } else if (miAnimal instanceof Gato) {
            System.out.println("miAnimal es un Gato.");
        } else {
            System.out.println("miAnimal es otro tipo de Animal.");
        }
    }
}
}
```

### Explicación del código

- Se define una clase `Animal` con un método `hacerSonido()` que imprime un mensaje genérico.
- Se definen dos clases `Perro` y `Gato` que heredan de la clase `Animal` y sobreescriben el método `hacerSonido()` para imprimir un mensaje específico.
- En la clase `Main`, se crea una instancia de `Animal` que en realidad es un objeto de tipo `Perro`.
- Se utiliza el operador `instanceof` para verificar si `miAnimal` es una instancia de `Perro` o `Gato`, y se imprime un mensaje correspondiente.
- El operador `instanceof` permite verificar el tipo de un objeto en tiempo de ejecución, lo que es útil para realizar acciones específicas según el tipo del objeto.
- El operador `instanceof` devuelve `true` si el objeto es una instancia de la clase especificada o de una subclase de esa clase, y `false` en caso contrario.
- El operador `instanceof` es útil para evitar errores de tipo en tiempo de ejecución y para realizar acciones específicas según el tipo del objeto.
- El operador `instanceof` también se puede utilizar para verificar si un objeto es una instancia de una interfaz, lo que permite realizar acciones específicas según la implementación de la interfaz.
- El operador `instanceof` es una herramienta poderosa en la programación orientada a objetos que permite verificar el tipo de un objeto en tiempo de ejecución y realizar acciones específicas según el tipo del objeto.

### Los pilares fundamentales de la programación orientada a objetos

- Abstracción: Se refiere a la capacidad de representar conceptos complejos mediante modelos simplificados. En Java, esto se logra mediante clases e interfaces que definen las características y comportamientos de los objetos.

- Encapsulamiento: Se refiere a la práctica de ocultar los detalles internos de un objeto y exponer solo lo necesario a través de una interfaz pública. En Java, esto se logra mediante modificadores de acceso (public, private, protected) y métodos getter y setter.

- Herencia: Se refiere a la capacidad de crear nuevas clases basadas en clases existentes, heredando sus propiedades y comportamientos. En Java, esto se logra mediante la palabra clave `extends` para heredar de una clase y `implements` para implementar interfaces.

- Polimorfismo: Se refiere a la capacidad de un objeto de tomar muchas formas. En Java, esto se logra mediante la sobreescritura de métodos y el uso del operador `instanceof` para verificar el tipo de un objeto en tiempo de ejecución. El polimorfismo permite que un objeto se comporte de diferentes maneras según su tipo real, lo que facilita la reutilización del código y la implementación de patrones de diseño.

- Composición: Se refiere a la práctica de construir objetos complejos a partir de objetos más simples. En Java, esto se logra mediante la creación de clases que contienen instancias de otras clases como atributos. La composición permite crear relaciones entre objetos y reutilizar código de manera efectiva.

- Delegación: Se refiere a la práctica de delegar responsabilidades a otros objetos. En Java, esto se logra mediante la creación de métodos que llaman a otros métodos de objetos relacionados. La delegación permite crear relaciones entre objetos y reutilizar código de manera efectiva.

- Interfaz: Se refiere a un contrato que define un conjunto de métodos que una clase debe implementar. En Java, esto se logra mediante la palabra clave `interface`. Las interfaces permiten definir comportamientos comunes entre diferentes clases y facilitan la reutilización del código.

- Clase abstracta: Se refiere a una clase que no se puede instanciar y que puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación). En Java, esto se logra mediante la palabra clave `abstract`. Las clases abstractas permiten definir comportamientos comunes entre diferentes clases y facilitan la reutilización del código.

### Ejemplo basico de POO con sus pilares fundamentales

```java
class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}


class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + getNombre() + " ladra.");
    }
}


class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + getNombre() + " maulla.");
    }
}


class Main {
    public static void main(String[] args) {
        Animal miPerro = new Perro("Rex", 5);
        Animal miGato = new Gato("Miau", 3);

        miPerro.hacerSonido(); // El perro Rex ladra.
        miGato.hacerSonido();  // El gato Miau maulla.

        System.out.println("El perro " + miPerro.getNombre() + " tiene " + miPerro.getEdad() + " años.");
        System.out.println("El gato " + miGato.getNombre() + " tiene " + miGato.getEdad() + " años.");
    }
}
```
