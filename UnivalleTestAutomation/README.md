
# Automatización del acceso al campus virtual de la Universidad del Valle

### [Test Automation Wiki](https://github.com/juansedev/TestAutomationTutorial/wiki)

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
    │   │           └───selenium.test.utils
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

### Made with :heart: by Juan Sebastian Llano Gallego.

__Where to find me__
<p>
  <a href="https://github.com/juansedev" target="_blank"><img alt="Github" src="https://img.shields.io/badge/GitHub-%2312100E.svg?&style=for-the-badge&logo=Github&logoColor=white" />
  </a> <a href="https://twitter.com/juanse_dev" target="_blank"><img alt="Twitter" src="https://img.shields.io/badge/twitter-%231DA1F2.svg?&style=for-the-badge&logo=twitter&logoColor=white" /></a>
  <a href="https://www.linkedin.com/in/juansebastianllanogallego" target="_blank"><img alt="LinkedIn" src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />
  </a> <a href="https://medium.com/@juansedev" target="_blank"><img alt="Medium" src="https://img.shields.io/badge/medium-%2312100E.svg?&style=for-the-badge&logo=medium&logoColor=white" /></a>
</p>

__Test Automation Engineer__
__November, 2021.__