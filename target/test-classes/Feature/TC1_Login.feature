@Login
Feature: Validation of AdactinHotel Login details

  Scenario Outline: Verifying a login with valid credentials
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"

    Examples: 
      | username       | password   |
      | shaliniravi143 | 9003681303 |

  Scenario Outline: Verifying a login with valid credentials using enter keyword
    Given User is on the  Adactinhotel page
    When User should login with Enter Key"<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"

    Examples: 
      | username       | password   |
      | shaliniravi143 | 9003681303 |

  Scenario Outline: Verifying a login with Invalid credentials and check error message
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify after login with error message "Invalid Login details or Your Password might have expired"

    Examples: 
      | username       | password   |
      | shaliniravi14 | 9003681303 |
