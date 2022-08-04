# automatizacion

Definicion de tipo de variable

https://github.com/cucumber/cucumber-expressions#readme

1) Generamos un escenario nuevo para el nombre, apellido, email y comenario enviado como variable
2) Corremos las prueba para generar los metodos que nos faltan
2) Agregamos el parametro del tipo que definimos al metodo

------------------------------------------------------------------------------------------------------------------------

1) Creamos el package runners
2) Creamos la clase MainRunner
3) Extendemos de la clase AbstractTestNGCucumberTests
4) Agregamos la notacion @CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinition"},
   tags = "@pagina-contacto", monochrome = true, dryRun = false,
   plugin = {"pretty", "html:target/cucumber.html"})
   features es el classpath de los escenario
   glue son las clases de los pasos
   monochrome es el formato de salida del log
   dryRun si es true no ejecuta el codigo de los pasos
   tags ejecuta la escenario que tenga el tag mecionado
   plugin pretty agrega informacion al log
   plugin html:target/cucumber.html genera un reporte en html