Feature: Contact Search
@cur
Scenario: Contact search with data excel sheet
Given I logged into suiteCRM
And I validate contacts with data in excel sheet "FirstSheet.xlsx" and "Sheet1"
Then I logout from application
