public class Profesor extends Matricula {

    public String nombre;
    public String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre, especialidad);
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
