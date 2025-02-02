class GestorTareas {
    private val tareas = mutableListOf<Tarea>()
    private var contadorId = 1

    fun agregarTarea(descripcion: String) {
        val tarea = Tarea(contadorId++, descripcion, "pendiente")
        tareas.add(tarea)
        println("Tarea agregada: $descripcion")
    }

    fun eliminarTarea(id: Int) {
        val tarea = tareas.find { it.id == id }
        if (tarea != null) {
            tareas.remove(tarea)
            println("Tarea eliminada: ${tarea.descripcion}")
        } else {
            println("No se encontró una tarea con ese ID.")
        }
    }

    fun cambiarEstadoTarea(id: Int) {
        val tarea = tareas.find { it.id == id }
        if (tarea != null) {
            if (tarea.estado == "pendiente") {
                tarea.marcarComoRealizada()
                println("Tarea marcada como realizada: ${tarea.descripcion}")
            } else {
                println("La tarea ya está marcada como realizada.")
            }
        } else {
            println("No se encontró una tarea con ese ID.")
        }
    }

    fun mostrarTareas() {
        if (tareas.isNotEmpty()) {
            println("Lista de todas las tareas:")
            tareas.forEach { it.mostrarTarea() }
        } else {
            println("No hay tareas en la lista.")
        }
    }

    fun mostrarTareasPendientes() {
        val tareasPendientes = tareas.filter { it.estado == "pendiente" }
        if (tareasPendientes.isNotEmpty()) {
            println("Tareas pendientes:")
            tareasPendientes.forEach { it.mostrarTarea() }
        } else {
            println("No hay tareas pendientes.")
        }
    }

    fun mostrarTareasRealizadas() {
        val tareasRealizadas = tareas.filter { it.estado == "realizada" }
        if (tareasRealizadas.isNotEmpty()) {
            println("Tareas realizadas:")
            tareasRealizadas.forEach { it.mostrarTarea() }
        } else {
            println("No hay tareas realizadas.")
        }
    }
}
