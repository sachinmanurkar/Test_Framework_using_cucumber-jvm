
    Feature:
      As a user
      I want to be able to add new clients in the system


    Scenario: Sign-up a new user with datatable example
    Given the user is on landing page
    When she choose to sign up
    And she provides the her details as follows:
    | firstName | lastName | email             | password |
    | Sukesh    | Kumar    | validemail@aq.com | password |
    And she signs-up
    Then she should be logged in to the application