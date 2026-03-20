public class Matricula{

    protected Alumno alumno;
    protected Asignatura asignatura;
    protected Profesor profesor;
    protected double nota;

    protected Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.nota = nota;
    }

    public Matricula() {

    }


    public Matricula(String nombre, String especialidad) {
    }

    public void mostrar() {
        System.out.println(alumno.nombre + " - " +
                asignatura.nombre + " - " +
                profesor.nombre + " - Nota: " + nota);
    }
}
