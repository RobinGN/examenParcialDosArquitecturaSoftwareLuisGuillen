public class Estudiante implements Usuario {
    private final String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public String getRol() { return "ESTUDIANTE"; }
    public boolean puedeAprobarPrestamos() { return false; }
}