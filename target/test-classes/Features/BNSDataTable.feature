@BNSPOMDataTable
Feature: BNS signup form fillup functionality
  Useer wants to create a new account on BNS webpage

  Scenario: Creating new account signup on BNS webpage
    Given User is on BNS signup webpage
    When User will enter data from following table
      | FirstName | LastName | Email         | Password | Phone        |
      | Ataur     | Tarafder | ata@yahoo.com | der45    | 347-444-2890 |
    And User will select data from following table
      | Month | May  |
      | Day   |   20 |
      | Year  | 2001 |
    And User will select from following table
      | Gender |
      | Male   |
    And User will click on Submit button
    Then User should get meaasge as following table
      | Message             |
      | Submitted Form Data |
