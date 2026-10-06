package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sendmessage.model.Message

/**
 * Segunda actividad de la aplicación SendMessage.
 *
 * Muestra el mensaje recibido desde [SendMessageActivity] dentro de un [TextView]
 * personalizado con la tipografía y paleta de colores distintivas de la aplicación.
 *
 * @author David
 * @version 1.0
 */


@Suppress("DEPRECATION")
class ViewMessageActivity : AppCompatActivity() {

    companion object {
        const val TAG: String ="LogViewMessageActivity"
    }

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
        val tvSender = findViewById<TextView>(R.id.tvSender)
        val message = intent.getParcelableExtra("KEY_MESSAGE") as? Message

        tvViewMessage.text = message?.content
        tvSender.text = message?.sender?.name
    }

    //region Ciclo de Vida de una Actividad
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "ViewMessageActivity -> onCreate()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "ViewMessageActivity -> onCreate()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "ViewMessageActivity -> onCreate()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "ViewMessageActivity -> onCreate()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "ViewMessageActivity -> onCreate()")
    }
    //endregion
}