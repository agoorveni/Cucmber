Feature: To check the functionality of demao page


Background:
Given Lauch the required browser

Scenario: To check the firstname and lastname

When Need to lauch the demo application
When Need to click go to registration
When Need to pass value in firstname
And Need the pass the value in lastname
Then Need to close the Demo browser

Scenario Outline: To check the demo page with various inputs

When Have to lauch the demosite application
When Have to clicj the registration button
When Has to pass the value in "<firstname>" first name
When Has to pass the value in "<lastname>" last name
When Need to pass the value in "<email>" email field
When Need to add mobile "<mobile>" number
When Need to selct the country
When Pass the city "<cityname>" value
When Pass the "<messeage>" message
When Need to click the send button
Then Need to close the browser application

Examples:
|firstname|lastname|email|mobile|cityname|messeage|
|Veni|AN|aggorveni@gmail.com|1234567890|Chennai|Hello|
|Vani|ANM|swathrai@gmail.com|098765432|Tirupatti|Gud moring|