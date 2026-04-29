public class Bibliotecario implements Usuario {
    private final String nombre;

    public Bibliotecario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public String getRol() { return "BIBLIOTECARIO"; }
    public boolean puedeAprobarPrestamos() { return true; }
}