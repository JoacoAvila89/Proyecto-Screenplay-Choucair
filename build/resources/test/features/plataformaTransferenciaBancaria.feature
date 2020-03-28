#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Plataforma de Transferencia Bancaria
				 Portal de transacciones ACH para los distintos canales SVP/APP

  @Caso1
  Scenario: Visualizar resumenes enviados
    Given Yo como analista deseo ingresar a ptb con usuario "Ptb01" y psw "Panama12345678"
    And lograr ingresar a la opcion visualizar resumenes enviados
    When selecciono la fecha a validar de operaciones enviadas a consultar
    Then valido la informacion mostrada en la tabla de resumenes enviadas
    And lo comparo con el total enviado de operaciones ach del dia consultado

