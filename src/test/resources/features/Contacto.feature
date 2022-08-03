Feature: WebDriver University - Pagina de contacto

  Scenario: Validacion de la informacion agregada
    Given Ingresamos a la pagina de contacto
    When Ingreso el nombre
    And Ingreso el apellido
    And Ingreso el email
    And Ingreso el comentario
    And Hago click en el button submit
    Then Se muestra la pagina del correcto ingreso de los datos