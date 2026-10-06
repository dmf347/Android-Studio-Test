package com.example.sendmessage.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Representa el mensaje que será enviado por la aplicación
 *
 * Sus datos identifican el mensaje que envía o recibe una **persona**.
 *
 * @property id Identificador numérico del mensaje.
 * @property content Contiene el mensaje en sí.
 * @property sender Persona que envía el mensaje.
 * @property receiver Persona que recibe el mensaje
 */

@Parcelize
data class Message (val id:Int, val content:String, val sender:Person, val receiver:Person):
    Parcelable