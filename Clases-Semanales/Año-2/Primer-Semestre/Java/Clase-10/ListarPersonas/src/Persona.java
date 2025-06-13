public class Persona {

    // Creamos los atributos de la clase Persona
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    // Creamos un constructor vacion para el id persona
    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    // Constructor con parámetros (sobre carga de constructores)
    public Persona(String nombre, String tel, String email) {
        this(); // Llamamos al constructor vacío para asignar el id
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;

    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para mostrar los datos de la persona
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", tel=" + tel + ", email=" + email + "]";
    }
}