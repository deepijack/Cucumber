Feature: Login
Scenario: Successful login with valid credentials
 Given User Lanch chrome browser
 When User opens URL "http://admin-demo.nopcommerce.com/login"
 And User enters Email as "admin@yourstore.com" and Password as "admin"
 And Click on login
 Then Page Title should be "Dashboard / nopCommerce administration"
 When User click on log out link
 Then Page Title should be "Your store. Login"
 And close browser
 
 Scenario Outline: Login data Driven
 Given User Lanch chrome browser
 When User opens URL "http://admin-demo.nopcommerce.com/login"
 And User enters Email as "<email>" and Password as "<password>"
 And Click on login
 Then Page Title should be "Dashboard / nopCommerce administration"
 When User click on log out link
 Then Page Title should be "Your store. Login"
 And close browser
 
 Examples:
 | email | password |
 | admin@yourstore.com | admin |
 | admin1@yourstore.com |  admin123 |