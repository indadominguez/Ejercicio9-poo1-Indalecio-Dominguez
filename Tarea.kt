import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Tarea(val id: Int, val descripcion: String, var estado: String, var fechaRealizada: String? = null) {

    fun marcarComoRealizada() {
        estado = "realizada"
        val fechaHoraActual: LocalDateTime = LocalDateTime.now()
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
        fechaRealizada = fechaHoraActual.format(formatter)
    }

    fun mostrarTarea() {
        val fecha = if (estado == "realizada") " - Fecha: $fechaRealizada" else ""
        println("ID: $id | Descripción: $descripcion | Estado: $estado$fecha")
    }
}
