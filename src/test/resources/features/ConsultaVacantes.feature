# language: en
# encoding: iso-8859-1

Feature: Consulta de vacantes
  yo como usuario
  deseo acceder a la seccion de empleo en la pagina de choucair
  para poder consultar las diferentes vacantes disponibles

  @consulta
  Scenario: Consulta de vacantes
    Given que estoy en la pagina de choucair
    When ingreso a la seccion de empleo
    Then puedo consultar las vacantes disponibles