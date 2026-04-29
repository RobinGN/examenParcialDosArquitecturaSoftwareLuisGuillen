public class FabricaDeUsuarios {

    public Usuario crear(String tipo, String nombre) {
        switch (tipo.toUpperCase()) {
            case "ESTUDIANTE":    return new Estudiante(nombre);
            case "BIBLIOTECARIO": return new Bibliotecario(nombre);
            case "ADMIN":         return new Admin(nombre);
            default: throw new IllegalArgumentException("Tipo no soportado: " + tipo);
        }
    }
}