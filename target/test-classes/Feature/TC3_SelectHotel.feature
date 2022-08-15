@SelectHotel
Feature: Validation of AdactinHotel Login details

  Scenario Outline: Verifying a login with valid credentials and validate select hotel text after search and validate book a hotel text after continue
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search hotel by selecting all fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>"and"<ChildrenperRoom>"
    Then User should verify success message after search "Select Hotel"
    And User should select a hotel and continue
    Then User should verify text after continue "Book A Hotel"

    Examples: 
      | username       | password   | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | shaliniravi143 | 9003681303 | Sydney   | Hotel Creek | Standard | 2 - Two       | 28/07/2022  | 29/07/2022   | 2 - Two       | 1 - One         |

  Scenario Outline: Verifying a login with valid credentials and validate select hotel text after search and validate error message after continue
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search hotel by selecting all fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>"and"<ChildrenperRoom>"
    Then User should verify success message after search "Select Hotel"
    And User doesnt select a hotel and continue
    Then User should verify error message  after continue "Please Select a Hotel"

    Examples: 
      | username       | password   | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | shaliniravi143 | 9003681303 | Sydney   | Hotel Creek | Standard | 2 - Two       | 28/07/2022  | 29/07/2022   | 2 - Two       | 1 - One         |
