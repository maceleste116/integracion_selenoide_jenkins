Feature: Administrar Atributo

  Background: Ir al menu Atributo
    Given actuario quiere ir a Atributo
    
  Scenario: Crear atributo con datos requeridos
    When actuario quiere crear atributo con datos requeridos
    Then actuario tiene atributo creado con datos requeridos

  Scenario: Crear atributo sin datos requeridos
    When actuario quiere crear atributo sin datos requeridos
    Then actuario no tiene atributo creado sin datos requeridos

  Scenario: Crear atributo con codigo existente
    When actuario quiere crear atributo con codigo existente
    Then actuario no tiene atributo creado con codigo existente

  
