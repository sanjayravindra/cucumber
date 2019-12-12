Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario Outline: Login as a authenticated user
    Given user is  on homepage
    When Enter the Username as "<name>" and Password as "<Pass>"
    Then success message is displayed

    Examples: 
      | name    | Pass    |
      | learner | learner |
