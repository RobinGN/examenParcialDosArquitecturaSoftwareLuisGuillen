public class SolicitudPrestamoBuilder {

    Estudiante estudiante;
    Libro libro;
    Date fechaDevolucion;
    String notasEspeciales = null;
    boolean renovacionAutomatica = false;
    int numRenovaciones = 1;

    public SolicitudPrestamoBuilder conEstudiante(Estudiante e) {
        this.estudiante = e;
        return this;
    }

    public SolicitudPrestamoBuilder conLibro(Libro l) {
        this.libro = l;
        return this;
    }

    public SolicitudPrestamoBuilder conFechaDevolucion(Date f) {
        this.fechaDevolucion = f;
        return this;
    }

    public SolicitudPrestamoBuilder conNotasEspeciales(String n) {
        this.notasEspeciales = n;
        return this;
    }

    public SolicitudPrestamoBuilder conRenovacionAutomatica(boolean r) {
        this.renovacionAutomatica = r;
        return this;
    }

    public SolicitudPrestamoBuilder conNumRenovaciones(int n) {
        this.numRenovaciones = n;
        return this;
    }

    public SolicitudPrestamo construir() {
        if (estudiante == null) throw new IllegalStateException("estudiante es obligatorio");
        if (libro == null)      throw new IllegalStateException("libro es obligatorio");
        if (fechaDevolucion == null) throw new IllegalStateException("fechaDevolucion es obligatoria");
        return new SolicitudPrestamo(this);
    }
}