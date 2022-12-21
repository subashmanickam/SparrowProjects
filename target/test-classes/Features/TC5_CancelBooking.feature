@CancelHotel
Feature: Verifying the Adactin Hotel Cancel Order ID

  
  Scenario Outline: Verifying to Cancel the Generated Order Id
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User should Search the Hotel Details "<location>","<hotels>","<room_type>","<room_nos>","<CheckIn>","<CheckOut>","<adultsroom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"
    And User Should perform select hotel with click continue button
    Then User Should Verify After Select Hotel Get Success Message "Book A Hotel"
    And User Should Book the Hotel "<first_name>","<last_name>" and "<address>"
      | cc_num           | cc_type          | cc_exp_month | cc_exp_year | cc_cvv |
      | 9876543215671234 | American Express | June         |        2022 |    897 |
      | 9876543215671234 | VISA             | July         |        2021 |    897 |
      | 9876543215671234 | Master Card      | May          |        2020 |    897 |
      | 9876543215671234 | Other            | April        |        2019 |    897 |
    Then User Should Verify After Book the Hotel Get Success Message "Booking Confirmation" and Save the Generated OrderId
    And User Should Cancel the Generated Order Id
    Then User Should Verify After Cancel Order Id Get success Message "The booking has been cancelled."

    Examples: 
      | username      | password      | location  | hotels         | room_type | room_nos | CheckIn    | CheckOut   | adultsroom | childrenRoom | first_name | last_name | address      |
      | subashsparrow | $parrowTrio10 | Melbourne | Hotel Sunshine | Double    | 2 - Two  | 14/12/2022 | 15/12/2022 | 2 - Two    | 1 - One      | Subash     | Manickam  | Thiru Colony |

  
  Scenario Outline: Verifying to Cancel Existing the Order Id
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"
    And User Should Cancel the Existing Order Id "<orderId>"
    Then User Should Verify After Cancel Order Id Get success Message "The booking has been cancelled."

    Examples: 
      | username      | password      | orderId    |
      | subashsparrow | $parrowTrio10 | 6JV35Q0BNF |
