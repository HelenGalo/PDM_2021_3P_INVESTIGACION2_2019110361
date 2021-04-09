package hn.edu.kmm_aplicacion.shared


class Greeting {
    fun greeting(): String {
        return "Es una Prueba, ${Platform().platform}!"
    }
}
