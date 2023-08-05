Feature: Compra de productos


  Scenario: Verificacion de los productos
    Given El usuario completa el formulario de informacion
    When El usuario da click al boton "continue"
    And El usuario da click al boton "finish"
    Then El usuario identifica el de "Thank you for your order!"