public class SolicitudPrestamo {
    private final Estudiante estudiante;
    private final Libro libro;
    private final Date fechaDevolucion;
    private final String notasEspeciales;
    private final boolean renovacionAutomatica;
    private final int numRenovaciones;

    private SolicitudPrestamo(SolicitudPrestamoBuilder builder) {
        this.estudiante = builder.estudiante;
        this.libro = builder.libro;
        this.fechaDevolucion = builder.fechaDevolucion;
        this.notasEspeciales = builder.notasEspeciales;
        this.renovacionAutomatica = builder.renovacionAutomatica;
        this.numRenovaciones = builder.numRenovaciones;
    }

    // Solo getters, ya que con no setters se puede mantener la inmutabilidad
}