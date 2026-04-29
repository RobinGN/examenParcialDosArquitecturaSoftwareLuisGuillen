// Ejemplo 1 solo los obligatorio
SolicitudPrestamo s1 = new SolicitudPrestamoBuilder()
    .conEstudiante(estudiante)
    .conLibro(libro)
    .conFechaDevolucion(fecha)
    .construir();

// Ejemplo 2 con notas especiales y renovación automática
SolicitudPrestamo s2 = new SolicitudPrestamoBuilder()
    .conEstudiante(estudiante)
    .conLibro(libro)
    .conFechaDevolucion(fecha)
    .conNotasEspeciales("Préstamo extendido por tesis")
    .conRenovacionAutomatica(true)
    .construir();

// Ejemplo 3 con todos los campos opcionales
SolicitudPrestamo s3 = new SolicitudPrestamoBuilder()
    .conEstudiante(estudiante)
    .conLibro(libro)
    .conFechaDevolucion(fecha)
    .conNotasEspeciales("Reservado para examen final")
    .conRenovacionAutomatica(true)
    .conNumRenovaciones(3)
    .construir();