Feature: Test OrangeHRM
1)positivecase
2)negativecase
Background:
Given I should go to login page
@PostiveTesting
Scenario: To test valid login functionality
When Enter the username "<user>"
And Enter the password "<pass>"
And Click on login button
Then I should see the username as "Paul Collings"
Examples:
|user|pass|
|Admin|admin123|
@NegativeTesting
Scenario: To test invalid login functionality
When Enter the username "admin"
And Enter the password "admin"
And Click on login button
Then I should see the username as "Paul Collings"
