package hn.edu.kmm_aplicacion.shared

import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertEquals

class AndroidGreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Greeting().greeting().contains("Android"))

    }
}