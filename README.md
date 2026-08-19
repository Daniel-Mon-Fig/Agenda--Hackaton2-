# ☎️ Agenda Telefónica en Java (IntelliJ)

Sistema de gestión de agenda telefónica desarrollado en **Java** utilizando **Programación Orientada a Objetos (POO)**, con soporte para estructuras modulares y ejecución en consola.

---

## 📋 Características del proyecto

* **Gestión de contactos:** cada contacto contiene:

  * Nombre
  * Apellido
  * Teléfono
* **Validación de duplicados:** no se permiten contactos con el mismo nombre y apellido, ignorando mayúsculas y minúsculas.
* **Validación de campos:** los nombres y apellidos no pueden estar vacíos.
* **Capacidad configurable:** la agenda puede inicializarse indicando un tamaño máximo o utilizando un tamaño predeterminado de **10 contactos**.
* **Menú interactivo por consola:** permite añadir, buscar, modificar, listar y eliminar contactos de manera intuitiva.

---

## 💻 Requisitos del sistema

| Requisito              | Especificación                         |
| ---------------------- | -------------------------------------- |
| **IDE**                | IntelliJ IDEA Community o Ultimate     |
| **JDK**                | Java 11 o superior recomendado         |
| **Tipo de aplicación** | Aplicación de consola                  |
| **Paradigma**          | Programación Orientada a Objetos (POO) |

---

## 📁 Estructura del proyecto

```text
Agenda/
│
├── src/
│   └── Agenda/
│       ├── main/
│       │   └── Main.java
│       │
│       └── model/
│           ├── Agenda.java
│           ├── Contacto.java
│           ├── AgregarContacto.java
│           ├── BuscarContacto.java
│           ├── ListarContacto.java
│           └── EliminarContacto.java
```

### Descripción de las clases

| Clase                   | Responsabilidad                                           |
| ----------------------- | --------------------------------------------------------- |
| `Main.java`             | Clase principal y menú interactivo de consola             |
| `Agenda.java`           | Gestiona el almacenamiento y las operaciones de la agenda |
| `Contacto.java`         | Representa la información de un contacto                  |
| `AgregarContacto.java`  | Gestiona la creación y validación de contactos            |
| `BuscarContacto.java`   | Implementa la búsqueda de contactos                       |
| `ListarContacto.java`   | Muestra los contactos almacenados                         |
| `EliminarContacto.java` | Gestiona la eliminación de contactos                      |

---

## ▶️ Cómo ejecutar el proyecto en IntelliJ IDEA

1. Abre **IntelliJ IDEA**.
2. Selecciona **Open (Abrir)**.
3. Busca y selecciona la carpeta raíz del proyecto.
4. Espera a que IntelliJ configure el proyecto y reconozca el **JDK**.
5. Navega hasta:

```text
src/Agenda/main/Main.java
```

6. Haz clic en el botón **▶ Play** que aparece junto al método `main`.
7. También puedes ejecutar el programa utilizando:

```text
Shift + F10
```

---

## 📱 Funcionalidades del menú

El programa cuenta con un menú interactivo para administrar los contactos:

```text
========================================
       AGENDA DE CONTACTOS
========================================

1. Añadir contacto
2. Buscar un contacto
3. Eliminar un contacto
4. Modificar contacto
5. Mostrar todos los contactos
6. Salir

========================================
Seleccione una opción:
```

### 1. Añadir contacto

Permite registrar un nuevo contacto proporcionando:

* Nombre
* Apellido
* Teléfono

El sistema valida que el nombre y apellido no estén vacíos y que no exista otro contacto con el mismo nombre y apellido.

### 2. Buscar un contacto

Permite localizar un contacto utilizando los datos registrados en la agenda.

### 3. Eliminar un contacto

Permite eliminar un contacto previamente registrado.

### 4. Modificar contacto

Permite actualizar la información de un contacto existente.

### 5. Mostrar todos los contactos

Muestra en consola todos los contactos almacenados actualmente en la agenda.

### 6. Salir

Finaliza la ejecución del programa.

---

## 🧩 Conceptos de POO utilizados

El proyecto está diseñado para aplicar conceptos fundamentales de **Programación Orientada a Objetos**, como:

* **Clases y objetos**
* **Encapsulamiento**
* **Constructores**
* **Métodos**
* **Atributos**
* **Modularidad**
* **Validación de datos**
* **Separación de responsabilidades**

---

## 🎯 Objetivo

El objetivo del proyecto es desarrollar una **agenda telefónica funcional en Java**, aplicando principios de POO y una estructura modular que facilite el mantenimiento, comprensión y ampliación del código.
