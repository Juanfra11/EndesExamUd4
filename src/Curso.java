import java.util.ArrayList;

public class Curso extends Asignatura{

    protected String nombre;
    protected ArrayList<Alumno> alumnos;
    protected ArrayList<Asignatura> asignaturas;
    protected ArrayList<Profesor> profesores;

    protected Curso(String nombre) {
        super(nombre);
        this.nombre = nombre;
        alumnos = new ArrayList<>();
        asignaturas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public void agregarAsignatura(Asignatura a) {
        asignaturas.add(a);
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void mostrarTodo() {
        System.out.println("CURSO: " + nombre);

        for (Alumno a : alumnos) {
            System.out.println("Alumno: " + a.nombre);
        }

        for (Asignatura as : asignaturas) {
            System.out.println("Asignatura: " + as.nombre);
        }

        for (Profesor p : profesores) {
            System.out.println("Profesor: " + p.nombre);
        }
    }
}
