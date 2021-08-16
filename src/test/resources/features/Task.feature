Feature: Adding items to chart and order item

  Scenario Outline: Add two item delete one of them complete order
    When User navigates to laptops
    Then User clicks on a "<laptop model>"
#    And Click on add to chart
#    Then accept pop up
    Examples:
      | laptop model |
      | Sony vaio i7 |
#      |Dell |
