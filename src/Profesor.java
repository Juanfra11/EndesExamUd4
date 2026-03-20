/** Y aqui tambien me he equivocado y extendio ahora Profesor con asignatura**/

public class Profesor extends Asignatura {
    /** Aqui he puesto atributos en protected**/

    protected String nombre;
    protected String especialidad;
    /** Aqui he puesto en el constructor en protected**/

    protected Profesor(String nombre, String especialidad) {
        super(nombre, especialidad);
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
