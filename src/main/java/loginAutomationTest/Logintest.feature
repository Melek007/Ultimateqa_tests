
@tag
Feature: login
  @tag2
  Scenario Outline: login with correct email and password
    Given user go to <url>
    When user login <email> <password>
    Then write <message>

    Examples: 
      | url | email  | password | message  |
      | https://ultimateqa.com/automation | eric@test.com | 12345678 | success |
     
