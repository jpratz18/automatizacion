@pagina-contacto

Feature: WebDriver University - Pagina de contacto

  Scenario: Validacion de la informacion agregada
    Given Ingresamos a la pagina de contacto
    When Ingreso el nombre
    And Ingreso el apellido
    And Ingreso el email
    And Ingreso el comentario
    And Hago click en el button submit
    Then Se muestra la pagina del correcto ingreso de los datos

  Scenario: Validacion de la informacion agregada desde una variable
    Given Ingresamos a la pagina de contacto
    When Ingreso el nombre especifico juan
    And Ingreso el apellido especifico pratz
    And Ingreso el email especifico juan.pratz@qacg.com
    And Ingreso el comentario especifico "No tengo ningun comentario"
    And Hago click en el button submit
    Then Se muestra la pagina del correcto ingreso de los datos