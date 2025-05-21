Desafío 1 - Automatización con Selenium y Cucumber

📌 Acerca de
Este proyecto automatiza un flujo de prueba de extremo a extremo (E2E) en el sitio web de Amazon. El proceso simula la interacción de un usuario que busca un producto específico y trata de agregarlo al carrito de compras. El objetivo es validar la funcionalidad básica del sitio desde la perspectiva del usuario final, utilizando herramientas de automatización modernas.

🛠️ Herramientas y Librerías Utilizadas
- Java JDK: 17
- Selenium Java: 4.21.0
- Cucumber JVM: Java y JUnit 4 (7.22.0)
- TestNG: 7.11.0
- WebDriverManager (bonigarcia): 5.7.0

📦 Manejador de Dependencias
El proyecto utiliza Gradle para la gestión de dependencias, compilación del código y ejecución de pruebas automatizadas.

▶️ Comando para Ejecutar Pruebas
Desde la raíz del proyecto, puedes ejecutar el siguiente comando en la terminal:
- gradle test
- Dicho comando compilará el proyecto y ejecutará todos los tests definidos con Selenium y Cucumber.

📁 Estructura del Proyecto
├── src
│   ├── main
│   │   └── java
│   │       └── (Clases base, configuración y utilidades)
│   └── test
│       └── java
│           ├── steps (definición de pasos Cucumber)
│           ├── runners (ejecución de pruebas)
│           └── features (archivos .feature en Gherkin)
├── build.gradle
├── settings.gradle


✍️ Escenario Cubierto
El escenario automatizado incluye los siguientes pasos:
- Abrir el navegador e ir al sitio de Amazon.
- Ingresar un término de búsqueda definido.
- Seleccionar un producto de la lista de resultados.
- Intentar agregar el producto al carrito.
- Verificar que el producto haya sido agregado correctamente.

🎯 Objetivo del Proyecto
El propósito principal es fortalecer las habilidades en automatización de pruebas E2E con herramientas como Selenium y Cucumber, integrando buenas prácticas en el diseño de pruebas, escritura de escenarios y ejecución controlada de los casos.

✅ Requisitos Previos
- Tener instalado Java 17 o superior.
- Tener instalado Gradle.
- Conexión a internet activa (para que WebDriverManager descargue los controladores).

📌 Consideraciones Adicionales
- Se recomienda usar Google Chrome como navegador principal.
- El flujo automatizado puede cambiar si Amazon modifica su estructura HTML o políticas de cookies.

👩‍💻 Autor
Estefanía Correa
Automatización con Selenium + Cucumber