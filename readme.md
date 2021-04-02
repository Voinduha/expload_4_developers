# Tests for expload.com website
## UI tests:
- Main page tests
- Page should be opened from direct page
- Console log should not have any errors
- Header should have text "SDK COMPONENTS"
- Page should change language EN/RU
- Download readme file from GitHub and search for the desired text in it

## Technology Stack
- Java
- Gradle
- Junit5 + multi-threading runs
- Selenide (Automation framework based on Selenium)
- Selenoid (Virtualization system based on the docker)
- Allure (+Allure test ops) test report system.
- Jira integration / Jenkins integration
- Telegram piechart reporting library integration

## Screenshots
#### *Jenkins - it is an open source automation server:*
![selenoid_screenshot](https://user-images.githubusercontent.com/62853995/113439241-daf83380-93f2-11eb-9abb-b4d2564aa1e4.png)


#### *Allure Report - it is a flexible lightweight test report tool:*
![selenoid_screenshot](src/test/resources/images/allure_with_steps.png)


![selenoid_screenshot](src/test/resources/images/allure_with_steps1.png)


![selenoid_screenshot](src/test/resources/images/allure_test_body.png)


#### *Allure TestOps - it is a TMS that allows to manage all test related stuff in one place:*
![selenoid_screenshot](src/test/resources/images/AllureTestOpsFull.png)


#### *Telegram notifications:*
![selenoid_screenshot](src/test/resources/images/telegram.png)