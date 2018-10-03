# Katalon Studio Samples: Tips and Tricks
Katalon Studio is a free and easy-to-use automated functional and regression testing platform. It provides users the ability to implement full automated testing solutions for their application projects with minimal engineering and programming skill requirements.
______
The **tips-and-tricks** project contains some tips and tricks when using Katalon Studio to support users handling some specfic cases.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine.
### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Internet access
- Application Under Test (AUT):
     + Jira cloud: https://katalon.atlassian.net/
     + Account: demo@katalon.com/8eml3nBz19rJ6kP8oCYK
### Setting Up
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this repository
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
### Executing a Test Case
![Execute a simple test case](https://github.com/katalon-studio-samples/tips-and-tricks/blob/master/Tutorials/Figures/Execute%20test%20case%20tips%20and%20tricks.png?raw=true)
1. Expand the Test Cases structure, where all the test cases are stored.
2. Select the test case you want to execute
3. Choose the browser for executing the test case

At the end of this README, you will find additional ways to execute automation test cases. 

## Test Cases
### Tips and Tricks
- Configuration
     - Get browser type and version
     - Get Operation System
     - Start IE with pre-configued options
     - Get screen resolution
     - Start Firefox at default homepage
     - Start Chrome maximized and hide info bars
- Execution
     - Custom Remote Execution
     - Force stop execution a test case
- Cookies
     - Set cookies for browsers
- UI Tests
     - Locators
          - Create test object at runtime
          - Change locator type of a test object at runtime
          - Update locator value of a test object at runtime
     - Datepicker
          - Custom keyword handling jqueryui datepicker at http://jqueryui.com/datepicker/
          - Note: remember to select profile **jqueryui** before running the test case
- Mobile Tests
     - iOS
          - Swipe action on iOS device using guestures
- Test Data
     - Write data into Excel file at runtime during test execution

## See Also
Update configurations for integration: [Jira](https://docs.katalon.com/x/7oEw), [Katalon Analytics](https://docs.katalon.com/x/KRhO)

Katalon Documentation: http://docs.katalon.com/, especially some [Tips and Tricks](https://docs.katalon.com/x/PgXR) to run a successful automation test. 

Katalon Forum: https://forum.katalon.com/

Katalon Business Support: https://www.katalon.com/support-service-options/
