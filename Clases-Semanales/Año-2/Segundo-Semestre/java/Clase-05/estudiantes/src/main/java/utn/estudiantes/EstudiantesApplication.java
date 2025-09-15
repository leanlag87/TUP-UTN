package utn.estudiantes;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import utn.estudiantes.modelo.Alumnos2025;
import utn.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	// Inyectamos la dependencia del servicio de estudiantes
	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator(); // Nueva línea para formateo de logs

	public static void main(String[] args) {

		logger.info("Aplicacion de Estudiantes iniciada correctamente.");

		// Esta linea levanta el servidor de Spring Boot
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion de Estudiantes finalizada.");

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl + "Ejecutando el metodo run de Spring Boot..." + nl);
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir) {
			mostrarMenu();
			salir = ejecutarOpciones(consola);
			logger.info(nl + "============================" + nl);
		}
	}

	private void mostrarMenu() {
		logger.info(nl);
		logger.info("""
				===== Menu de Estudiantes 2025 =====
				1. Listar estudiantes
				2. Buscar estudiante
				3. Agregar nuevo estudiante
				4. Modificar estudiante
				5. Eliminar estudiante por ID
				6. Salir
				Ingrese una opcion:""");

	}

	private boolean ejecutarOpciones(Scanner consola) {
		var opcion = Integer.parseInt(consola.nextLine());
		var salir = false;
		switch (opcion) {
			case 1 -> {
				logger.info(nl + "Listado de estudiantes:");
				List<Alumnos2025> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach(estudiante -> logger.info(estudiante.toString() + nl));
			}

		}// Fin switch

		return salir;
	}

}