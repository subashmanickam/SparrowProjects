@SearchHotel
Feature: Verifying the Adactin Search Hotel Details

  
  Scenario Outline: Verifying the Search Valid Hotel Room
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User should Search the Hotel Details "<Location>","<hotels>","<room_type>","<room_nos>","<CheckIn>","<CheckOut>","<adultsroom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"

    Examples: 
      | username      | password      | Location  | hotels         | room_type | room_nos | CheckIn    | CheckOut   | adultsroom | childrenRoom |
      | subashsparrow | $parrowTrio10 | Melbourne | Hotel Sunshine | Double    | 2 - Two  | 14/12/2022 | 15/12/2022 | 2 - Two    | 1 - One      |

  
  Scenario Outline: Verifying the Valid Hotel Room with Mandatory Fields
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User should Entry Mandatory Details "<location>","<room_nos>","<CheckIn>","<CheckOut>" and "<adultsroom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"

    Examples: 
      | username      | password      | location  | room_nos | CheckIn    | CheckOut   | adultsroom |
      | subashsparrow | $parrowTrio10 | Melbourne | 2 - Two  | 14/12/2022 | 15/12/2022 | 2 - Two    |

  
  Scenario Outline: Verifying the Search hotel with Invalid Check-IN and Check-OUT Dates
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User should Search the Hotel Details "<location>","<hotels>","<room_type>","<room_nos>","<CheckIn>","<CheckOut>","<adultsroom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Error Message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username      | password      | location  | hotels         | room_type | room_nos | CheckIn    | CheckOut   | adultsroom | childrenRoom |
      | subashsparrow | $parrowTrio10 | Melbourne | Hotel Sunshine | Double    | 2 - Two  | 15/12/2023 | 14/12/2022 | 2 - Two    | 1 - One      |

  
  Scenario Outline: Verifying the Search hotel without entry fields
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User should select search button
    Then User should verify After Search Hotel Get the Error message "Please Select a Location"

    Examples: 
      | username      | password      |
      | subashsparrow | $parrowTrio10 |
