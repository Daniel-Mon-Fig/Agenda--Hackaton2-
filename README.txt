README:

===============================================
       AGENDA TELEFÓNICA EN JAVA (IntelliJ)
===============================================

Sistema de gestión de agenda telefónica desarrollado en Java utilizando Programación Orientada a Objetos (POO), con soporte para estructuras modulares y ejecución en consola.

-----------------------------------------------
 CARACTERÍSTICAS DEL PROYECTO
-----------------------------------------------
- Gestión de Contactos: Cada contacto contiene Nombre, Apellido y Teléfono.
- Validación de Duplicados: No se permiten contactos con el mismo nombre y apellido (ignorando mayúsculas y minúsculas).
- Validaciones de Campos: Los nombres y apellidos no pueden estar vacíos.
- Capacidad Configurable: La agenda se puede inicializar indicando un tamaño máximo o usando un tamaño por defecto de 10 contactos.
- Menú Interactivo por Consola: Permite añadir, buscar, modificar, listar y eliminar contactos de forma intuitiva.

-----------------------------------------------
 REQUISITOS DEL SISTEMA
-----------------------------------------------
- Entorno de Desarrollo: IntelliJ IDEA (Community o Ultimate).
- Kit de Desarrollo: Java Development Kit (JDK 11 o superior recomendado).

-----------------------------------------------
 ESTRUCTURA DEL PROYECTO
-----------------------------------------------
Agenda/
│
├── src/
│   └── Agenda/
│       ├── main/
│       │   └── Main.java              # Clase principal con el menú de consola
│       └── model/
│           ├── Agenda.java            # Lógica y almacenamiento de la agenda
│           ├── Contacto.java          # Estructura del objeto Contacto
│           ├── AgregarContacto.java   # Lógica para añadir contactos
│           ├── BuscarContacto.java    # Lógica de búsqueda
│           ├── ListarContacto.java    # Lógica para mostrar la lista
│           └── EliminarContacto.java  # Lógica para eliminar contactos

-----------------------------------------------
 CÓMO EJECUTAR EL PROYECTO EN INTELLIJ IDEA
-----------------------------------------------
1. Abre IntelliJ IDEA.
2. Selecciona Open (Abrir) y busca la carpeta raíz del proyecto.
3. Espera a que IntelliJ configure el proyecto.
4. Navega hasta el archivo Main.java ubicado en el paquete Agenda.main.
5. Haz clic en el botón de Play (Verde) al lado de la clase Main o presiona Shift + F10 para ejecutarlo.

-----------------------------------------------
 FUNCIONALIDADES DEL MENÚ
-----------------------------------------------
=========== AGENDA DE CONTACTOS ===============
1. Añadir contacto
2. Buscar un contacto
3. Eliminar un contacto
4. Modificar contacto
5. Mostrar todos los contactos
6. Salir