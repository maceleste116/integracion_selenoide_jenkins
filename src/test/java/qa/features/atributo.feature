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

  Scenario: Editar atributo existente con datos requeridos
    When actuario quiere editar atributo existente con datos requeridos
    Then actuario tiene atributo editado con datos requeridos

  Scenario: Editar atributo existente sin datos requeridos
    When actuario quiere editar atributo existente sin datos requeridos
    Then actuario tiene atributo editado sin datos requeridos

  Scenario: Eliminar atributo existente aceptar
    When actuario quiere eliminar atributo aceptar
    Then actuario tiene atributo eliminado

  Scenario: Eliminar atributo existente aceptar asociada
    When actuario quiere eliminar atributo aceptar asociado
    Then actuario no tiene atributo eliminado asociado

  Scenario: Listar ascendente atributo existente
    When actuario quiere ordenar ascendente atributo existente
    Then actuario tiene ordenado ascendente atributo existente

  Scenario: Listar descendente atributo existente
    When actuario quiere ordenar descendente atributo existente
    Then actuario tiene ordenado descendente atributo existente
