public interface RepositorioPrestamos {
    void guardar(Prestamo prestamo);
    Optional<Prestamo> buscarPorId(String id);
    List<Prestamo> buscarPorEstudiante(String idEstudiante);
}