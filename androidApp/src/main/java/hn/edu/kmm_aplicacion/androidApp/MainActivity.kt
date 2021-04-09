package hn.edu.kmm_aplicacion.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import hn.edu.kmm_aplicacion.shared.Greeting
import android.widget.TextView
import android.widget.Toast


fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getNombre()
        var txtNumero = findViewById(R.id.txtNumero) as EditText
       var btnFactorial= findViewById(R.id.btnFactorial) as Button
        btnFactorial.setOnClickListener { NumeroFactorial( txtNumero.text.toString().toInt()) }



    }


    fun NumeroFactorial(numero: Int) {

        var txtNombre = findViewById(R.id.txtNombre) as EditText
        var txtNumero = findViewById(R.id.txtNumero) as EditText
        var  txvResultado = findViewById(R.id.txvResultado)  as TextView

        if (txtNombre.text.toString()!="Helen") {
            Toast.makeText(
                this, "Ingrese el Nombre de usuario Correcto", Toast.LENGTH_SHORT
            ).show()

        } else {
            if (txtNumero.text.toString().isEmpty() ){
                Toast.makeText(this, "Ingrese un numero", Toast.LENGTH_SHORT).show()
            } else {
                val numero = txtNumero.text.toString().toInt()
                if ((numero > 1 )){
                    numero* factorial(numero - 1)
                } else {
                    Toast.makeText(
                        this, "No tiene factorial", Toast.LENGTH_SHORT
                    ).show()
                }
            }
            txvResultado.text = " El Factorial del numero   " + factorial(numero)


        }
    }

    fun factorial(numero: Int): Int {


        if (numero > 1) {
            return numero * factorial(numero - 1)

        } else {

            return numero


        }

            }





    fun getNombre() {
        var  txvResultado = findViewById(R.id.txvResultado)  as TextView
        val bundle = intent.extras
        val nombre = bundle?.get("nombre")
        txvResultado.text = getString(R.string.txvnum, nombre)
    }
}
