Feature: Web login
  Scenario Outline: Login to homepage with user incorrect
    Given User go to page
    When User login into application with <email> and <password>
    Then Home page is populated with "* Incorrect username or password"
    And Close app
  Examples:
    |email|password|
    |"thanhhoa592000@gmail.com"|"12345"|
    |"kimsamule592000@gmail.com"|"ìakahf"|

