# 📋 Registro de Cambios (CHANGELOG)

Todos los cambios notables realizados en el proyecto **SendMessage** serán documentados en este archivo.

---

## [v1.0] - 2026-09-29

### 🚀 Añadido
- Paso de datos funcional entre `SendMessageActivity` y `ViewMessageActivity` mediante `Intent` con la clave extra `"KEY_MESSAGE"`.
- Aplicación de diseño coherente en `ViewMessageActivity` utilizando la fuente personalizada `Playwrite CU Guides` y el color de fondo `@color/teal_200`.
- Documentación completa del código fuente con comentarios en formato **KDoc**.
- Creación de documentación del proyecto: `README.md`, `CHANGELOG.md` y `MANUAL_USUARIO.md`.
- Evidencias gráficas de ejecución en el emulador y comandos de inspección en `/data/data/`.

### 🛠️ Modificado
- Actualización de `compileSdk = 37` en `build.gradle.kts` para garantizar la compatibilidad total con dependencias AndroidX.
- Limpieza y refactorización de imports innecesarios en las clases principales.

---

## [v0.1] - 2026-09-24

### 🚀 Añadido
- Estructura base del proyecto Android con soporte para Kotlin.
- Definición de layouts XML iniciales:
  - `activity_send_message.xml`: Campo de entrada `EditText`, título `TextView` y botón de envío `Button`.
  - `activity_view_message.xml`: Pantalla secundaria con `TextView` e imágenes decorativas.
- Configuración de la paleta de colores inicial (`colors.xml`), dimensiones (`dimens.xml`) y cadenas de texto (`strings.xml`).
- Incorporación de la tipografía personalizada `playwritecuguides_regular.ttf` en el directorio `res/font/`.
