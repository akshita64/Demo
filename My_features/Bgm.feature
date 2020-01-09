Feature: demo for DDC2


  Background: Login
    Given as a user i launch the application
    Then provide valid data

  Scenario: AddCart
    Given i select the item of my choice
    Then i click on add

  Scenario: RemoveCart
    Given i select the item to remove
    Then i click on remover

  