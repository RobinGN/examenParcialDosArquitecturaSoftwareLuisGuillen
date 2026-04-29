public class RegistrarPrestamoUseCase {

    private final RepositorioPrestamos repositorio;
    private final CatalogoBiblioteca catalogo;
    private final ServicioPagos pagos;

    public RegistrarPrestamoUseCase(RepositorioPrestamos repositorio,
                                    CatalogoBiblioteca catalogo,
                                    ServicioPagos pagos) {
        this.repositorio = repositorio;
        this.catalogo = catalogo;
        this.pagos = pagos;
    }

    public Prestamo ejecutar(SolicitudPrestamo solicitud) {
        Libro libro = catalogo.buscarLibro(solicitud.getLibro().getIsbn());
        pagos.cobrarFianza(solicitud.getEstudiante(), libro);

        Prestamo prestamo = new Prestamo(solicitud.getEstudiante(), libro, solicitud.getFechaDevolucion());
        repositorio.guardar(prestamo);
        return prestamo;
    }
}