@Test
Feature: Validate Delivery related functionalities in the mobile app

  @Regression
  Scenario: Verify delivery list details by Swipedown and SwipeUp
    Given Launch the mobile application
    When SwipeDown in the Delivery list screen
    Then verify the customer description displayed in the top position after swipe down
    When SwipeUp in the Delivery list screen
    Then verify the customer description displayed in the top position after swipe Up
  