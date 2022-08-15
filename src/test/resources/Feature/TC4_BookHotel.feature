@BookHotel
Feature: Validation of AdactinHotel Login withvalid credentials, search hotel and book hotel and Booking Confirmation details

  Scenario Outline: Verifying a login with valid credentials and validate select hotel,validate book a hotel and verifying booking confirmation page
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search hotel by selecting all fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>"and"<ChildrenperRoom>"
    Then User should verify success message after search "Select Hotel"
    And User should select a hotel and continue
    Then User should verify text after continue "Book A Hotel"
    And User should the book hotel "<FirstName>","<LastName>"and"<BillingAddress>"
      | CreditCardNo     | CreditCardType   | SelectMonth | SelectYear | CVVNumber |
      | 1234567890987655 | American Express | December    |       2022 |      1432 |
      | 1234567890987651 | VISA             | November    |       2022 |      8907 |
      | 1234567890987652 | Master Card      | August      |       2022 |      4321 |
      | 1234567890987657 | Other            | September   |       2022 |      5678 |
    Then User should Verify text after booking "Booking Confirmation"

    Examples: 
      | username       | password   | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName     | BillingAddress |
      | shaliniravi143 | 9003681303 | Sydney   | Hotel Creek | Standard | 2 - Two       | 28/07/2022  | 29/07/2022   | 2 - Two       | 1 - One         | malathi   | silambarasan | chennai        |

  Scenario Outline: Verifying a login with valid credentials and validate select hotel,validate book a hotel and verifying booking confirmation error message
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search hotel by selecting all fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>"and"<ChildrenperRoom>"
    Then User should verify success message after search "Select Hotel"
    And User should select a hotel and continue
    And User should book a hotel without passing any fields in book hotel page
    Then User without enter all field verify all error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"and"Please Enter your Credit Card CVV Number"

    Examples: 
      | username       | password   | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | shaliniravi143 | 9003681303 | Sydney   | Hotel Creek | Standard | 2 - Two       | 28/07/2022  | 29/07/2022   | 2 - Two       | 1 - One         |
