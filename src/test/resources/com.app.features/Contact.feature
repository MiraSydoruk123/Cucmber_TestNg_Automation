Feature: Contact creation
@run
Scenario Outline: contact creation and validation
    Given I logged into SuiteCRM
    And I go to create contact page
    Then I create new contact using "<prefix>" "<firstName>" "<lastName>" "<phoneNumber>" "<title>"
    And I validate all created contact info "<prefix>" "<firstName>" "<lastName>" "<phoneNumber>" "<title>"
    Then I logout from application

    
Examples:
| prefix | firstName | lastName | phoneNumber | title |
|Prof.   |   James   |    Bond  | 7733334400  | 007   |
|Dr.     |   House   |    Gred  | 2747344400  | Brain |



    
    