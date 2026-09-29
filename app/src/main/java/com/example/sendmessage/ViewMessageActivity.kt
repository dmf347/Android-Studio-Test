package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Segunda actividad de la aplicación SendMessage.
 *
 * Muestra el mensaje recibido desde [SendMessageActivity] dentro de un [TextView]
 * personalizado con la tipografía y paleta de colores distintivas de la aplicación.
 *
 * @author David
 * @version 1.0
 */
class ViewMessageActivity : AppCompatActivity() {

    /**
     * Inicializa la interfaz de usuario y recupera los datos transmitidos.
     *
     * Extrae la cadena enviada mediante el [Intent] bajo la clave `"KEY_MESSAGE"`
     * y la establece como el contenido de texto del [TextView].
     *
     * @param savedInstanceState Estado guardado previo de la actividad, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

        val tvViewMessage = findViewById<TextView>(R.id.tvViewMessage)
        val message = intent.getStringExtra("KEY_MESSAGE")

        tvViewMessage.text = message
    }
}