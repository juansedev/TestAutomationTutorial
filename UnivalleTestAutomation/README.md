# Test Automation Tutorial / Wiki

### [Test Automation Wiki](https://github.com/juansedev/TestAutomationTutorial/wiki/1.-Home)

## Arquitectura de carpetas

Se busca crear un orden claro y sencillo de seguir desde el inicio de la creación del framework, es probable que la necesidad de pruebas se extienda a otros dispositivos, versiones de navegadores o aplicaciones.

Definir un estándar claro y conciso desde el inicio garantiza la escalabilidad y mejora la adaptabilidad de nuevos tester al encontrarse con un framework a la medida.

### Selenium Core

En este paquete se crea todo lo relacionado la lógica del framework, es decir si se desea diseñar una estrategia a la medida para crear el driver para varios navegadores o 
dispositivos se debería poner allí, así mismo si se define clases para el manejo de acciones, esperas o lo que sea que desde la lógica del framework se necesite se debería
codificar allí.


### Selenium Test

En relación al paquete selenium test, es allí donde se codificaran las interacciones directamente con las aplicaciones.
Es decir es en este paquete donde se van a crear las páginas y sus interacciones acordes al patrón de diseño ([Page Object Model](https://www.selenium.dev/documentation/guidelines/page_object_models/)) y finalmente crear los test necesarios.

```
│   .gitignore
│   pom.xml
├───.idea
└───src
    ├───main
    │   ├───java
    │   │   └───selenium
    │   │       └───core
    │   │           │   BrowserActions.java
    │   │           │   DriverFactory.java
    │   │           │   Waits.java
    │   │           └───utils
    │   │                   Constants.java
    │   └───resources
    └───test
        ├───java
        │   └───selenium
        │       └───test
        │           ├───page
        │           │       BasePage.java
        │           │       CampusLogin.java
        │           └───test
        │               │   BaseTests.java
        │               │
        │               └───login
        │                       LoginTest.java
        └───resources
                SuiteTest.xml
```
