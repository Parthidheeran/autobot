$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/mobileAutomation.feature");
formatter.feature({
  "name": "Validate Delivery related functionalities in the mobile app",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "name": "Verify delivery list details by Swipedown and SwipeUp",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Launch the mobile application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.DeliveryList.launch_the_mobile_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "SwipeDown in the Delivery list screen",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.DeliveryList.SwipeDown_in_the_Delivery_list_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the customer description displayed in the top position after swipe down",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.DeliveryList.verify_the_customer_description_displayed_in_the_top_position_after_swipe_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "SwipeUp in the Delivery list screen",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.DeliveryList.SwipeUp_in_the_Delivery_list_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the customer description displayed in the top position after swipe Up",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.DeliveryList.verify_the_customer_description_displayed_in_the_top_position_after_swipe_Up()"
});
formatter.result({
  "status": "passed"
});
});