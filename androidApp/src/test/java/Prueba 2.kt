package hn.edu.kmm_aplicacion.androidApp
import org.junit.Test
import org.junit.Assert

class `Prueba 2` {
    @Test
    fun Factorial_isCorrect() {
        Assert.assertEquals(120, factorial(5))
    }



    fun factorial(numero: Int): Int {
        if (numero > 1){
            return numero * factorial(numero - 1)
        } else {
            return numero
        }

    }
}