class Notificador {
    fun enviarNotificacion(usuario: Usuario, mensaje: String) {
        when (usuario.tipoNotificacion) {
            "email" -> println("Enviando correo electrónico a ${usuario.email}: $mensaje")
            "sms" -> println("Enviando SMS a ${usuario.telefono}: $mensaje")
            // Para añadir un nuevo método de notificación, debes modificar esta clase.
        }
    }
}

data class Usuario(val nombre: String, val email: String, val telefono: String, val tipoNotificacion: String)

// Uso
fun main() {
    val usuario = Usuario("Juan", "juan@example.com", "1234567890", "email")
    Notificador().enviarNotificacion(usuario, "¡Bienvenido a nuestro sistema!")
}
