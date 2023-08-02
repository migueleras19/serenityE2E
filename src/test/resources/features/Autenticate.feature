Feature: Compra de productos en Sauce Demo

  Scenario: Autenticacion exitosa con usuario y contrasena
    Given El usuario se encuentra en la pantalla de login
    When El usuario ingresa su username "standard_user" y password "secret_sauce"
    Then El usuario se autentica exitosamente presentando la pantalla de inventario


