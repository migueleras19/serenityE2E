Feature: Compra de productos

  @test
  Scenario: Verificacion de los productos
    Given El usuario se encuentra en la pagina de verificacion de productos
    When  El usuaio da click al boton "Checkout"
    And   El usuario completa el formulario de informacion
    And   El usuario da click al boton "continue"
    And   El usuaio completa la informacion de pago
    And   El usuario da click al boton "finish"
    Then  El usuario identifica el de "Thank you for your order!"