Feature: Test me validations demodsa

  Scenario Outline: Login verification for many users
    Given Agent launches the login page
    Then enters the username "<uname>"
    And enteres the password "<pswrd>"
    When he clicks on sbmt login must be successful

    Examples: 
      | uname    | pswrd       |
      | Srini    | HYD123      |
      | Akshitha | Pdsaswrd54  |
      | Paloumi  | Pdfsfsw54rd |
