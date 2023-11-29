Feature: Visit Website



   Scenario: Visit Amber
        Given Visit Amber Home Page
        When Search for accommodation in London
        Then Filter search results for Room Type Private Room and Sharing Private Bathroom
        And Open the second search result in a new tab
        And Switch to the tab and assert the title and location of the property