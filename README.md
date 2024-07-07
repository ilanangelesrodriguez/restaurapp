# RestaurApp

RestaurApp es una aplicación web desarrollada con Spring Boot, diseñada para gestionar un sistema de restaurante. Este proyecto permite la gestión de platos, mesas, reservas, clientes y empleados, ofreciendo una solución integral para la administración de un restaurante.

## Características

- **Gestión de Platos**: Permite crear, listar, editar y eliminar platos del menú.
- **Gestión de Mesas**: Administra las mesas del restaurante, incluyendo la creación, listado, edición y eliminación.
- **Reservas**: Gestiona las reservas de los clientes, permitiendo crear, listar, editar y eliminar reservas.
- **Gestión de Clientes**: Administra la información de los clientes, incluyendo sus datos personales y reservas asociadas.
- **Gestión de Empleados**: Permite la administración de los empleados del restaurante, incluyendo sus datos personales y roles.

## Tecnologías Utilizadas

- **Lenguaje de Programación**: Java
- **Framework**: Spring Boot
- **Sistema de Construcción**: Gradle
- **Persistencia de Datos**: JPA
- **Frontend**: Thymeleaf para las vistas HTML

## Estructura del Proyecto

El proyecto sigue el patrón MVC (Modelo-Vista-Controlador), organizado de la siguiente manera:

- **Modelo**: Representado por las entidades (`Plato`, `Mesa`, `Reserva`, `Cliente`, `Empleado`).
- **Vista**: Implementada con Thymeleaf para generar las páginas HTML.
- **Controlador**: Clases que manejan las solicitudes HTTP y comunican la vista con el modelo.

## Cómo Empezar

Para ejecutar el proyecto, asegúrate de tener instalado Java y Gradle. Luego, sigue estos pasos:

1. Clona el repositorio del proyecto.
2. Abre una terminal y navega hasta la carpeta del proyecto.
3. Ejecuta `gradle bootRun` para iniciar la aplicación.
4. Abre un navegador y visita `http://localhost:8080` para acceder a la aplicación.

## Contribuir

Si deseas contribuir al proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu característica o corrección.
3. Implementa tus cambios.
4. Envía un pull request para su revisión.

Agradecemos cualquier contribución que ayude a mejorar el proyecto.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - vea el archivo `LICENSE.md` para más detalles.