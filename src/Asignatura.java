/** Esta es la clase que esta extendida con Curso**/

public class Asignatura{
    /** Aqui he puesto el protected**/
    protected String nombre;
    /** Aqui he puesto el protected en el constructor**/

    protected Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura() {

    }
    /** Aqui he creado una clase al haber extendido la clase Profesor**/
    public Asignatura(String nombre, String especialidad) {
    }
}
