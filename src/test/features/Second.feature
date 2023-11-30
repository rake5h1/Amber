Feature: Bonus Task


   Scenario: Check Cities
   Given Visit Amber
   When Click on Search bar
   Then Iterate over the counties tab
   And Verify list of popular cities is different for all countries and no city is repeated or mentioned in more than 1 country tab.Ignore All section