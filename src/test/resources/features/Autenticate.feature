Feature: Compra de productos en Sauce Demo

  @ScenarioNoExamples:
  Scenario: Autenticacion exitosa con usuario y contrasena
    Given El usuario se encuentra en la pantalla de login
    When El usuario ingresa username  y su password
    Then El usuario se autentica exitosamente presentando la pantalla de inventario

  @ScenarioWithExamples
  Scenario Outline: Autenticacion exitosa con usuario y contrasena
    Given El usuario se encuentra en la pantalla de login
    When El usuario ingresa  usuario y su contrasena
                  | <user-name> | <password> |
    Then El usuario se autentica exitosamente presentando la pantalla de inventario

  Examples:
      | user-name | password |
      | standard_user | secret_sauce |
