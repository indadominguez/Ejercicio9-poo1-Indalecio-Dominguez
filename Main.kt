import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val gestorTareas = GestorTareas()

    val fechaHoraActual: LocalDateTime = LocalDateTime.now()
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val fechaFormateada: String = fechaHoraActual.format(formatter)
    println("Fecha y Hora Actual: $fechaFormateada")

    gestorTareas.agregarTarea("Hacer los ejercicios")
    gestorTareas.agregarTarea("Ver las champions")
    gestorTareas.agregarTarea("Estudiar por las mañanas")

    gestorTareas.mostrarTareas()

    gestorTareas.cambiarEstadoTarea(1)

    gestorTareas.mostrarTareasPendientes()
    gestorTareas.mostrarTareasRealizadas()

    gestorTareas.eliminarTarea(2)

    gestorTareas.mostrarTareas()
}
