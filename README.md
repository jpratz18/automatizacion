# automatizacion

Plugins

File > Setting > Plugins

* Gherkin 
	Gherkin es un conjunto de reglas gramaticales que hace que el texto sin formato esté lo suficientemente estructurado para que Cucumber lo entienda.
* Cucumber for Java
	Cucumber lee las especificaciones ejecutables escritas en texto sin formato y valida que el software haga lo que dicen esas especificaciones

https://cucumber.io/docs/guides/overview/

------------------------------------------------------------------------------------------------------------------------

Crear un Proyecto

File > New > Project

1) Selecciona Maven
2) Selecciona SDK
3) En caso de no desplegare el SDK, buscar en el path de instalación de Java
4) Botón Siguiente
5) Selecciona un folder vacío para guardar los archivos

------------------------------------------------------------------------------------------------------------------------

Dependencias

Si agregas el nombre del artefacto se completa lo demas

<dependency>
	<groupId>org.seleniumhq.selenium</groupId>
	<artifactId>selenium-java</artifactId>
	<version>4.1.2</version>
</dependency>

<dependency>
	<groupId>io.cucumber</groupId>
	<artifactId>cucumber-java</artifactId>
	<version>7.5.0</version>
</dependency>

<dependency>
	<groupId>io.cucumber</groupId>
	<artifactId>cucumber-testng</artifactId>
	<version>7.5.0</version>
</dependency>

Agregamos en la sección de propiedades el encoding del proyecto

<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

------------------------------------------------------------------------------------------------------------------------

Driver

https://chromedriver.chromium.org/downloads
https://github.com/mozilla/geckodriver/releases

1) Descargamos los drivers
2) Generamos un package y copiamos los archivos

------------------------------------------------------------------------------------------------------------------------

https://www.webdriveruniversity.com/

1) Creamos la carpeta resources/features en test
2) Creamos el archivo Contacto.feature en la carpeta resources/features
3) Agregamos en el archivo la palabra Feature y la descripcion de las pruebas que se realizaran
4) Agregamos en el archivo la palabra Scenario y la descripcion del escenario
5) Agregamos en el archivo la palabra Given y la precondicion
6) Agregamos en el archivo la palabra When ingreso el nombre
7) Agregamos en el archivo la palabra When ingreso el apellido
8) Agregamos en el archivo la palabra When ingreso el email
9) Agregamos en el archivo la palabra When ingreso el comentario
10) Agregamos en el archivo la palabra When ingreso el preciono el buton submit
11) Agregamos en el archivo la palabra Then se muestra la página de carga correcta

------------------------------------------------------------------------------------------------------------------------

1) Se agrega la carpeta stepDefinition en test/java
2) Se crea la clase Contacto_Steps
3) Se corre la prueba para generar los nombres de las funciones que no existen
4) Se formatea el código: Control + Alt + l
4) Quitamos las excepciones del código
4) Agregamos 
	
	private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
	
9) Instalar la extension en el navegador Chrome https://www.ranorex.com/selocity/browser-extension

10) Buscamos elementos con la ayuda de la extension
	//input[@name='first_name']
	//input[@name='last_name']
	//input[@name='email']
	//textarea[@name='message']
	//input[@value='SUBMIT']
