package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

/**
 * Actividad principal de la aplicación SendMessage.
 *
 * Esta actividad permite al usuario redactar un texto dentro de un campo de entrada [EditText]
 * y enviarlo a una segunda actividad [ViewMessageActivity] mediante un [Intent] explicito
 * al pulsar el botón de envío [Button].
 *
 * @author David
 * @version 1.0
 */
class SendMessageActivity : AppCompatActivity() {

    /**
     * Inicializa la interfaz de usuario de la actividad.
     *
     * Vincula los componentes de la vista ([EditText] y [Button]) e implementa
     * el evento [Button.setOnClickListener] para capturar el texto introducido,
     * empaquetarlo como extra en un [Intent] y lanzar la actividad de destino.
     *
     * @param savedInstanceState Estado guardado previo de la actividad, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_message)

        val etMessageText = findViewById<EditText>(R.id.etSendMessage)
        val btSend = findViewById<Button>(R.id.btSendMessage)

        btSend.setOnClickListener {
            val intent = Intent(this, ViewMessageActivity::class.java).apply {
                putExtra("KEY_MESSAGE", etMessageText.text.toString())
            }
            startActivity(intent)
        }
    }
}