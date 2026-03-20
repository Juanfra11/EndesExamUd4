public class Profesor extends Matricula {

    protected String nombre;
    protected String especialidad;

    protected Profesor(String nombre, String especialidad) {
        super(nombre, especialidad);
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
