Feature: my demo at DDC2

  Background: Launch TestMeApp
    Given User launches the application

  Scenario Outline: Login For TestMeApp
    Given User enters username "<user>"
    Then User enters password "<pass>"
    Then User clicks on AllCategories
    Then User clicks on Electronics
    Then User clicks on Headphone
    Then User clicks on Add To Cart
    Then User clicks on Cart
    Then User clicks on Remove and closes the app

    Examples: 
      | user    | pass         |
      | Lalit   | Passwbord123 |
      | Lalith  | Passwo8rd123 |
      | Lalitha | Passworhd    |
