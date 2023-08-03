Feature: Compra de productos
  Scenario: Agregar dos productos al carrito de compras
    Given El usuario se encuentra en la pagina de incio de la tienda
    When Selecciona el producto "Sauce Labs Bike Light" y lo agrega al carrito
    And Selecciona el producto dos "Sauce Labs Bolt T-Shirt" y lo agrega al carrito
    And El usuario hace click en el carrito de compras
    # Then El usuario se encuentra en la pagina del carrito de compras
    And El usuario hace click en el boton "Checkout"