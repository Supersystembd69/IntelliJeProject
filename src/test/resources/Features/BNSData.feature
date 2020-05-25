

Feature: BNS login form fillup
  Useer wants to create new account in BNS webpage

  @BNSPOMData
  Scenario Outline: Creating new account in BNS webpage
    Given user on BNS signup webpage
    When user enter "<FirstName>" in firstname textbox, "<LastName>" in lastname textbox, "<Email>" in email textbox,"<Password>" in password textbox,"<Phone>" in phonenumber textbox
    And userselect "<Month>" from month dropdownbox , "<Day>" from day dropdownbox, "<Year>" from year dropdownbox
    And user select on "<Gender>" from gender radio button
    And user click on Submit button
    Then user should see meaasge "<Message>"

    Examples:
      | FirstName | LastName  | Email             | Password | Phone        | Month | Day | Year | Gender | Message             |
      | Ataur     | Tarafder  | ata@yahoo.com     | der45    | 347-444-2890 | Jun   |  20 | 2001 | Male   | Submitted Form Data |
      | Parveen   | Sultana   | parveen@gmail.com | par4532  | 356-453-9099 | May   |  10 | 2002 | Female | Submitted Form Data |
      | Anwar     | Hossain   | anwar@yahoo.com   | anw3456  | 769-266-5221 | Feb   |   9 | 2003 | Male   | Submitted Form Data |
      | Ataur     | Tarafder  | ata@yahoo.com     | der45    | 347-444-2890 | Jun   |  20 | 2001 | Male   | Submitted Form Data |
      | Farhana   | Zaman     | farhana@gmail.com | far4532  | 356-453-9098 | May   |  30 | 2006 | Female | Submitted Form Data |
      | Jamal     | Chowdhury | jamal@yahoo.com   | jaml456  | 769-266-5224 | Feb   |  19 | 2004 | Male   | Submitted Form Data |
