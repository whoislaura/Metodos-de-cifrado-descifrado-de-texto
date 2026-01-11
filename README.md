# 🧩 Proyecto 27: Cifrado por Sustitución y Vigenère
Este proyecto implementa dos métodos clásicos de criptografía:
el cifrado por sustitución simple y el cifrado Vigenère, permitiendo cifrar y descifrar mensajes de forma interactiva mediante consola.

## 📌 Características principales
-Cifrado y descifrado por sustitución simple usando un mapa fijo.

-Cifrado y descifrado mediante Vigenère usando una clave definida por el usuario.

-Manejo completo de:

Mayúsculas

Minúsculas

Caracteres especiales (se mantienen sin cambios)

-Validación de clave Vigenère.

-Menú interactivo en consola.

-Separación clara de responsabilidades mediante clases.

## 📁 Estructura del proyecto

```
src/
 ├── Main.java
 ├── Controlador.java
 ├── Configuracion.java
 ├── CifradoSustitucion.java
 └── CifradoVigenere.java
 ```

## 🧱 Descripción de clases
Main  
Inicia el programa y muestra el título del proyecto.

Controlador  
Gestiona el menú, la interacción con el usuario y llama a los métodos de cifrado/descifrado.

Configuracion  
Contiene:

Alfabetos (mayúsculas y minúsculas)

Mapas de sustitución

Clave Vigenère

Validaciones

CifradoSustitucion  
Implementa el cifrado y descifrado usando un mapa fijo.

CifradoVigenere  
Implementa el cifrado y descifrado usando la clave Vigenère.

## ▶️ Cómo ejecutar

### Compilar el proyecto:

```
javac *.java
```

### Ejecutar:

```
java Main
```

### Usar el menú para:

Configurar clave Vigenère

Cifrar/descifrar por sustitución

Cifrar/descifrar por Vigenère

Ver mapas y clave actual

## 🖥️ Ejemplo de uso

```
===Proyecto 27: Cifrado Sustitución y Vigenère===
---------------------------------
1. Configurar clave Vigenère.
2. Cifrar texto (Sustitucion).
3. Descifrar texto (Sustitucion).
4. Cifrar texto (Vigenère).
5. Descifrar texto (Vigenère).
6. Mostrar mapa actual.
7. Mostrar clave actual.
8. Salir.
Elige una opción:
```

## 📚 Objetivo académico
Este proyecto cumple con los requisitos del ejercicio:

✔️ Cifrado/descifrado correcto

✔️ Manejo de alfabetos y mapas

✔️ Interfaz funcional

✔️ Validaciones adecuadas

## 📝 Licencia
Este proyecto puede usarse libremente con fines educativos.
