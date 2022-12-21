@SelectHotel
Feature: Verifying the Select Adactin Hotel Room

  
  Scenario Outline: Verifying the Select Hotel Room
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User should Search the Hotel Details "<location>","<hotels>","<room_type>","<room_nos>","<CheckIn>","<CheckOut>","<adultsroom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"
    And User Should perform select hotel with click continue button
    Then User Should Verify After Select Hotel Get Success Message "Book A Hotel"

    Examples: 
      | username      | password      | location  | hotels         | room_type | room_nos | CheckIn    | CheckOut   | adultsroom | childrenRoom |
      | subashsparrow | $parrowTrio10 | Melbourne | Hotel Sunshine | Double    | 2 - Two  | 14/12/2022 | 15/12/2022 | 2 - Two    | 1 - One      |

  
  Scenario Outline: Verifying the Select Hotel Without any Fields
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User should Search the Hotel Details "<location>","<hotels>","<room_type>","<room_nos>","<CheckIn>","<CheckOut>","<adultsroom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"
    And User Should perform  without selecting hotel field and enter continue button
    Then User should Verify After clicking continue button Error Message "Please Select a Hotel"

    Examples: 
      | username      | password      | location  | hotels         | room_type | room_nos | CheckIn    | CheckOut   | adultsroom | childrenRoom |
      | subashsparrow | $parrowTrio10 | Melbourne | Hotel Sunshine | Double    | 2 - Two  | 14/12/2022 | 15/12/2022 | 2 - Two    | 1 - One      |
