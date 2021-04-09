package hn.edu.kmm_aplicacion.androidApp
import org.junit.Assert
import org.junit.Test

class prueba1{
@Test
fun ValidarUsuario() {
    Assert.assertEquals("Helen", Usuario(usuario = "Helen"))
}



    fun Usuario(usuario:String):String {
        if (usuario=="Helen"){

        }
        return usuario.toString()

    }
}