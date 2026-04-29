public class AuditoriaLogger {

    private static AuditoriaLogger instancia;
    private final List<String> registros = new ArrayList<>();

    private AuditoriaLogger() {}

    public static synchronized AuditoriaLogger getInstancia() {
        if (instancia == null) {
            instancia = new AuditoriaLogger();
        }
        return instancia;
    }

    public void registrar(String evento, String usuario) {
        String entrada = LocalDateTime.now() + " | " + usuario + " | " + evento;
        registros.add(entrada);
        System.out.println(entrada);
    }
}