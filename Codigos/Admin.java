public class Admin implements Usuario {
    private final String nombre;

    public Admin(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public String getRol() { return "ADMIN"; }
    public boolean puedeAprobarPrestamos() { return true; }
}