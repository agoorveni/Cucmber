Feature: To check the functionality of facebook application

  Background: 
    Given To lauch the browser and max the window

@sanity @regression
  Scenario: To check the login page of the facebbok
    When Have to lauch the facebook application
    When To pass value in email field
    And To pass the value in passwors field
    And Have to click the login button
    Then Need to close the browser

  @sanity
  Scenario Outline: To Validate the positive and negative combination values in facebook page
    When Need to lauch Facebook appln
    When Pass the values in "<username>" email
    When Pass the values in "<password>" password
    And Click the login
    Then CLose the browser

    Examples: 
      | username       | password |
      | Veni@gmail.com |    12345 |
      | Vani@gmail.com | 234@123  |
      | Renu@gmail.com | 456@456  |

  @sanity
  Scenario: To check the facebook with various inputs
    When Pleae lauch the facebook appln
    When Passing the value in email field
      | Veni@gmail    | Vani@gmail | agoorveni@gmail |
      | 123@gmail.com | abc        | wer             |
    When Passing the values in password field
      | 123 | 345 |  678 |     |
      | 456 | 890 | 1234 | def |
    And Please click the login btn
@regression
  Scenario: Facbook checking functionality
    When Facbook application needs to be launched
    When Email field values
      | emailone | 1234 |
      | emailtwo |  456 |
    When Password filed values
      | passone | passtwo |
      | abs     | dfr     |
      | rty     | nmj     |
When Login button need to be clicked