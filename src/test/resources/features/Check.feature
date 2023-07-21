Feature: COmpra de productos
  Scenario: Verificacion de los productos
    Given El usuario se encuentra en la pagina de verificacion de productos
    When Dar click en el boton "Checkout"
    And Completa el formulario de informacion
    And Dar clic en el boton "continue"
    And Completa la informacion de pago
    And Dar clic en el boton "finish"
    Then Se muestra el mensaje de "Thank you for your order!"