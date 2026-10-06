package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.sendmessage.model.Message
import com.example.sendmessage.model.Person

/**
 * Actividad principal de la aplicación SendMessage.
 *
 * Esta actividad permite al usuario redactar un texto dentro de un campo de entrada [EditText]
 * y enviarlo a una segunda actividad [ViewMessageActivity] mediante un [Intent] explícito
 * al pulsar el botón de envío [Button].
 *
 * <ol>
 *      <li>Crear un componente EditText y Button en XML</li>
 *      <li>Lanzar un evento en un componente Visual</li>
 *      <li>Crea el <code>Intent</code> junto con el <code>Bundle</code> para pasar a otra actividad</li>
 *      <li>El ciclo de vida de la Activity</li>
 *      <li>Ver la pila de Activities</li>
 * </ol>
 *
 * @author David
 * @version 1.0
 * @see android.widget.Button
 * @see android.widget.EditText
 * @see android.os.Bundle
 * @see Intent
 */
class SendMessageActivity : AppCompatActivity() {
    lateinit var etMessageText: EditText

    companion object {
        const val TAG: String ="LogSendMessageActivity"
    }

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

        etMessageText = findViewById(R.id.etSendMessage)
        val btSend = findViewById<Button>(R.id.btSendMessage)

        btSend.setOnClickListener {
            sendMessage()
        }
        // Se escriben mensajes de depuración en la consola LogCat
        Log.d(TAG, "SendMessageActivity -> onCreate()")
    }

    /**
     * Función que crea un mensaje con la información de la persona que envía y de la persona
     * que recibe el mensaje
     */
    private fun sendMessage() {
        // 1. Crear el Intent
        val intent = Intent(this, ViewMessageActivity::class.java)
        // 2. Crear el Bundle
        val bundle = Bundle()
        // 3. La información del mensaje
        val sender = Person("77684848W", "David", "Márquez Fontivero")
        val receiver = Person("77684848W", "David", "Márquez Fontivero")

        val message = Message(1, etMessageText.text.toString(), sender, receiver)
        bundle.putParcelable("KEY_MESSAGE", message)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    //region Ciclo de Vida de una Actividad
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "SendMessageActivity -> onCreate()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "SendMessageActivity -> onCreate()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "SendMessageActivity -> onCreate()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "SendMessageActivity -> onCreate()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "SendMessageActivity -> onCreate()")
    }
    //endregion


}