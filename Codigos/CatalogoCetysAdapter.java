public class CatalogoCETYSAdapter implements CatalogoBiblioteca {

    private final CatalogoCETYS catalogoCETYS;

    public CatalogoCETYSAdapter(CatalogoCETYS catalogoCETYS) {
        this.catalogoCETYS = catalogoCETYS;
    }

    @Override
    public Libro buscarLibro(String isbn) {
        String codigoCETYS = convertirIsbnACodigoCETYS(isbn);
        ResultadoSOAP resultado = catalogoCETYS.consultarObra(codigoCETYS, "XML");
        return mapearAResultadoLibro(resultado);
    }

    private String convertirIsbnACodigoCETYS(String isbn) {
        return "CETYS-" + isbn;
    }

    private Libro mapearAResultadoLibro(ResultadoSOAP resultado) {
        return new Libro(resultado.getTitulo(), resultado.getAutor(), resultado.getIsbn());
    }
}