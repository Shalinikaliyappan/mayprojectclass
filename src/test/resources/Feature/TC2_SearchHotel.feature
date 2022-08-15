@SearchHotel
Feature: Validation of AdactinHotel Login details

  Scenario Outline: Verifying a login with valid credentials and validate select hotel text in adactin page
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search hotel by selecting all fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>"and"<ChildrenperRoom>"
    Then User should verify success message after search "Select Hotel"

    Examples: 
      | username       | password   | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | shaliniravi143 | 9003681303 | Sydney   | Hotel Creek | Standard | 2 - Two       | 28/07/2022  | 29/07/2022   | 2 - Two       | 1 - One         |

  Scenario Outline: Verifying a login with valid credentials and only verify the mandatory field verifying message select hotel
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search hotel by selecting only mandatory fields"<Location>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>"and"<AdultsperRoom>"
    Then User should verify success message after search "Select Hotel"

    Examples: 
      | username       | password   | Location | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom |
      | shaliniravi143 | 9003681303 | Sydney   | 2 - Two       | 28/07/2022  | 29/07/2022   | 2 - Two       |

  Scenario Outline: Verifying a login with valid credentials and check error message when invalid date is passing
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search hotel by selecting fields "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>"and"<ChildrenperRoom>"
    Then User should verify date error message after search "Check-In Date shall be before than Check-Out Date"and"Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username       | password   | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | shaliniravi143 | 9003681303 | Sydney   | Hotel Creek | Standard | 2 - Two       | 28/07/2023  | 29/07/2022   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verifying a login with valid credentials and check error message please select a location after search
    Given User is on the  Adactinhotel page
    When User should login with "<username>" and "<password>"
    Then User should verify success message after login"Hello shaliniravi143!"
    And User should search for hotel without passing search hotel field
    Then User should verify error message after search "Please Select a Location"

    Examples: 
      | username       | password   |
      | shaliniravi143 | 9003681303 |
