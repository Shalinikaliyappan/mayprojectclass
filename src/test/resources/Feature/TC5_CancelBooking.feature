@CancelBook
Feature: Validation of AdactinHotel Login withvalid credentials, search hotel and book hotel and Booking Confirmation details

  Scenario Outline: Verifying a login with valid credentials and validate select hotel,validate book a hotel and verifying booking confirmation page and cancel order Id
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
    And User should cancel orderId
    Then User should verify after cancel order Id "The booking has been cancelled."

    Examples: 
      | username       | password   | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName     | BillingAddress |
      | shaliniravi143 | 9003681303 | Sydney   | Hotel Creek | Standard | 1 - One       | 18/07/2022  | 19/07/2022   | 1 - One       | 1 - One         | malathi   | silambarasan | chennai        |

  Scenario Outline: Verifying a login with valid credentials and cancel existing order Id with success message
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should cancel the existing order Id"<order Id>"
    Then User should verify after cancel order Id "The booking has been cancelled."

    Examples: 
      | username       | password   | order Id   |
      | shaliniravi143 | 9003681303 | L8L8N7Q4BB |
