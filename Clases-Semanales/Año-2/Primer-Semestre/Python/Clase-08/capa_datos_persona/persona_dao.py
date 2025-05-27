class PersonaDAO:
    """
    DAO (Data Access Object) para manejar operaciones de base de datos relacionadas con la entidad Persona.
    CRUD:   Create: insertar
            Read: seleccionar
            Update: actualizar
            Delete: eliminar
    
    """
    #Creamos las constantes para las operaciones CRUD
    _SELECCIONAR = "SELECT * FROM persona ORDER BY id_persona"
    _INSERTAR = "INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)"
    _ACTUALIZAR = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
    _ELIMINAR = "DELETE FROM persona WHERE id_persona=%s"