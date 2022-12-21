@login
Feature: Verfying Adactin Hotel Login Details

  Scenario Outline: Verifying Adactin Hotel Login Valid
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User Should Verify After Login Success Message "Hello subashsparrow!"

    Examples: 
      | username      | password      |
      | subashsparrow | $parrowTrio10 |

  Scenario Outline: Verifying Adactin Hotel Enter Key
    Given User is on the Adactin Page
    When User should Perform Login "<username>" and "<password>" with Enter Key
    Then User Should Verify After Login Success Message "Hello subashsparrow!"

    Examples: 
      | username      | password      |
      | subashsparrow | $parrowTrio10 |

  Scenario Outline: Verifying Adactin Hotel Invalid Credentials
    Given User is on the Adactin Page
    When User Should Perform Login "<username>" and "<password>"
    Then User should Verify Login with Invalid Login Credential and Error Message contains "Invalid Login details"

    Examples: 
      | username | password  |
      | vikram   | vicky@123 |
